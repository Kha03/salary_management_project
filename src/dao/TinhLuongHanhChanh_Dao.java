package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.LuongHanhChanh;
import entity.NhanVienHanhChanh;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TinhLuongHanhChanh_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<LuongHanhChanh> getDanhSachPhongBan() {
        List<LuongHanhChanh> dsLuong = new ArrayList<>();
        ChamCongHanhChanh_Dao chamCongHanhChanh_Dao = new ChamCongHanhChanh_Dao();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM LuongHanhChinh";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsLuong.add(new LuongHanhChanh(resultSet.getString(1),
                        new NhanVienHanhChanh(resultSet.getString(2)),
                        chamCongHanhChanh_Dao.getDanhSachChamCongNhanVienTheoThang(resultSet.getString(3)),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getFloat(5),
                        resultSet.getFloat(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9),
                        resultSet.getFloat(10),
                        resultSet.getFloat(10) )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsLuong;
    }
}