package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.LuongCongNhan;
import entity.NhanVienSanXuat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TinhLuongCongNhan_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<LuongCongNhan> getDanhSachLuong() {
        List<LuongCongNhan> dsLuong = new ArrayList<>();
        ChamCongSanPham_Dao chamCongSanPham_Dao = new ChamCongSanPham_Dao();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT * FROM LuongCongNhan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsLuong.add(new LuongCongNhan(resultSet.getString(1),
                        new NhanVienSanXuat(resultSet.getString(2), "", resultSet.getString(3)),
                        resultSet.getString(4),
                        chamCongSanPham_Dao.getChamCongSanPhamTheoLuong(resultSet.getString(1)),
                        resultSet.getFloat(5),
                        resultSet.getFloat(6),
                        resultSet.getFloat(7))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsLuong;
    }

    public List<LuongCongNhan> getDanhSachLuongTheoPhanXuongVaThang(String maPhanXuong, String thang) {
        List<LuongCongNhan> dsLuong = new ArrayList<>();
        ChamCongSanPham_Dao chamCongSanPham_Dao = new ChamCongSanPham_Dao();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT LuongCongNhan.* FROM LuongCongNhan"
                    + " INNER JOIN NhanVienSanXuat ON LuongCongNhan.maNhanVienSanXuat = NhanVienSanXuat.maNhanVienSanXuat"
                    + " INNER JOIN PhanXuong ON NhanVienSanXuat.maPhanXuong = PhanXuong.maPhanXuong"
                    + " WHERE PhanXuong.maPhanXuong = '" + maPhanXuong + "'"
                    + " AND LuongCongNhan.thang = '" + thang + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                dsLuong.add(new LuongCongNhan(resultSet.getString(1),
                        new NhanVienSanXuat(resultSet.getString(2), "", resultSet.getString(3)),
                        resultSet.getString(4),
                        chamCongSanPham_Dao.getChamCongSanPhamTheoLuong(resultSet.getString(1)),
                        resultSet.getFloat(5),
                        resultSet.getFloat(6),
                        resultSet.getFloat(7))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsLuong;
    }

    public List<Object[]> layBaoCaoTongLuongPhanXuongTheoThang(String thang) {
        ArrayList<Object[]> obArr = new ArrayList<Object[]>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT PhanXuong.maPhanXuong,PhanXuong.tenPhanXuong,"
                    + " SUM(LuongCongNhan.luongSanPham),"
                    + " SUM(LuongCongNhan.tienPhuCap),"
                    + " SUM(LuongCongNhan.luongThucLanh)"
                    + " FROM LuongCongNhan"
                    + " INNER JOIN NhanVienSanXuat ON LuongCongNhan.maNhanVienSanXuat = NhanVienSanXuat.maNhanVienSanXuat"
                    + " INNER JOIN PhanXuong ON NhanVienSanXuat.maPhanXuong = PhanXuong.maPhanXuong"
                    + " WHERE LuongCongNhan.thang = '" + thang + "'"
                    + " GROUP BY PhanXuong.maPhanXuong,PhanXuong.tenPhanXuong;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Object[] ob = new Object[5];
                ob[0] = resultSet.getString(1);
                ob[1] = resultSet.getString(2);
                ob[2] = resultSet.getFloat(3);
                ob[3] = resultSet.getFloat(4);
                ob[4] = resultSet.getFloat(5);
                obArr.add(ob);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obArr;
    }

    public boolean taoBangLuong(LuongCongNhan luongCongNhan) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO LuongCongNhan VALUES (?,?,?,?,?,?,?)");
            smt.setString(1, luongCongNhan.getMaLuong());
            smt.setString(2, luongCongNhan.getNhanVienSanXuat().getMaNhanVienSanXuat());
            smt.setString(3, luongCongNhan.getNhanVienSanXuat().getHoVaTen());
            smt.setString(4, luongCongNhan.getThangLap());
            smt.setFloat(5, luongCongNhan.getTongLuongSanPham());
            smt.setFloat(6, luongCongNhan.getTienPhuCap());
            smt.setFloat(7, luongCongNhan.getTongLuong());
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
            smt = connection.prepareStatement("DELETE FROM LuongCongNhan"
                    + " WHERE maLuongCongNhan = '" + maLuong + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
