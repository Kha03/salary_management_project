package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.PhongBan;
import entity.NhanVienHanhChanh;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class PhongBan_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<PhongBan> getDanhSachPhongBan() {
        List<PhongBan> dsPhongBan = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT PhongBan.maPhongBan, PhongBan.tenPhongBan, NhanVien.ho, NhanVien.ten FROM PhongBan LEFT JOIN NhanVienHanhChinh ON PhongBan.truongPhong = NhanVienHanhChinh.maNhanVienHanhChinh LEFT JOIN NhanVien ON NhanVienHanhChinh.maNhanVien = NhanVien.maNhanVien";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsPhongBan.add(new PhongBan(resultSet.getString(1), resultSet.getString(2),new NhanVienHanhChanh("",resultSet.getString(3),resultSet.getString(4))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhongBan;
    }
}
