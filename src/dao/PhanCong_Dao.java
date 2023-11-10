package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.PhanCongSanXuat;
import entity.CongDoan;
import entity.NhanVienSanXuat;
import entity.PhanXuong;
import entity.SanPham;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class PhanCong_Dao {

    public List<PhanCongSanXuat> getDanhSachPhanCong() {
        List<PhanCongSanXuat> dsPhanCongSanXuat = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT PhanCongSanXuat.*, SanPham.tenSanPham,"
                    + " PhanXuong.tenPhanXuong, CongDoan.tenCongDoan FROM PhanCongSanXuat"
                    + " INNER JOIN SanPham ON PhanCongSanXuat.maSanPham = SanPham.maSanPham"
                    + " INNER JOIN PhanXuong ON PhanCongSanXuat.maPhanXuong = PhanXuong.maPhanXuong"
                    + " INNER JOIN CongDoan ON PhanCongSanXuat.maCongDoan = CongDoan.maCongDoan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsPhanCongSanXuat.add(new PhanCongSanXuat(resultSet.getString(1),
                        getDanhSachNhanVienTheoPhanCong(resultSet.getString(1)),
                        new SanPham(resultSet.getString(4), resultSet.getString(6)), resultSet.getDate(2),
                        new CongDoan(resultSet.getString(3), resultSet.getString(8)),
                        new PhanXuong(resultSet.getString(5), resultSet.getString(7), null)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhanCongSanXuat;
    }

    public List<PhanCongSanXuat> getDanhSachPhanCongTheoNgay(Date ngayPhanCong) {
        List<PhanCongSanXuat> dsPhanCongSanXuat = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "SELECT PhanCongSanXuat.*, SanPham.tenSanPham,"
                    + " PhanXuong.tenPhanXuong, CongDoan.tenCongDoan FROM PhanCongSanXuat"
                    + " INNER JOIN SanPham ON PhanCongSanXuat.maSanPham = SanPham.maSanPham"
                    + " INNER JOIN PhanXuong ON PhanCongSanXuat.maPhanXuong = PhanXuong.maPhanXuong"
                    + " INNER JOIN CongDoan ON PhanCongSanXuat.maCongDoan = CongDoan.maCongDoan"
                    + " WHERE ngayPhanCong = '" + dinhDangNgay.format(ngayPhanCong) + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsPhanCongSanXuat.add(new PhanCongSanXuat(resultSet.getString(1),
                        getDanhSachNhanVienTheoPhanCong(resultSet.getString(1)),
                        new SanPham(resultSet.getString(4), resultSet.getString(6)), resultSet.getDate(2),
                        new CongDoan(resultSet.getString(3), resultSet.getString(8)),
                        new PhanXuong(resultSet.getString(5), resultSet.getString(7), null)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhanCongSanXuat;
    }

    public List<NhanVienSanXuat> getDanhSachNhanVienTheoPhanCong(String maPhanCong) {
        List<NhanVienSanXuat> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVienSanXuat.maNhanVienSanXuat, NhanVien.hoVaTen FROM NhanVienSanXuat_PhanCongSanXuat"
                    + " JOIN NhanVienSanXuat ON NhanVienSanXuat.maNhanVienSanXuat = NhanVienSanXuat_PhanCongSanXuat.maNhanVienSanXuat"
                    + " JOIN NhanVien ON NhanVien.maNhanVien = NhanVienSanXuat.maNhanVien"
                    + " WHERE maPhanCong = '" + maPhanCong + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsNhanVien.add(new NhanVienSanXuat(resultSet.getString(1), "", resultSet.getString(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }

    public String layMaTuDongPhanCong() {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        String maPhanCong = null;
        String sql = "DECLARE @NewIDPCSX VARCHAR(5)"
                + " SET @NewIDPCSX = dbo.IDPCSX()"
                + " SELECT @NewIDPCSX ";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                maPhanCong = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maPhanCong;
    }

    public boolean themPhanCong(PhanCongSanXuat phanCongSanXuat) {
        try {
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO PhanCongSanXuat VALUES (?,?,?,?,?)");
            smt.setString(1, phanCongSanXuat.getMaPhanCong());
            smt.setString(2, dinhDangNgay.format(phanCongSanXuat.getNgayPhanCong()));
            smt.setString(3, phanCongSanXuat.getCongDoan().getMaCongDoan());
            smt.setString(4, phanCongSanXuat.getSanPham().getMaSanPham());
            smt.setString(5, phanCongSanXuat.getPhanXuong().getMaPhanXuong());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean themNhanVienVaoPhanCong(String maNhanVien, String maPhanCong) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO NhanVienSanXuat_PhanCongSanXuat"
                    + " VALUES (?,?)");
            smt.setString(1, maNhanVien);
            smt.setString(2, maPhanCong);
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean xoaPhanCong(String maPhanCong) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DELETE FROM NhanVienSanXuat_PhanCongSanXuat"
                    + " WHERE maPhanCong = '" + maPhanCong + "'"
                    + " DELETE FROM PhanCongSanXuat"
                    + " WHERE maPhanCong = '" + maPhanCong + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
