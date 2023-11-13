package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.PhuCap;
import entity.NhanVien;
import entity.NhanVienHanhChanh;
import entity.NhanVienSanXuat;
import entity.PhanXuong;
import entity.PhongBan;
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

    public List<NhanVienHanhChanh> getDanhSachNhanVienPhuCapHc(String maPhuCap, String maPhongBan) {
        List<NhanVienHanhChanh> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVienHanhChinh.maNhanVienHanhChinh,"
                    + " NhanVienHanhChinh.maNhanVien, NhanVien.hoVaTen, PhongBan.tenPhongBan FROM NhanVien"
                    + " INNER JOIN NhanVien_PhuCap ON NhanVien.maNhanVien = NhanVien_PhuCap.maNhanVien"
                    + " INNER JOIN NhanVienHanhChinh ON NhanVienHanhChinh.maNhanVien = NhanVien.maNhanVien"
                    + " INNER JOIN PhongBan ON PhongBan.maPhongBan = NhanVienHanhChinh.maPhongBan"
                    + " WHERE PhongBan.maPhongBan = '" + maPhongBan + "' AND NhanVien_PhuCap.maPhuCap = '" + maPhuCap + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                NhanVienHanhChanh nv = new NhanVienHanhChanh(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
                nv.setPhongBan(new PhongBan("", resultSet.getString(4)));
                dsNhanVien.add(nv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }

    public List<NhanVienSanXuat> getDanhSachNhanVienPhuCapSx(String maPhuCap, String maPhanXuong) {
        List<NhanVienSanXuat> dsNhanVien = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT NhanVienSanXuat.maNhanVienSanXuat,"
                    + " NhanVienSanXuat.maNhanVien, NhanVien.hoVaTen, PhanXuong.tenPhanXuong FROM NhanVien"
                    + " INNER JOIN NhanVien_PhuCap ON NhanVien.maNhanVien = NhanVien_PhuCap.maNhanVien"
                    + " INNER JOIN NhanVienSanXuat ON NhanVienSanXuat.maNhanVien = NhanVien.maNhanVien"
                    + " INNER JOIN PhanXuong ON PhanXuong.maPhanXuong = NhanVienSanXuat.maPhanXuong"
                    + " WHERE PhanXuong.maPhanXuong = '" + maPhanXuong + "' AND NhanVien_PhuCap.maPhuCap = '" + maPhuCap + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                NhanVienSanXuat nv = new NhanVienSanXuat(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
                nv.setPhanXuong(new PhanXuong("", resultSet.getString(4)));
                dsNhanVien.add(nv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
//    public List<PhuCap> getDanhSachPhuCapCoNhanVien() {
//        List<PhuCap> dsPhuCap = new ArrayList<>();
//        ConnectDB.getInstance();
//        Connection connection = ConnectDB.getConnection();
//        try {
//            String sql = "SELECT * FROM PhuCap";
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            while (resultSet.next()) {
//                //còn sai
//                dsPhuCap.add(new PhuCap(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), getDanhSachNhanVienPhuCap(resultSet.getString(1)), resultSet.getBoolean(4), resultSet.getString(5)));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return dsPhuCap;
//    }

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

    public boolean capNhatPhuCap(PhuCap phuCap) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE PhuCap"
                    + " SET"
                    + " tenPhuCap = ?,"
                    + " soTien = ?,"
                    + " coDinh = ?,"
                    + " thangHuong = ?"
                    + " WHERE maPhuCap = ?");
            smt.setString(1, phuCap.getTenPhuCap());
            smt.setFloat(2, phuCap.getSoTien());
            smt.setBoolean(3, phuCap.getCoDinh());
            smt.setString(4, phuCap.getThangHuong());
            smt.setString(5, phuCap.getMaPhuCap());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean xoaPhuCap(String maPhuCap) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DELETE FROM NhanVien_PhuCap"
                    + " WHERE maPhuCap = '" + maPhuCap + "'"
                    + " DELETE FROM PhuCap"
                    + " WHERE maPhuCap = '" + maPhuCap + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean themNhanVien(String maNhanVien, String maPhuCap) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO NhanVien_PhuCap VALUES (?,?)");
            smt.setString(1, maNhanVien);
            smt.setString(2, maPhuCap);
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean xoaNhanVien(String maNhanVien, String maPhuCap) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DELETE FROM NhanVien_PhuCap"
                    + " WHERE maNhanVien = '" + maNhanVien + "' AND"
                    + " maPhuCap = '" + maPhuCap + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
