package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.ChamCongNhanVien;
import entity.NhanVienHanhChanh;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ChamCongHanhChanh_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<ChamCongNhanVien> getDanhSachPhongBan() {
        List<ChamCongNhanVien> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM ChamCongNhanVien";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsChamCong.add(new ChamCongNhanVien(resultSet.getString(1),
                        new NhanVienHanhChanh(resultSet.getString(5)), resultSet.getDate(2),
                        resultSet.getBoolean(3),
                        resultSet.getInt(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }
}
