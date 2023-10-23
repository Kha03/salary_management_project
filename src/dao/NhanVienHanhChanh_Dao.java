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
public class NhanVienHanhChanh_Dao {

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
                dsNhanVien.add(new NhanVienHanhChanh(resultSet.getString(1),
                        resultSet.getString(2), 
                        resultSet.getDate(3), 
                        resultSet.getBoolean(4), 
                        resultSet.getString(5), 
                        resultSet.getString(6), 
                        resultSet.getString(7), 
                        resultSet.getDate(8), 
                        resultSet.getString(9), 
                        resultSet.getString(11), 
                        resultSet.getString(10), 
                        resultSet.getString(14), 
                        new PhongBan(resultSet.getString(15)), 
                        resultSet.getFloat(12), 
                        resultSet.getFloat(13)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
}
