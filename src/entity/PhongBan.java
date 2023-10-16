
package entity;
import java.util.*;
/**
 *
 * @author ACER
 */
public class PhongBan {
    private String maPhongBan;
    private String tenPhongBan;
    private NhanVienHanhChanh truongPhong;
    private List<NhanVienHanhChanh> nhanVien;

    public PhongBan(String maPhongBan, String tenPhongBan, NhanVienHanhChanh truongPhong, List<NhanVienHanhChanh> nhanVien) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.truongPhong = truongPhong;
        this.nhanVien = nhanVien;
    }

    

    public PhongBan() {
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public NhanVienHanhChanh getTruongPhong() {
        return truongPhong;
    }

    public void setNhanVien(List<NhanVienHanhChanh> nhanVien) {
        this.nhanVien = nhanVien;
    }

    
    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public void setTruongPhong(NhanVienHanhChanh truongPhong) {
        this.truongPhong = truongPhong;
    }

    public List<NhanVienHanhChanh> getNhanVien() {
        return nhanVien;
    }

   
    @Override
    public String toString() {
        return "PhongBan{" + "maPhongBan=" + maPhongBan + ", tenPhongBan=" + tenPhongBan + ", truongPhong=" + truongPhong + ", nhanVien=" + nhanVien + '}';
    }
    
}
