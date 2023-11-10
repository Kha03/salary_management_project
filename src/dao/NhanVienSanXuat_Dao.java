package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.NhanVienSanXuat;
import entity.PhanXuong;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienSanXuat_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<NhanVienSanXuat> getDanhSachNhanVienSanXuat() {
        List<NhanVienSanXuat> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVien.*,NhanVienSanXuat.maNhanVienSanXuat,"
                    + " TrinhDo.tenTrinhDo,CapBac.tenCapBac,NhanVienSanXuat.kinhNghiem,"
                    + " PhanXuong.maPhanXuong, PhanXuong.tenPhanXuong"
                    + " FROM NhanVienSanXuat JOIN NhanVien"
                    + " ON NhanVienSanXuat.maNhanVien = NhanVien.maNhanVien"
                    + " JOIN CapBac ON NhanVienSanXuat.maCapBac = CapBac.maCapBac"
                    + " JOIN PhanXuong ON NhanVienSanXuat.maPhanXuong = PhanXuong.maPhanXuong"
                    + " JOIN TrinhDo ON NhanVienSanXuat.maTrinhDo = TrinhDo.maTrinhDo;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsNhanVien.add(new NhanVienSanXuat(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getDate(3),
                        resultSet.getBoolean(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getDate(8),
                        resultSet.getString(9),
                        resultSet.getString(10),
                        resultSet.getString(11),
                        resultSet.getString(12),
                        new PhanXuong(resultSet.getString(13), resultSet.getString(14))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }

    public List<NhanVienSanXuat> getDanhSachNhanVienSanXuatTheoPhanXuong(String maPhanXuong) {
        List<NhanVienSanXuat> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVien.*,NhanVienSanXuat.maNhanVienSanXuat,"
                    + " TrinhDo.tenTrinhDo,CapBac.tenCapBac,NhanVienSanXuat.kinhNghiem,"
                    + " PhanXuong.maPhanXuong, PhanXuong.tenPhanXuong"
                    + " FROM NhanVienSanXuat JOIN NhanVien"
                    + " ON NhanVienSanXuat.maNhanVien = NhanVien.maNhanVien"
                    + " JOIN CapBac ON NhanVienSanXuat.maCapBac = CapBac.maCapBac"
                    + " JOIN PhanXuong ON NhanVienSanXuat.maPhanXuong = PhanXuong.maPhanXuong"
                    + " JOIN TrinhDo ON NhanVienSanXuat.maTrinhDo = TrinhDo.maTrinhDo"
                    + " WHERE PhanXuong.maPhanXuong = '" + maPhanXuong + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsNhanVien.add(new NhanVienSanXuat(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getDate(3),
                        resultSet.getBoolean(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getDate(8),
                        resultSet.getString(9),
                        resultSet.getString(10),
                        resultSet.getString(11),
                        resultSet.getString(12),
                        new PhanXuong(resultSet.getString(13), resultSet.getString(14))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }

    public boolean capNhatNhanVien(NhanVienSanXuat nVien) {
        try {
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE NhanVien"
                    + " SET"
                    + "    hoVaTen = ?,"
                    + "    ngaySinh = ?,"
                    + "    gioiTinh = ?,"
                    + "    diaChi = ?,"
                    + "    dienThoai = ?,"
                    + "    mail = ?,"
                    + "    ngayVaoLam = ?"
                    + " WHERE maNhanVien IN ("
                    + "    SELECT maNhanVien"
                    + "    FROM NhanVienSanXuat"
                    + "    WHERE maNhanVienSanXuat = ?);"
                    + " UPDATE NhanVienSanXuat"
                    + " SET"
                    + "    kinhNghiem = ?,"
                    + "    maTrinhDo = ?,"
                    + "    maPhanXuong = ?,"
                    + "    maCapBac = ?"
                    + " WHERE maNhanVienSanXuat = ?;");
            smt.setString(1, nVien.getHoVaTen());
            smt.setString(2, dinhDangNgay.format(nVien.getNgaySinh()));
            smt.setInt(3, nVien.isGioiTinh() ? 1 : 0);
            smt.setString(4, nVien.getDiaChi());
            smt.setString(5, nVien.getDienThoai());
            smt.setString(6, nVien.getEmail());
            smt.setString(7, dinhDangNgay.format(nVien.getNgayVaoLam()));
            smt.setString(8, nVien.getMaNhanVienSanXuat());
            smt.setString(9, nVien.getKinhNghiem());
            smt.setString(10, nVien.getTrinhDo());
            smt.setString(11, nVien.getPhanXuong().getMaPhanXuong());
            smt.setString(12, nVien.getcapBac());
            smt.setString(13, nVien.getMaNhanVienSanXuat());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public String layMaTuDongNhanVien() {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        String maNhanVien = null;
        String sql = "DECLARE @NewIDNVSX VARCHAR(7)"
                + " SET @NewIDNVSX = dbo.IDNVSX()"
                + " SELECT @NewIDNVSX ";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                maNhanVien = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maNhanVien;
    }

    public boolean themNhanVien(NhanVienSanXuat nVien) {
        try {
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DECLARE @NewIDNV VARCHAR(6)"
                    + "SET @NewIDNV = dbo.IDNV()"
                    + "INSERT INTO NhanVien VALUES (@NewIDNV,?,?,?,?,?,?,?) "
                    + "INSERT INTO NhanVienSanXuat VALUES (?,?,?,?,@NewIDNV,?)");
            smt.setString(1, nVien.getHoVaTen());
            smt.setString(2, dinhDangNgay.format(nVien.getNgaySinh()));
            smt.setInt(3, nVien.isGioiTinh() ? 1 : 0);
            smt.setString(4, nVien.getDiaChi());
            smt.setString(5, nVien.getDienThoai());
            smt.setString(6, nVien.getEmail());
            smt.setString(7, dinhDangNgay.format(nVien.getNgayVaoLam()));
            smt.setString(8, nVien.getMaNhanVienSanXuat());
            smt.setString(9, nVien.getKinhNghiem());
            smt.setString(10, nVien.getTrinhDo());
            smt.setString(11, nVien.getPhanXuong().getMaPhanXuong());
            smt.setString(12, nVien.getcapBac());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
//chưa xong

    public boolean xoaNhanVienSanXuat(String maNhanVien) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DECLARE @maNhanVien VARCHAR(255)"
                    + " SELECT @maNhanVien = maNhanVien"
                    + " FROM NhanVienSanXuat"
                    + " WHERE maNhanVienSanXuat = '" + maNhanVien + "'"
                    + " DELETE FROM ChamCongSanPham"
                    + " WHERE maNhanVienSanXuat =  '" + maNhanVien + "'"
                    + " UPDATE LuongCongNhan"
                    + " SET"
                    + " maNhanVienSanXuat = NULL"
                    + "  WHERE maNhanVienSanXuat = '" + maNhanVien + "'"
                    + " UPDATE PhanXuong"
                    + " SET"
                    + " toTruong = NULL"
                    + " WHERE toTruong = '" + maNhanVien + "'"
                    + " DELETE FROM NhanVienSanXuat_PhanCongSanXuat"
                    + " WHERE maNhanVienSanXuat =  '" + maNhanVien + "'"
                    + " DELETE FROM NhanVienSanXuat"
                    + " WHERE maNhanVienSanXuat =  '" + maNhanVien + "'"
                    + " DELETE FROM NhanVien_PhuCap"
                    + " WHERE maNhanVien =  @maNhanVien"
                    + " DELETE FROM NhanVien"
                    + " WHERE maNhanVien = @maNhanVien;"
            );
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
