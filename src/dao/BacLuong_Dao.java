package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.BacLuong;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class BacLuong_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<BacLuong> getBacLuongTheoCapBac(String maCapBac) {
        List<BacLuong> dsBacLuong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM BacLuong WHERE maCapBac ='"+maCapBac+"'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsBacLuong.add(new BacLuong(resultSet.getString(1), resultSet.getInt(2),
                resultSet.getFloat(3),
                resultSet.getFloat(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsBacLuong;
    }

  
}
