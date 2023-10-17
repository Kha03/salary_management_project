package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.NhanVienSanXuat;
import entity.PhanXuong;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class PhongBan_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<PhongBan> getDanhSachNhanVienHanhChanh() {
        List<NhanVienSanXuat> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVien.*,NhanVienSanXuat.maNhanVienSanXuat,TrinhDo.tenTrinhDo,CapBac.tenCapBac,NhanVienSanXuat.kinhNghiem, PhanXuong.tenPhanXuong FROM NhanVienSanXuat JOIN NhanVien ON NhanVienSanXuat.maNhanVien = NhanVien.maNhanVien JOIN CapBac ON NhanVienSanXuat.maCapBac = CapBac.maCapBac JOIN PhanXuong ON NhanVienSanXuat.maPhanXuong = PhanXuong.maPhanXuong JOIN TrinhDo ON NhanVienSanXuat.maTrinhDo = TrinhDo.maTrinhDo;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsNhanVien.add(new NhanVienSanXuat(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDate(4), resultSet.getBoolean(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getDate(9), resultSet.getString(10), resultSet.getString(12), resultSet.getString(11), resultSet.getString(15), new PhanXuong(resultSet.getString(16))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
}
