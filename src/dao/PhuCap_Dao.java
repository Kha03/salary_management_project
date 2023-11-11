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
            String sql = "SELECT NhanVien.* FROM NhanVien INNER JOIN NhanVien_PhuCap ON NhanVien.maNhanVien = NhanVien_PhuCap.maNhanVien WHERE NhanVien_PhuCap.maPhuCap = '" + maPhuCap + "'";
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
                dsPhuCap.add(new PhuCap(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), getDanhSachNhanVienPhuCap(resultSet.getString(1)), resultSet.getBoolean(4), resultSet.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhuCap;
    }

    public float layTienPhuCapHc(String maNhanVienHC, String thang) {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        float tienPhuCap = 0;
        try {
            String sql = "SELECT SUM(PhuCap.soTien) AS TongTienPhuCap"
                    + " FROM NhanVien_PhuCap"
                    + " INNER JOIN PhuCap ON NhanVien_PhuCap.maPhuCap = PhuCap.maPhuCap"
                    + " INNER JOIN NhanVienHanhChinh ON NhanVienHanhChinh.maNhanVien = NhanVien_PhuCap.maNhanVien"
                    + " WHERE NhanVienHanhChinh.maNhanVienHanhChinh = '" + maNhanVienHC + "' AND (PhuCap.coDinh = 'True' OR PhuCap.thangHuong = '" + thang + "')";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                tienPhuCap = resultSet.getFloat(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tienPhuCap;
    }

    public float layTienPhuCapSx(String maNhanVienSx, String thang) {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        float tienPhuCap = 0;
        try {
            String sql = "SELECT SUM(PhuCap.soTien) AS TongTienPhuCap"
                    + " FROM NhanVien_PhuCap"
                    + " INNER JOIN PhuCap ON NhanVien_PhuCap.maPhuCap = PhuCap.maPhuCap"
                    + " INNER JOIN NhanVienSanXuat ON NhanVienSanXuat.maNhanVien = NhanVien_PhuCap.maNhanVien"
                    + " WHERE NhanVienSanXuat.maNhanVienSanXuat = '" + maNhanVienSx + "' AND (PhuCap.coDinh = 'True' OR PhuCap.thangHuong = '" + thang + "')";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                tienPhuCap = resultSet.getFloat(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tienPhuCap;
    }

    public String layMaTuDongPhuCap() {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        String maPhuCap = null;
        String sql = "DECLARE @NewIDPC VARCHAR(4)"
                + " SET @NewIDPC = dbo.IDPC()"
                + " SELECT @NewIDPC ";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                maPhuCap = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maPhuCap;
    }

    public boolean themPhuCap(PhuCap phuCap) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO PhuCap VALUES (?,?,?,?,?)");
            smt.setString(1, layMaTuDongPhuCap());
            smt.setString(2, phuCap.getTenPhuCap());
            smt.setFloat(3, phuCap.getSoTien());
            smt.setBoolean(4, phuCap.getCoDinh());
            smt.setString(5, phuCap.getThangHuong());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
