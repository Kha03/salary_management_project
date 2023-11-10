package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.CongDoan;
import entity.SanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CongDoan_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<CongDoan> getDanhSachCongDoan() {
        List<CongDoan> dsCongDoan = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM CongDoan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsCongDoan.add(new CongDoan(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsCongDoan;
    }

    public List<CongDoan> getDanhSachCongDoanTheoSanPham(String maSanPham) {
        List<CongDoan> dsCongDoan = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM CongDoan"
                    + " WHERE maSanPham ='" + maSanPham + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsCongDoan.add(new CongDoan(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsCongDoan;
    }

    public boolean capNhatTienDo(String maCongDoan, int tienDo) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE CongDoan"
                    + " SET tienDo = ?"
                    + " WHERE maCongDoan = ?");
            smt.setInt(1, tienDo);
            smt.setString(2, maCongDoan);
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public int layTienDo(String maCongDoan) {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        int tienDo = 0;
        try {
            String sql = "SELECT tienDo FROM CongDoan WHERE maCongDoan = '" + maCongDoan + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                tienDo = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tienDo;
    }

    public String layMaTuDongCongDoan() {
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        String maCongDoan = null;
        String sql = "DECLARE @NewIDCDSP VARCHAR(5)"
                + " SET @NewIDCDSP = dbo.IDCDSP()"
                + " SELECT @NewIDCDSP ";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                maCongDoan = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maCongDoan;
    }

    public boolean themCongDoan(CongDoan congDoan, String maSanPham) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO CongDoan VALUES (?,?,?,?,?)");
            smt.setString(1, layMaTuDongCongDoan());
            smt.setString(2, congDoan.getTenCongDoan());
            smt.setFloat(3, congDoan.getGiaTien());
            smt.setInt(4, congDoan.getTienDo());
            smt.setString(5, maSanPham);
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean capNhatCongDoan(CongDoan congDoan) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE CongDoan"
                    + " SET"
                    + " tenCongDoan = ?,"
                    + " giaTien = ?,"
                    + " tienDo = ?"
                    + " WHERE maCongDoan = ?");
            smt.setString(1, congDoan.getTenCongDoan());
            smt.setFloat(2, congDoan.getGiaTien());
            smt.setInt(3, congDoan.getTienDo());
            smt.setString(4, congDoan.getMaCongDoan());
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean xoaCongDoan(String maCongDoan) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DELETE FROM CongDoan"
                    + " WHERE maCongDoan = '" + maCongDoan + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
