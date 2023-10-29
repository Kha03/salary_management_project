package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.TrinhDo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TrinhDo_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<TrinhDo> getDanhSachTrinhDo() {
        List<TrinhDo> dsTrinhDo = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM TrinhDo";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsTrinhDo.add(new TrinhDo(resultSet.getString(1), resultSet.getString(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsTrinhDo;
    }
}
