package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.ChamCongNhanVien;
import entity.ChamCongSanPham;
import entity.NhanVienSanXuat;
import entity.SanPham;
import entity.CongDoan;
import entity.PhanCongSanXuat;
import java.text.SimpleDateFormat;
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

    public String layMaTuDongChamCong() {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        String maChamCong = null;
        String sql = "DECLARE @NewIDCCSP VARCHAR(7)"
                + " SET @NewIDCCSP = dbo.IDCCSP()"
                + " SELECT @NewIDCCSP ";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                maChamCong = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maChamCong;
    }

    public boolean themChamCong(PhanCongSanXuat phanCongSanXuat, String maNhanVien) {
        try {
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO ChamCongSanPham VALUES (?,?,NULL,?,?,?,?,?,?)");
            smt.setString(1, layMaTuDongChamCong());
            smt.setString(2, maNhanVien);
            smt.setString(3, dinhDangNgay.format(phanCongSanXuat.getNgayPhanCong()));
            smt.setString(4, phanCongSanXuat.getSanPham().getMaSanPham());
            smt.setString(5, phanCongSanXuat.getCongDoan().getMaCongDoan());
            smt.setFloat(6, phanCongSanXuat.getCongDoan().getGiaTien());
            smt.setInt(7, 0);
            smt.setFloat(8, 0);
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean xoaChamCong(String maChamCong) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DELETE FROM ChamCongSanPham"
                    + " WHERE maNhanVien = '" + maChamCong + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
