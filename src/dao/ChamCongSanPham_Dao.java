package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.ChamCongSanPham;
import entity.NhanVienSanXuat;
import entity.SanPham;
import entity.CongDoan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ChamCongSanPham_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<ChamCongSanPham> getChamCongSanPham() {
        List<ChamCongSanPham> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT ChamCongSanPham.*, SanPham.tenSanPham, CongDoan.tenCongDoan FROM ChamCongSanPham INNER JOIN SanPham ON ChamCongSanPham.maSanPham = SanPham.maSanPham INNER JOIN CongDoan ON ChamCongSanPham.maCongDoan = CongDoan.maCongDoan;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsChamCong.add(new ChamCongSanPham(resultSet.getString(1),
                        new NhanVienSanXuat(resultSet.getString(2)),
                        new SanPham(resultSet.getString(5), resultSet.getString(10)),
                        resultSet.getDate(4),
                        new CongDoan(resultSet.getString(6), resultSet.getString(11)),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }

    public List<ChamCongSanPham> getChamCongSanPhamTheoThang(String thang) {
        List<ChamCongSanPham> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT ChamCongSanPham.*, SanPham.tenSanPham, CongDoan.tenCongDoan FROM ChamCongSanPham INNER JOIN SanPham ON ChamCongSanPham.maSanPham = SanPham.maSanPham INNER JOIN CongDoan ON ChamCongSanPham.maCongDoan = CongDoan.maCongDoan where ngayLamViec = '';";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsChamCong.add(new ChamCongSanPham(resultSet.getString(1),
                        new NhanVienSanXuat(resultSet.getString(2)),
                        new SanPham(resultSet.getString(5), resultSet.getString(10)),
                        resultSet.getDate(4),
                        new CongDoan(resultSet.getString(6), resultSet.getString(11)),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }
}
