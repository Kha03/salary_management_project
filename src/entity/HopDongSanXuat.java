/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.Date;
/**
 *
 * @author ACER
 */
public class HopDongSanXuat {
    private String maHopDong;
    private String tenHopDong;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private SanPham sanPham;
    private float giaTien;

    public HopDongSanXuat(String maHopDong, String tenHopDong, Date ngayBatDau, Date ngayKetThuc, SanPham sanPham, float giaTien) {
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

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
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

    public SanPham getSanPham() {
        return sanPham;
    }

    public float getGiaTien() {
        return giaTien;
    }

    @Override
    public String toString() {
        return "HopDongSanXuat{" + "maHopDong=" + maHopDong + ", tenHopDong=" + tenHopDong + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", sanPham=" + sanPham + ", giaTien=" + giaTien + '}';
    }
    
}
