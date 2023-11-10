package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.SanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SanPham_Dao {

    public List<SanPham> getDanhSachSanPham() {
        List<SanPham> dsSanPham = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM SanPham";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsSanPham.add(new SanPham(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4), resultSet.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSanPham;
    }

    public List<SanPham> getDanhSachSanPhamTheoMaHd(String maHopDong) {
        List<SanPham> dsSanPham = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM SanPham"
                    + " WHERE maHopDong ='" + maHopDong + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsSanPham.add(new SanPham(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4), resultSet.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsSanPham;
    }

    public String layMaTuDongSanPham() {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        String maSanPham = null;
        String sql = "DECLARE @NewIDSP VARCHAR(5)"
                + " SET @NewIDSP = dbo.IDSP()"
                + " SELECT @NewIDSP ";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                maSanPham = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maSanPham;
    }

    public boolean themSanPham(SanPham sanPham, String maHopDong) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO SanPham VALUES (?,?,?,?,?,?)");
            smt.setString(1, layMaTuDongSanPham());
            smt.setString(2, sanPham.getTenSanPham());
            smt.setFloat(3, sanPham.getDonGia());
            smt.setInt(4, sanPham.getSoLuong());
            smt.setString(5, sanPham.getDonViTinh());
            smt.setString(6, maHopDong);
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean capNhatSanPham(SanPham sanPham) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE SanPham"
                    + " SET"
                    + " tenSanPham = ?,"
                    + " donGia = ?,"
                    + " soLuong = ?,"
                    + " donViTinh = ?"
                    + " WHERE maSanPham = ?");
            smt.setString(1, sanPham.getTenSanPham());
            smt.setFloat(2, sanPham.getDonGia());
            smt.setInt(3, sanPham.getSoLuong());
            smt.setString(4, sanPham.getDonViTinh());
            smt.setString(5, sanPham.getMaSanPham());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean xoaSanPham(String maSanPham) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DELETE FROM SanPham"
                    + " WHERE maSanPham = '" + maSanPham + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
