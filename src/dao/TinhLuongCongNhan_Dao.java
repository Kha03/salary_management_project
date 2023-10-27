package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.LuongCongNhan;
import entity.NhanVienSanXuat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TinhLuongCongNhan_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<LuongCongNhan> getDanhSachLuong() {
        List<LuongCongNhan> dsLuong = new ArrayList<>();
        ChamCongSanPham_Dao chamCongSanPham_Dao = new ChamCongSanPham_Dao();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM LuongCongNhan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsLuong.add(new LuongCongNhan(resultSet.getString(1),
                        new NhanVienSanXuat(resultSet.getString(2), "", resultSet.getString(3)),
                        resultSet.getString(4),
                        chamCongSanPham_Dao.getChamCongSanPhamTheoThang(resultSet.getString(4)),
                        resultSet.getFloat(5),
                        resultSet.getFloat(6),
                        resultSet.getFloat(7))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsLuong;
    }
}
