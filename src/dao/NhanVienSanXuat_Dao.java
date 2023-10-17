package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.NhanVienHanhChanh;
import entity.PhongBan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienSanXuat_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<NhanVienHanhChanh> getDanhSachNhanVienHanhChanh() {
        List<NhanVienHanhChanh> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVien.*,NhanVienHanhChinh.maNhanVienHanhChinh,NhanVienHanhChinh.NgoaiNgu,NhanVienHanhChinh.ChucVu,NhanVienHanhChinh.luongCoBan,NhanVienHanhChinh.heSoLuong, CapBac.tenCapBac,PhongBan.tenPhongBan FROM NhanVienHanhChinh JOIN NhanVien ON NhanVienHanhChinh.maNhanVien = NhanVien.maNhanVien JOIN CapBac ON NhanVienHanhChinh.maCapBac = CapBac.maCapBac JOIN PhongBan ON NhanVienHanhChinh.maPhongBan = PhongBan.maPhongBan;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsNhanVien.add(new NhanVienHanhChanh(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDate(4), resultSet.getBoolean(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getDate(9), resultSet.getString(10), resultSet.getString(12), resultSet.getString(11), resultSet.getString(15), new PhongBan(resultSet.getString(16)), resultSet.getFloat(13), resultSet.getFloat(14)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
}