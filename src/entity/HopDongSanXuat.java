
package entity;
import java.util.*;

/**
 *
 * @author ACER
 */
public class HopDongSanXuat {
    private String maHopDong;
    private String tenHopDong;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private List<SanPham> sanPham;
    private float giaTien;

    public HopDongSanXuat(String maHopDong, String tenHopDong, Date ngayBatDau, Date ngayKetThuc, List<SanPham> sanPham, float giaTien) {
        this.maHopDong = maHopDong;
        this.tenHopDong = tenHopDong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.sanPham = sanPham;
        this.giaTien = giaTien;
    }

    

    public HopDongSanXuat() {
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public void setTenHopDong(String tenHopDong) {
        this.tenHopDong = tenHopDong;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public String getMaHopDong() {
        return maHopDong;
    }

    public String getTenHopDong() {
        return tenHopDong;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public List<SanPham> getSanPham() {
        return sanPham;
    }

    public void setSanPham(List<SanPham> sanPham) {
        this.sanPham = sanPham;
    }

    

    public float getGiaTien() {
        return giaTien;
    }

    @Override
    public String toString() {
        return "HopDongSanXuat{" + "maHopDong=" + maHopDong + ", tenHopDong=" + tenHopDong + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", sanPham=" + sanPham + ", giaTien=" + giaTien + '}';
    }
    
}
