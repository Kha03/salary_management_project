package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.NhanVienHanhChanh;
import entity.PhongBan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienHanhChanh_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<NhanVienHanhChanh> getDanhSachNhanVienHanhChanh() {
        List<NhanVienHanhChanh> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVien.*,NhanVienHanhChinh.maNhanVienHanhChinh,NhanVienHanhChinh.NgoaiNgu,NhanVienHanhChinh.ChucVu,NhanVienHanhChinh.luongCoBan,NhanVienHanhChinh.heSoLuong, CapBac.tenCapBac,PhongBan.maPhongBan,PhongBan.tenPhongBan FROM NhanVienHanhChinh JOIN NhanVien ON NhanVienHanhChinh.maNhanVien = NhanVien.maNhanVien JOIN CapBac ON NhanVienHanhChinh.maCapBac = CapBac.maCapBac JOIN PhongBan ON NhanVienHanhChinh.maPhongBan = PhongBan.maPhongBan;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsNhanVien.add(new NhanVienHanhChanh(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getDate(3),
                        resultSet.getBoolean(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getDate(8),
                        resultSet.getString(9),
                        resultSet.getString(11),
                        resultSet.getString(10),
                        resultSet.getString(14),
                        new PhongBan(resultSet.getString(15), resultSet.getString(16)),
                        resultSet.getFloat(12),
                        resultSet.getFloat(13)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }

    public List<NhanVienHanhChanh> getDanhSachNhanVienHanhChanhTheoPhongBan(String maPhongBan) {
        List<NhanVienHanhChanh> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVien.*,NhanVienHanhChinh.maNhanVienHanhChinh,NhanVienHanhChinh.NgoaiNgu,NhanVienHanhChinh.ChucVu,NhanVienHanhChinh.luongCoBan,NhanVienHanhChinh.heSoLuong, CapBac.tenCapBac, PhongBan.maPhongBan, PhongBan.tenPhongBan FROM NhanVienHanhChinh JOIN NhanVien ON NhanVienHanhChinh.maNhanVien = NhanVien.maNhanVien JOIN CapBac ON NhanVienHanhChinh.maCapBac = CapBac.maCapBac JOIN PhongBan ON NhanVienHanhChinh.maPhongBan = PhongBan.maPhongBan WHERE PhongBan.maPhongBan = '" + maPhongBan + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsNhanVien.add(new NhanVienHanhChanh(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getDate(3),
                        resultSet.getBoolean(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getDate(8),
                        resultSet.getString(9),
                        resultSet.getString(11),
                        resultSet.getString(10),
                        resultSet.getString(14),
                        new PhongBan(resultSet.getString(15), resultSet.getString(16)),
                        resultSet.getFloat(12),
                        resultSet.getFloat(13)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }

    public boolean capNhatNhanVien(NhanVienHanhChanh nVien) {
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
                    + "    FROM NhanVienHanhChinh"
                    + "    WHERE maNhanVienHanhChinh = ?);"
                    + " UPDATE NhanVienHanhChinh"
                    + " SET"
                    + "    NgoaiNgu = ?,"
                    + "    ChucVu = ?,"
                    + "    luongCoBan = ?,"
                    + "    heSoLuong = ?,"
                    + "    maCapBac = ?,"
                    + "    maPhongBan = ?"
                    + " WHERE maNhanVienHanhChinh = ?;");
            smt.setString(1, nVien.getHoVaTen());
            smt.setString(2, dinhDangNgay.format(nVien.getNgaySinh()));
            smt.setInt(3, nVien.isGioiTinh() ? 1 : 0);
            smt.setString(4, nVien.getDiaChi());
            smt.setString(5, nVien.getDienThoai());
            smt.setString(6, nVien.getEmail());
            smt.setString(7, dinhDangNgay.format(nVien.getNgayVaoLam()));
            smt.setString(8, nVien.getMaNhanVienHanhChanh());
            smt.setString(9, nVien.getNgoaiNgu());
            smt.setString(10, nVien.getChucVu());
            smt.setFloat(11, nVien.getLuongCoBan());
            smt.setFloat(12, nVien.getHeSoLuong());
            smt.setString(13, nVien.getCapBac());
            smt.setString(14, nVien.getPhongBan().getMaPhongBan());
            smt.setString(15, nVien.getMaNhanVienHanhChanh());
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
        String sql = "DECLARE @NewIDNVHC VARCHAR(7)"
                + " SET @NewIDNVHC = dbo.IDNVHC()"
                + " SELECT @NewIDNVHC ";
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

    public boolean themNhanVien(NhanVienHanhChanh nVien) {
        try {
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DECLARE @NewIDNV VARCHAR(6)"
                    + "SET @NewIDNV = dbo.IDNV()"
                    + "INSERT INTO NhanVien VALUES (@NewIDNV,?,?,?,?,?,?,?) "
                    + "INSERT INTO NhanVienHanhChinh VALUES (?,?,?,?,?,?,?,@NewIDNV)");
            smt.setString(1, nVien.getHoVaTen());
            smt.setString(2, dinhDangNgay.format(nVien.getNgaySinh()));
            smt.setInt(3, nVien.isGioiTinh() ? 1 : 0);
            smt.setString(4, nVien.getDiaChi());
            smt.setString(5, nVien.getDienThoai());
            smt.setString(6, nVien.getEmail());
            smt.setString(7, dinhDangNgay.format(nVien.getNgayVaoLam()));
            smt.setString(8, nVien.getMaNhanVienHanhChanh());
            smt.setString(9, nVien.getNgoaiNgu());
            smt.setString(10, nVien.getChucVu());
            smt.setFloat(11, nVien.getLuongCoBan());
            smt.setFloat(12, nVien.getHeSoLuong());
            smt.setString(13, nVien.getCapBac());
            smt.setString(14, nVien.getPhongBan().getMaPhongBan());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean xoaNhanVienHanhChanh(String maNhanVien) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DECLARE @maNhanVien VARCHAR(255)"
                    + " SELECT @maNhanVien = maNhanVien"
                    + " FROM NhanVienHanhChinh"
                    + " WHERE maNhanVienHanhChinh = '" + maNhanVien + "'"
                    + " UPDATE ChamCongNhanVien"
                    + " SET"
                    + " maNhanVienHanhChinh = NULL"
                    + " WHERE maNhanVienHanhChinh = '" + maNhanVien + "'"
                    + " UPDATE LuongHanhChinh"
                    + " SET"
                    + " maNhanVienHanhChinh = NULL"
                    + "  WHERE maNhanVienHanhChinh = '" + maNhanVien + "'"
                    + " UPDATE PhongBan"
                    + " SET"
                    + " truongPhong = NULL"
                    + " WHERE truongPhong = '" + maNhanVien + "'"
                    + " DELETE FROM NhanVienHanhChinh"
                    + " WHERE maNhanVienHanhChinh =  '" + maNhanVien + "'"
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
