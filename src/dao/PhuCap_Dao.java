package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.PhuCap;
import entity.NhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class PhuCap_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<PhuCap> getDanhSachPhuCap() {
        List<PhuCap> dsPhuCap = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM PhuCap";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsPhuCap.add(new PhuCap(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getBoolean(4), resultSet.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhuCap;
    }
    public List<NhanVien> getDanhSachNhanVienPhuCap(String maPhuCap) {
        List<NhanVien> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVien.* FROM NhanVien INNER JOIN NhanVien_PhuCap ON NhanVien.maNhanVien = NhanVien_PhuCap.maNhanVien WHERE NhanVien_PhuCap.maPhuCap = '"+maPhuCap+"'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //còn sai
                dsNhanVien.add(new NhanVien(resultSet.getString(1), 
                        resultSet.getString(2), 
                        resultSet.getDate(3), 
                        resultSet.getBoolean(4), 
                        resultSet.getString(5), 
                        resultSet.getString(6), 
                        resultSet.getString(7), 
                        resultSet.getDate(8)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
    public List<PhuCap> getDanhSachPhuCapCoNhanVien() {
        List<PhuCap> dsPhuCap = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM PhuCap";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsPhuCap.add(new PhuCap(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), getDanhSachNhanVienPhuCap(resultSet.getString(1)),resultSet.getBoolean(4), resultSet.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhuCap;
    }
}
