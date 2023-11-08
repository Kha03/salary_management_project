package dao;

import java.sql.*;
import connect.ConnectDB;
import entity.ChamCongSanPham;
import entity.NhanVienSanXuat;
import entity.SanPham;
import entity.CongDoan;
import entity.PhanCongSanXuat;
import entity.PhanXuong;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class ChamCongSanPham_Dao {

    //lấy ra danh sách nhân viên hành chính
    public List<ChamCongSanPham> getChamCongSanPham() {
        List<ChamCongSanPham> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT ChamCongSanPham.*, SanPham.tenSanPham,"
                    + " CongDoan.tenCongDoan,"
                    + " PhanXuong.tenPhanXuong,"
                    + " NhanVien.hoVaTen"
                    + " FROM ChamCongSanPham INNER JOIN SanPham"
                    + " ON ChamCongSanPham.maSanPham = SanPham.maSanPham"
                    + " INNER JOIN CongDoan ON ChamCongSanPham.maCongDoan = CongDoan.maCongDoan"
                    + " INNER JOIN NhanVienSanXuat ON NhanVienSanXuat.maNhanVienSanXuat = ChamCongSanPham.maNhanVienSanXuat"
                    + " INNER JOIN NhanVien ON NhanVien.maNhanVien = NhanVienSanXuat.maNhanVien"
                    + " INNER JOIN PhanXuong ON PhanXuong.maPhanXuong = NhanVienSanXuat.maPhanXuong";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //còn sai
                NhanVienSanXuat nv = new NhanVienSanXuat(resultSet.getString(2), "", resultSet.getString(13));
                nv.setPhanXuong(new PhanXuong("", resultSet.getString(12)));
                dsChamCong.add(new ChamCongSanPham(resultSet.getString(1),
                        nv,
                        new SanPham(resultSet.getString(5), resultSet.getString(10)),
                        resultSet.getDate(4),
                        new CongDoan(resultSet.getString(6), resultSet.getString(11)),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }

    public List<ChamCongSanPham> getChamCongSanPhamTheoPhanXuong(String maPhanXuong, Date ngayCham) {
        List<ChamCongSanPham> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "SELECT ChamCongSanPham.*, SanPham.tenSanPham,"
                    + " CongDoan.tenCongDoan,"
                    + " PhanXuong.tenPhanXuong,"
                    + " NhanVien.hoVaTen"
                    + " FROM ChamCongSanPham INNER JOIN SanPham"
                    + " ON ChamCongSanPham.maSanPham = SanPham.maSanPham"
                    + " INNER JOIN CongDoan ON ChamCongSanPham.maCongDoan = CongDoan.maCongDoan"
                    + " INNER JOIN NhanVienSanXuat ON NhanVienSanXuat.maNhanVienSanXuat = ChamCongSanPham.maNhanVienSanXuat"
                    + " INNER JOIN NhanVien ON NhanVien.maNhanVien = NhanVienSanXuat.maNhanVien"
                    + " INNER JOIN PhanXuong ON PhanXuong.maPhanXuong = NhanVienSanXuat.maPhanXuong"
                    + " WHERE ngayLamViec = '" + dinhDangNgay.format(ngayCham) + "' AND"
                    + " PhanXuong.maPhanXuong = '" + maPhanXuong + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //còn sai
                NhanVienSanXuat nv = new NhanVienSanXuat(resultSet.getString(2), "", resultSet.getString(13));
                nv.setPhanXuong(new PhanXuong("", resultSet.getString(12)));
                dsChamCong.add(new ChamCongSanPham(resultSet.getString(1),
                        nv,
                        new SanPham(resultSet.getString(5), resultSet.getString(10)),
                        resultSet.getDate(4),
                        new CongDoan(resultSet.getString(6), resultSet.getString(11)),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }

    public List<ChamCongSanPham> getChamCongSanPhamTheoSanPham(String maSanPham, Date ngayCham) {
        List<ChamCongSanPham> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "SELECT ChamCongSanPham.*, SanPham.tenSanPham,"
                    + " CongDoan.tenCongDoan,"
                    + " PhanXuong.tenPhanXuong,"
                    + " NhanVien.hoVaTen"
                    + " FROM ChamCongSanPham INNER JOIN SanPham"
                    + " ON ChamCongSanPham.maSanPham = SanPham.maSanPham"
                    + " INNER JOIN CongDoan ON ChamCongSanPham.maCongDoan = CongDoan.maCongDoan"
                    + " INNER JOIN NhanVienSanXuat ON NhanVienSanXuat.maNhanVienSanXuat = ChamCongSanPham.maNhanVienSanXuat"
                    + " INNER JOIN NhanVien ON NhanVien.maNhanVien = NhanVienSanXuat.maNhanVien"
                    + " INNER JOIN PhanXuong ON PhanXuong.maPhanXuong = NhanVienSanXuat.maPhanXuong"
                    + " WHERE ngayLamViec = '" + dinhDangNgay.format(ngayCham) + "' AND"
                    + " ChamCongSanPham.maSanPham = '" + maSanPham + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //còn sai
                NhanVienSanXuat nv = new NhanVienSanXuat(resultSet.getString(2), "", resultSet.getString(13));
                nv.setPhanXuong(new PhanXuong("", resultSet.getString(12)));
                dsChamCong.add(new ChamCongSanPham(resultSet.getString(1),
                        nv,
                        new SanPham(resultSet.getString(5), resultSet.getString(10)),
                        resultSet.getDate(4),
                        new CongDoan(resultSet.getString(6), resultSet.getString(11)),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }

    public List<ChamCongSanPham> getChamCongSanPhamTheoPxSp(String maSanPham, String maPhanXuong, Date ngayCham) {
        List<ChamCongSanPham> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "SELECT ChamCongSanPham.*, SanPham.tenSanPham,"
                    + " CongDoan.tenCongDoan,"
                    + " PhanXuong.tenPhanXuong,"
                    + " NhanVien.hoVaTen"
                    + " FROM ChamCongSanPham INNER JOIN SanPham"
                    + " ON ChamCongSanPham.maSanPham = SanPham.maSanPham"
                    + " INNER JOIN CongDoan ON ChamCongSanPham.maCongDoan = CongDoan.maCongDoan"
                    + " INNER JOIN NhanVienSanXuat ON NhanVienSanXuat.maNhanVienSanXuat = ChamCongSanPham.maNhanVienSanXuat"
                    + " INNER JOIN NhanVien ON NhanVien.maNhanVien = NhanVienSanXuat.maNhanVien"
                    + " INNER JOIN PhanXuong ON PhanXuong.maPhanXuong = NhanVienSanXuat.maPhanXuong"
                    + " WHERE ngayLamViec = '" + dinhDangNgay.format(ngayCham) + "' AND"
                    + " PhanXuong.maPhanXuong = '" + maPhanXuong + "' AND"
                    + " ChamCongSanPham.maSanPham = '" + maSanPham + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //còn sai
                NhanVienSanXuat nv = new NhanVienSanXuat(resultSet.getString(2), "", resultSet.getString(13));
                nv.setPhanXuong(new PhanXuong("", resultSet.getString(12)));
                dsChamCong.add(new ChamCongSanPham(resultSet.getString(1),
                        nv,
                        new SanPham(resultSet.getString(5), resultSet.getString(10)),
                        resultSet.getDate(4),
                        new CongDoan(resultSet.getString(6), resultSet.getString(11)),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }

    public List<ChamCongSanPham> getChamCongSanPhamTheoNgay(Date ngayCham) {
        List<ChamCongSanPham> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "SELECT ChamCongSanPham.*, SanPham.tenSanPham,"
                    + " CongDoan.tenCongDoan,"
                    + " PhanXuong.tenPhanXuong,"
                    + " NhanVien.hoVaTen"
                    + " FROM ChamCongSanPham INNER JOIN SanPham"
                    + " ON ChamCongSanPham.maSanPham = SanPham.maSanPham"
                    + " INNER JOIN CongDoan ON ChamCongSanPham.maCongDoan = CongDoan.maCongDoan"
                    + " INNER JOIN NhanVienSanXuat ON NhanVienSanXuat.maNhanVienSanXuat = ChamCongSanPham.maNhanVienSanXuat"
                    + " INNER JOIN NhanVien ON NhanVien.maNhanVien = NhanVienSanXuat.maNhanVien"
                    + " INNER JOIN PhanXuong ON PhanXuong.maPhanXuong = NhanVienSanXuat.maPhanXuong"
                    + " WHERE ngayLamViec = '" + dinhDangNgay.format(ngayCham) + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //còn sai
                NhanVienSanXuat nv = new NhanVienSanXuat(resultSet.getString(2), "", resultSet.getString(13));
                nv.setPhanXuong(new PhanXuong("", resultSet.getString(12)));
                dsChamCong.add(new ChamCongSanPham(resultSet.getString(1),
                        nv,
                        new SanPham(resultSet.getString(5), resultSet.getString(10)),
                        resultSet.getDate(4),
                        new CongDoan(resultSet.getString(6), resultSet.getString(11)),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }

    public List<ChamCongSanPham> getChamCongSanPhamTheoLuong(String maLuong) {
        List<ChamCongSanPham> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "SELECT ChamCongSanPham.*, SanPham.tenSanPham,"
                    + " CongDoan.tenCongDoan,"
                    + " PhanXuong.tenPhanXuong,"
                    + " NhanVien.hoVaTen"
                    + " FROM ChamCongSanPham INNER JOIN SanPham"
                    + " ON ChamCongSanPham.maSanPham = SanPham.maSanPham"
                    + " INNER JOIN CongDoan ON ChamCongSanPham.maCongDoan = CongDoan.maCongDoan"
                    + " INNER JOIN NhanVienSanXuat ON NhanVienSanXuat.maNhanVienSanXuat = ChamCongSanPham.maNhanVienSanXuat"
                    + " INNER JOIN NhanVien ON NhanVien.maNhanVien = NhanVienSanXuat.maNhanVien"
                    + " INNER JOIN PhanXuong ON PhanXuong.maPhanXuong = NhanVienSanXuat.maPhanXuong"
                    + " WHERE maLuongCongNhan = '" + maLuong + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //còn sai
                NhanVienSanXuat nv = new NhanVienSanXuat(resultSet.getString(2), "", resultSet.getString(13));
                nv.setPhanXuong(new PhanXuong("", resultSet.getString(12)));
                dsChamCong.add(new ChamCongSanPham(resultSet.getString(1),
                        nv,
                        new SanPham(resultSet.getString(5), resultSet.getString(10)),
                        resultSet.getDate(4),
                        new CongDoan(resultSet.getString(6), resultSet.getString(11)),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChamCong;
    }

    public List<ChamCongSanPham> getChamCongSanPhamTheoThang(String thang, String maNhanVien) {
        List<ChamCongSanPham> dsChamCong = new ArrayList<>();
        ConnectDB.getInstance();
        Connection connection = ConnectDB.getConnection();
        String[] parts = thang.split("-");
        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);
        try {
            String sql = "SELECT ChamCongSanPham.*, SanPham.tenSanPham,"
                    + " CongDoan.tenCongDoan,"
                    + " PhanXuong.tenPhanXuong,"
                    + " NhanVien.hoVaTen"
                    + " FROM ChamCongSanPham INNER JOIN SanPham"
                    + " ON ChamCongSanPham.maSanPham = SanPham.maSanPham"
                    + " INNER JOIN CongDoan ON ChamCongSanPham.maCongDoan = CongDoan.maCongDoan"
                    + " INNER JOIN NhanVienSanXuat ON NhanVienSanXuat.maNhanVienSanXuat = ChamCongSanPham.maNhanVienSanXuat"
                    + " INNER JOIN NhanVien ON NhanVien.maNhanVien = NhanVienSanXuat.maNhanVien"
                    + " INNER JOIN PhanXuong ON PhanXuong.maPhanXuong = NhanVienSanXuat.maPhanXuong"
                    + " WHERE ChamCongSanPham.maNhanVienSanXuat = '" + maNhanVien + "'"
                    + " AND DATEPART(YEAR, ngayLamViec) = '" + year + "'"
                    + " AND DATEPART(MONTH, ngayLamViec) = '" + month + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                //còn sai
                NhanVienSanXuat nv = new NhanVienSanXuat(resultSet.getString(2), "", resultSet.getString(13));
                nv.setPhanXuong(new PhanXuong("", resultSet.getString(12)));
                dsChamCong.add(new ChamCongSanPham(resultSet.getString(1),
                        nv,
                        new SanPham(resultSet.getString(5), resultSet.getString(10)),
                        resultSet.getDate(4),
                        new CongDoan(resultSet.getString(6), resultSet.getString(11)),
                        resultSet.getFloat(7),
                        resultSet.getInt(8),
                        resultSet.getFloat(9))
                );
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
        String sql = "DECLARE @NewIDCCSP VARCHAR(7)"
                + " SET @NewIDCCSP = dbo.IDCCSP()"
                + " SELECT @NewIDCCSP ";
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

    public boolean themChamCong(PhanCongSanXuat phanCongSanXuat, String maNhanVien) {
        try {
            SimpleDateFormat dinhDangNgay = new SimpleDateFormat("yyyy-MM-dd");
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("INSERT INTO ChamCongSanPham VALUES (?,?,NULL,?,?,?,?,?,?)");
            smt.setString(1, layMaTuDongChamCong());
            smt.setString(2, maNhanVien);
            smt.setString(3, dinhDangNgay.format(phanCongSanXuat.getNgayPhanCong()));
            smt.setString(4, phanCongSanXuat.getSanPham().getMaSanPham());
            smt.setString(5, phanCongSanXuat.getCongDoan().getMaCongDoan());
            smt.setFloat(6, phanCongSanXuat.getCongDoan().getGiaTien());
            smt.setInt(7, 0);
            smt.setFloat(8, 0);
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean chamCongSanPham(String maChamCong, int soLuong, float luong) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE ChamCongSanPham"
                    + " SET soLuong = ?,"
                    + " tongLuongNgay = ?"
                    + " WHERE maChamCong = ?");
            smt.setInt(1, soLuong);
            smt.setFloat(2, luong);
            smt.setString(3, maChamCong);
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean capNhatChamCongMaLuong(String maLuong, String thang, String maNhanVien) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            String[] parts = thang.split("-");
            int month = Integer.parseInt(parts[0]);
            int year = Integer.parseInt(parts[1]);
            smt = connection.prepareStatement("UPDATE ChamCongSanPham"
                    + " SET maLuongCongNhan = ?"
                    + " WHERE maNhanVienSanXuat = '" + maNhanVien + "'"
                    + " AND DATEPART(YEAR, ngayLamViec) = '" + year + "'"
                    + " AND DATEPART(MONTH, ngayLamViec) = '" + month + "'");
            smt.setString(1, maLuong);
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    public boolean capNhatChamCongXoaMaLuong(String maLuong) {
        try {
            ConnectDB.getInstance();
            Connection connection = ConnectDB.getConnection();
            PreparedStatement smt = null;
            smt = connection.prepareStatement("UPDATE ChamCongSanPham"
                    + " SET"
                    + " maLuongCongNhan = NULL"
                    + " WHERE maLuongCongNhan = '" + maLuong + "'");
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
            smt = connection.prepareStatement("DELETE FROM ChamCongSanPham"
                    + " WHERE maChamCong = '" + maChamCong + "'");
            smt.executeUpdate();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
