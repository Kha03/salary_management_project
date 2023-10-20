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
    public List<PhanXuong> getDanhSachPhongBan() {
        List<PhanXuong> dsPhanXuong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT PhanXuong.maPhanXuong, PhanXuong.tenPhanXuong, NhanVien.ho, NhanVien.ten FROM PhanXuong LEFT JOIN NhanVienSanXuat ON PhanXuong.toTruong = NhanVienSanXuat.maNhanVienSanXuat LEFT JOIN NhanVien ON NhanVienSanXuat.maNhanVien = NhanVien.maNhanVien";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsPhanXuong.add(new PhanXuong(resultSet.getString(1), resultSet.getString(2),new NhanVienSanXuat("",resultSet.getString(3),resultSet.getString(4))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhanXuong;
    }
}
