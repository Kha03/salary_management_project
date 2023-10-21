package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.ChamCongNhanVien;
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
                        new ArrayList<ChamCongNhanVien>(),
                        resultSet.getString(3),
                        new CongDoan(resultSet.getString(6), resultSet.getString(11)),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9))
                        );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsLuong;
    }
}
