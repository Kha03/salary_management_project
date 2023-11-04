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

    public List<SanPham> getDanhSachSanPham() {
        List<SanPham> dsSanPham = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM SanPham";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsSanPham.add(new SanPham(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4), resultSet.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSanPham;
    }

    public List<SanPham> getDanhSachSanPhamTheoMaHd(String maHopDong) {
        List<SanPham> dsSanPham = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM SanPham"
                    + " WHERE maHopDong ='" + maHopDong + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsSanPham.add(new SanPham(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4), resultSet.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSanPham;
    }

 
}
