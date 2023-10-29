package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.PhanXuong;
import entity.NhanVienSanXuat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class PhanXuong_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<PhanXuong> getDanhSachPhanXuong() {
        List<PhanXuong> dsPhanXuong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT PhanXuong.maPhanXuong,"
                    + " PhanXuong.tenPhanXuong,"
                    + " NhanVienSanXuat.maNhanVienSanXuat,"
                    + " NhanVien.hoVaten FROM PhanXuong LEFT JOIN NhanVienSanXuat"
                    + " ON PhanXuong.toTruong = NhanVienSanXuat.maNhanVienSanXuat"
                    + " LEFT JOIN NhanVien ON NhanVienSanXuat.maNhanVien = NhanVien.maNhanVien";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsPhanXuong.add(new PhanXuong(resultSet.getString(1), resultSet.getString(2), new NhanVienSanXuat(resultSet.getString(3), "", resultSet.getString(4))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhanXuong;
    }

    public String getMaToTruong(String maPhanXuong) {
        String maToTruong = null;
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT toTruong"
                    + " FROM PhanXuong"
                    + " WHERE maPhanXuong = '" + maPhanXuong + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                maToTruong = resultSet.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maToTruong;
    }

    public void capNhatToTruong(String maNhanVien, String maPhanXuong) {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE PhanXuong"
                    + " SET"
                    + " toTruong = ?"
                    + " WHERE maPhanXuong= ?");
            smt.setString(1, maNhanVien);
            smt.setString(2, maPhanXuong);
            smt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void capNhatToTruong(String maPhanXuong) {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE PhanXuong"
                    + " SET"
                    + " toTruong = NULL"
                    + " WHERE maPhanXuong= ?");
            smt.setString(1, maPhanXuong);
            smt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
