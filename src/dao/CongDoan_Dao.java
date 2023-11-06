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
}
