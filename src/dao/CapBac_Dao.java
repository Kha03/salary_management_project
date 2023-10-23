package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.CapBac;
import entity.BacLuong;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CapBac_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<CapBac> getDanhSachCapBac() {
        List<CapBac> dsCapBac = new ArrayList<>();
        BacLuong_Dao bacLuong_Dao = new BacLuong_Dao();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM CapBac";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsCapBac.add(new CapBac(resultSet.getString(1), resultSet.getString(2),
                bacLuong_Dao.getBacLuongTheoCapBac(resultSet.getString(1))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsCapBac;
    }

  
}
