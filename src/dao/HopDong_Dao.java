package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.HopDongSanXuat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HopDong_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<HopDongSanXuat> getDanhSachHopDong() {
        List<HopDongSanXuat> dsHopDong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM HopDongSanXuat";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsHopDong.add(new HopDongSanXuat(resultSet.getString(1), resultSet.getString(2), resultSet.getDate(3), resultSet.getDate(4), resultSet.getFloat(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsHopDong;
    }

    public String getTenHopDongTheoMaSanPham(String maSanPham) {
        String tenHopDong = null;
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT HopDongSanXuat.tenHopDong FROM SanPham"
                    + " JOIN HopDongSanXuat"
                    + " ON HopDongSanXuat.maHopDong = SanPham.maHopDong"
                    + " WHERE SanPham.maSanPham ='" + maSanPham + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                tenHopDong = resultSet.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tenHopDong;
    }

    public String layMaTuDongHopDong() {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        String maHopDong = null;
        String sql = "DECLARE @NewIDHDSX VARCHAR(5)"
                + " SET @NewIDHDSX = dbo.IDHDSX()"
                + " SELECT @NewIDHDSX ";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                maHopDong = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maHopDong;
    }

    public boolean themHopDong(HopDongSanXuat hopDongSanXuat) {
        try {
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO HopDongSanXuat VALUES (?,?,?,?,?)");
            smt.setString(1, layMaTuDongHopDong());
            smt.setString(2, hopDongSanXuat.getTenHopDong());
            smt.setString(3, dinhDangNgay.format(hopDongSanXuat.getNgayBatDau()));
            smt.setString(4, dinhDangNgay.format(hopDongSanXuat.getNgayKetThuc()));
            smt.setFloat(5, hopDongSanXuat.getGiaTien());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean capNhatHopDong(HopDongSanXuat hopDongSanXuat) {
        try {
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE HopDongSanXuat"
                    + " SET"
                    + " tenHopDong = ?,"
                    + " ngayBatDau = ?,"
                    + " ngayKetThuc = ?,"
                    + " giaTien = ?"
                    + " WHERE maHopDong = ?");
            smt.setString(1, hopDongSanXuat.getTenHopDong());
            smt.setString(2, dinhDangNgay.format(hopDongSanXuat.getNgayBatDau()));
            smt.setString(3, dinhDangNgay.format(hopDongSanXuat.getNgayKetThuc()));
            smt.setFloat(4, hopDongSanXuat.getGiaTien());
            smt.setString(5, hopDongSanXuat.getMaHopDong());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean xoaHopDong(String maHopDong) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DELETE FROM CongDoan"
                    + " WHERE maSanPham IN (SELECT maSanPham FROM SanPham WHERE maHopDong = '" + maHopDong + "')"
                    + " DELETE FROM SanPham"
                    + " WHERE maHopDong = '" + maHopDong + "'"
                    + " DELETE FROM HopDongSanXuat"
                    + " WHERE maHopDong = '" + maHopDong + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
