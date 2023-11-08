package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.PhongBan;
import entity.NhanVienHanhChanh;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class PhongBan_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<PhongBan> getDanhSachPhongBan() {
        List<PhongBan> dsPhongBan = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT PhongBan.maPhongBan,"
                    + " PhongBan.tenPhongBan,"
                    + " NhanVienHanhChinh.maNhanVienHanhChinh,"
                    + " NhanVien.hoVaTen FROM PhongBan LEFT JOIN NhanVienHanhChinh"
                    + " ON PhongBan.truongPhong = NhanVienHanhChinh.maNhanVienHanhChinh"
                    + " LEFT JOIN NhanVien ON NhanVienHanhChinh.maNhanVien = NhanVien.maNhanVien";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsPhongBan.add(new PhongBan(resultSet.getString(1), resultSet.getString(2), new NhanVienHanhChanh(resultSet.getString(3), "", resultSet.getString(4))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhongBan;
    }

    public String getMaTruongPhong(String maPhongBan) {
        String maTruongPhong = null;
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT truongPhong"
                    + " FROM PhongBan"
                    + " WHERE maPhongBan = '" + maPhongBan + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                maTruongPhong = resultSet.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maTruongPhong;
    }

    public void capNhatTruongPhong(String maNhanVien, String maPhongBan) {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE PhongBan"
                    + " SET"
                    + " truongPhong = ?"
                    + " WHERE maPhongBan= ?");
            smt.setString(1, maNhanVien);
            smt.setString(2, maPhongBan);
            smt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void capNhatTruongPhong(String maPhongBan) {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE PhongBan"
                    + " SET"
                    + " truongPhong = NULL"
                    + " WHERE maPhongBan= ?");
            smt.setString(1, maPhongBan);
            smt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String layMaTuDongPhongBan() {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        String maNhanVien = null;
        String sql = "DECLARE @NewIDPB VARCHAR(7)"
                + " SET @NewIDPB = dbo.IDPB()"
                + " SELECT @NewIDPB ";
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

    public boolean themPhongBan(String tenPhongBan) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO PhongBan VALUES (?,?,NULL)");
            smt.setString(1, layMaTuDongPhongBan());
            smt.setString(2, tenPhongBan);
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean capNhatPhongBan(PhongBan phongBan) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE PhongBan"
                    + " SET tenPhongBan = ?"
                    + " WHERE maPhongBan = ?");
            smt.setString(1, phongBan.getTenPhongBan());
            smt.setString(2, phongBan.getMaPhongBan());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean xoaPhongBan(String maPhongBan) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DELETE FROM PhongBan"
                    + " WHERE maPhongBan = '" + maPhongBan + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
