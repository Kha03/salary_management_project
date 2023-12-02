package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.LuongHanhChanh;
import entity.NhanVienHanhChanh;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TinhLuongHanhChanh_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<LuongHanhChanh> getDanhSachLuong() {
        List<LuongHanhChanh> dsLuong = new ArrayList<>();
        ChamCongHanhChanh_Dao chamCongHanhChanh_Dao = new ChamCongHanhChanh_Dao();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM LuongHanhChinh";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsLuong.add(new LuongHanhChanh(resultSet.getString(1),
                        new NhanVienHanhChanh(resultSet.getString(2), "", resultSet.getString(3)),
                        chamCongHanhChanh_Dao.getDanhSachChamCongNhanVienTheoLuong(resultSet.getString(1)),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getFloat(6),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getFloat(10),
                        resultSet.getFloat(11),
                        resultSet.getFloat(12))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsLuong;
    }

    public List<LuongHanhChanh> getDanhSangLuongTheoPhongBanVaThang(String maPhongBan, String thang) {
        List<LuongHanhChanh> dsLuong = new ArrayList<>();
        ChamCongHanhChanh_Dao chamCongHanhChanh_Dao = new ChamCongHanhChanh_Dao();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT LuongHanhChinh.* FROM LuongHanhChinh"
                    + " INNER JOIN NhanVienHanhChinh ON LuongHanhChinh.maNhanVienHanhChinh = NhanVienHanhChinh.maNhanVienHanhChinh"
                    + " INNER JOIN PhongBan ON NhanVienHanhChinh.maPhongBan = PhongBan.maPhongBan"
                    + " WHERE PhongBan.maPhongBan = '" + maPhongBan + "'"
                    + " AND LuongHanhChinh.thang = '" + thang + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsLuong.add(new LuongHanhChanh(resultSet.getString(1),
                        new NhanVienHanhChanh(resultSet.getString(2), "", resultSet.getString(3)),
                        chamCongHanhChanh_Dao.getDanhSachChamCongNhanVienTheoLuong(resultSet.getString(1)),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getFloat(6),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getInt(9),
                        resultSet.getFloat(10),
                        resultSet.getFloat(11),
                        resultSet.getFloat(12))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsLuong;
    }

    public List<Object[]> layBaoCaoTongLuongPhongBanTheoThang(String thang) {
        ArrayList<Object[]> obArr = new ArrayList<Object[]>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT PhongBan.maPhongBan,PhongBan.tenPhongBan,"
                    + " SUM(LuongHanhChinh.luongCoBan),"
                    + " SUM(LuongHanhChinh.tienPhuCap),"
                    + " SUM(LuongHanhChinh.tienTangCa),"
                    + " SUM(LuongHanhChinh.luongThucLanh)"
                    + " FROM LuongHanhChinh"
                    + " INNER JOIN NhanVienHanhChinh ON LuongHanhChinh.maNhanVienHanhChinh = NhanVienHanhChinh.maNhanVienHanhChinh"
                    + " INNER JOIN PhongBan ON NhanVienHanhChinh.maPhongBan = PhongBan.maPhongBan"
                    + " WHERE LuongHanhChinh.thang = '" + thang + "'"
                    + " GROUP BY PhongBan.maPhongBan,PhongBan.tenPhongBan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Object[] ob = new Object[6];
                ob[0] = resultSet.getString(1);
                ob[1] = resultSet.getString(2);
                ob[2] = resultSet.getFloat(3);
                ob[3] = resultSet.getFloat(4);
                ob[4] = resultSet.getFloat(5);
                ob[5] = resultSet.getFloat(6);
                obArr.add(ob);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obArr;
    }

    public boolean taoBangLuong(LuongHanhChanh luongHanhChanh) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO LuongHanhChinh VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            smt.setString(1, luongHanhChanh.getMaLuong());
            smt.setString(2, luongHanhChanh.getNhanVienHanhChanh().getMaNhanVienHanhChanh());
            smt.setString(3, luongHanhChanh.getNhanVienHanhChanh().getHoVaTen());
            smt.setString(4, luongHanhChanh.getThangLap());
            smt.setString(5, luongHanhChanh.getChucVu());
            smt.setFloat(6, luongHanhChanh.getHeSoLuong());
            smt.setFloat(7, luongHanhChanh.getLuongCoBan());
            smt.setInt(8, luongHanhChanh.getSoNgayCongChuan());
            smt.setInt(9, luongHanhChanh.getNgayCongThucTe());
            smt.setFloat(10, luongHanhChanh.getTienPhuCap());
            smt.setFloat(11, luongHanhChanh.getTienTangCa());
            smt.setFloat(12, luongHanhChanh.getTongLuong());

            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean xoaBangLuong(String maLuong) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("DELETE FROM LuongHanhChinh"
                    + " WHERE maLuongHanhChinh = '" + maLuong + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
