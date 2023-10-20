package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.CongDoan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CongDoan_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<CongDoan> getDanhSachPhongBan() {
        List<CongDoan> dsCongDoan = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM CongDoan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsCongDoan.add(new CongDoan(resultSet.getString(1),resultSet.getString(2), resultSet.getFloat(3),resultSet.getInt(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsCongDoan;
    }
}
