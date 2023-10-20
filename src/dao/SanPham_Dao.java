package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.SanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SanPham_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<SanPham> getDanhSachPhongBan() {
        List<SanPham> dsSanPham = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM SanPham";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsSanPham.add(new SanPham(resultSet.getString(1),resultSet.getString(2), resultSet.getFloat(3),resultSet.getInt(4),resultSet.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSanPham;
    }
}
