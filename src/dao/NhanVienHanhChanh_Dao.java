package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.NhanVienHanhChanh;
import entity.PhongBan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public boolean setThemNhanVien(NhanVienHanhChanh nVien) {
        try {
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO NhanVien VALUES (?,?,?,?,?,?,?,?) "
                    + "INSERT INTO NhanVienHanhChinh VALUES (?,?,?,?,?,?,?,?)");
            smt.setString(1, nVien.getMaSo());
            smt.setString(2, nVien.getHoVaTen());
            smt.setString(3, dinhDangNgay.format(nVien.getNgaySinh()));
            smt.setInt(4, nVien.isGioiTinh()? 1:0);
            smt.setString(5, nVien.getDiaChi());
            smt.setString(6, nVien.getDienThoai());
            smt.setString(7, nVien.getEmail());
            smt.setString(8, dinhDangNgay.format(nVien.getNgayVaoLam()));
            smt.setString(9, nVien.getMaNhanVienHanhChanh());
            smt.setString(10, nVien.getNgoaiNgu());
            smt.setString(11, nVien.getChucVu());
            smt.setFloat(12, nVien.getLuongCoBan());
            smt.setFloat(13, nVien.getHeSoLuong());
            smt.setString(14, nVien.getCapBac());
            smt.setString(15, nVien.getPhongBan().getMaPhongBan());
            smt.setString(16, nVien.getMaSo());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

}
