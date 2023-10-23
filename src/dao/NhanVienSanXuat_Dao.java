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
public class NhanVienSanXuat_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<NhanVienSanXuat> getDanhSachNhanVienHanhChanh() {
        List<NhanVienSanXuat> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVien.*,NhanVienSanXuat.maNhanVienSanXuat,TrinhDo.tenTrinhDo,CapBac.tenCapBac,NhanVienSanXuat.kinhNghiem, PhanXuong.tenPhanXuong FROM NhanVienSanXuat JOIN NhanVien ON NhanVienSanXuat.maNhanVien = NhanVien.maNhanVien JOIN CapBac ON NhanVienSanXuat.maCapBac = CapBac.maCapBac JOIN PhanXuong ON NhanVienSanXuat.maPhanXuong = PhanXuong.maPhanXuong JOIN TrinhDo ON NhanVienSanXuat.maTrinhDo = TrinhDo.maTrinhDo;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsNhanVien.add(new NhanVienSanXuat(resultSet.getString(1), 
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
                        new PhanXuong(resultSet.getString(15))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
}
