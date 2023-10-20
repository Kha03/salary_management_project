package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.HopDongSanXuat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HopDong_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<HopDongSanXuat> getDanhSachPhongBan() {
        List<HopDongSanXuat> dsHopDong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM HopDongSanXuat";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsHopDong.add(new HopDongSanXuat(resultSet.getString(1),resultSet.getString(2),resultSet.getDate(3),resultSet.getDate(4),resultSet.getFloat(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsHopDong;
    }
}
