package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.PhanCongSanXuat;
import entity.CongDoan;
import entity.PhanXuong;
import entity.SanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class PhanCong_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<PhanCongSanXuat> getDanhSachPhongBan() {
        List<PhanCongSanXuat> dsPhanCongSanXuat = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT PhanCongSanXuat.*, SanPham.tenSanPham, PhanXuong.tenPhanXuong, CongDoan.tenCongDoan FROM PhanCongSanXuat INNER JOIN SanPham ON PhanCongSanXuat.maSanPham = SanPham.maSanPham INNER JOIN PhanXuong ON PhanCongSanXuat.maPhanXuong = PhanXuong.maPhanXuong INNER JOIN CongDoan ON PhanCongSanXuat.maCongDoan = CongDoan.maCongDoan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsPhanCongSanXuat.add(new PhanCongSanXuat(resultSet.getString(1),
                        new SanPham(resultSet.getString(4), resultSet.getString(6)), resultSet.getDate(2),
                        new CongDoan(resultSet.getString(3), resultSet.getString(8)),
                        new PhanXuong(resultSet.getString(5), resultSet.getString(7), null)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhanCongSanXuat;
    }
}
