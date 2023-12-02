package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.CongDoan;
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
            String sql = "SELECT"
                    + " c1.*,c2.maCongDoan,c2.tenCongDoan,c2.tienDo"
                    + " FROM"
                    + " CongDoan c1"
                    + " LEFT JOIN"
                    + " CongDoan c2 ON c1.congDoanTruoc = c2.maCongDoan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsCongDoan.add(new CongDoan(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4),
                        new CongDoan(resultSet.getString(7), resultSet.getString(8), 0, resultSet.getInt(9), null)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsCongDoan;
    }

    public CongDoan layCongDoanTruoc(String maCongDoan) {
        CongDoan congDoan = null;
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT"
                    + " c1.*,c2.maCongDoan,c2.tenCongDoan,c2.tienDo"
                    + " FROM"
                    + " CongDoan c1"
                    + " LEFT JOIN"
                    + " CongDoan c2 ON c1.congDoanTruoc = c2.maCongDoan"
                    + " WHERE c1.maCongDoan = '"+maCongDoan+"'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                congDoan = new CongDoan(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4),
                        new CongDoan(resultSet.getString(7), resultSet.getString(8), 0, resultSet.getInt(9), null));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return congDoan;
    }

    public List<CongDoan> getDanhSachCongDoanTheoSanPham(String maSanPham) {
        List<CongDoan> dsCongDoan = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT"
                    + " c1.*,c2.maCongDoan,c2.tenCongDoan,c2.tienDo"
                    + " FROM"
                    + " CongDoan c1"
                    + " LEFT JOIN"
                    + " CongDoan c2 ON c1.congDoanTruoc = c2.maCongDoan"
                    + " WHERE c1.maSanPham ='" + maSanPham + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //còn sai
                dsCongDoan.add(new CongDoan(resultSet.getString(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4),
                        new CongDoan(resultSet.getString(7), resultSet.getString(8), 0, resultSet.getInt(9), null)));
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
            smt = connection.prepareStatement("INSERT INTO CongDoan VALUES (?,?,?,?,?,?)");
            smt.setString(1, layMaTuDongCongDoan());
            smt.setString(2, congDoan.getTenCongDoan());
            smt.setFloat(3, congDoan.getGiaTien());
            smt.setInt(4, congDoan.getTienDo());
            smt.setString(5, maSanPham);
            if (congDoan.getCongDoanTruoc().getMaCongDoan().isEmpty()) {
                smt.setNull(6, 0);
            } else {
                smt.setString(6, congDoan.getCongDoanTruoc().getMaCongDoan());
            }
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
                    + " tienDo = ?,"
                    + " congDoanTruoc = ?"
                    + " WHERE maCongDoan = ?");
            smt.setString(1, congDoan.getTenCongDoan());
            smt.setFloat(2, congDoan.getGiaTien());
            smt.setInt(3, congDoan.getTienDo());
            smt.setString(4, congDoan.getCongDoanTruoc().getMaCongDoan());
            smt.setString(5, congDoan.getMaCongDoan());
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
