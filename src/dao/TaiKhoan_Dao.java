package dao;

import connect.ConnectDB;
import entity.TaiKhoan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan_Dao {

    public List<TaiKhoan> getTaiKhoan() {
        List<TaiKhoan> dsTaiKhoans = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM TaiKhoan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsTaiKhoans.add(new TaiKhoan(resultSet.getString(1), resultSet.getString(2), null));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsTaiKhoans;
    }
}
