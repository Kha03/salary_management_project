package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.ChamCongNhanVien;
import entity.NhanVienHanhChanh;
import entity.PhongBan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ChamCongHanhChanh_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<ChamCongNhanVien> getDanhSachChamCongNhanVien() {
        List<ChamCongNhanVien> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = " SELECT ChamCongNhanVien.*, NhanVien.hoVaTen,PhongBan.maPhongBan, PhongBan.tenPhongBan"
                    + " FROM ChamCongNhanVien"
                    + " JOIN NhanVienHanhChinh ON"
                    + " NhanVienHanhChinh.maNhanVienHanhChinh = ChamCongNhanVien.maNhanVienHanhChinh"
                    + " JOIN NhanVien ON"
                    + " NhanVien.maNhanVien = NhanVienHanhChinh.maNhanVien"
                    + " JOIN PhongBan ON"
                    + " NhanVienHanhChinh.maPhongBan = PhongBan.maPhongBan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                NhanVienHanhChanh nVien = new NhanVienHanhChanh(resultSet.getString(5),
                        "", resultSet.getString(7));
                nVien.setPhongBan(new PhongBan(resultSet.getString(8), resultSet.getString(9)));
                dsChamCong.add(new ChamCongNhanVien(resultSet.getString(1),
                        nVien, resultSet.getDate(2),
                        resultSet.getBoolean(3),
                        resultSet.getInt(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }

    public List<ChamCongNhanVien> getDanhSachChamCongNhanVienTheoThang(String thang) {
        List<ChamCongNhanVien> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM ChamCongNhanVien where ngayLamViec = '" + thang + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsChamCong.add(new ChamCongNhanVien(resultSet.getString(1),
                        new NhanVienHanhChanh(resultSet.getString(5)), resultSet.getDate(2),
                        resultSet.getBoolean(3),
                        resultSet.getInt(3)));
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
        String sql = "DECLARE @NewIDCCHC VARCHAR(7)"
                + " SET @NewIDCCHC = dbo.IDCCHC()"
                + " SELECT @NewIDCCHC ";
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

    public boolean themChamCong(ChamCongNhanVien chamCong) {
        try {
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO ChamCongNhanVien VALUES (?,?,?,?,?,NULL)");
            smt.setString(1, chamCong.getMaNgayCong());
            smt.setString(2, dinhDangNgay.format(chamCong.getNgayLamViec()));
            smt.setBoolean(3, chamCong.getTrangThai());
            smt.setInt(4, chamCong.getGioTangCa());
            smt.setString(5, chamCong.getNhanVienHanhChanh().getMaNhanVienHanhChanh());
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
            smt = connection.prepareStatement("DELETE FROM ChamCongNhanVien"
                    + " WHERE maChamCong =  '" + maChamCong + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
