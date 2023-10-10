/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ACER
 */
public class PhongBan {
    private String maPhongBan;
    private String tenPhongBan;
    private NhanVienHanhChanh truongPhong;
    private NhanVienHanhChanh nhanVien;

    public PhongBan(String maPhongBan, String tenPhongBan, NhanVienHanhChanh truongPhong, NhanVienHanhChanh nhanVien) {
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

    public NhanVienHanhChanh getNhanVien() {
        return nhanVien;
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

    public void setNhanVien(NhanVienHanhChanh nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public String toString() {
        return "PhongBan{" + "maPhongBan=" + maPhongBan + ", tenPhongBan=" + tenPhongBan + ", truongPhong=" + truongPhong + ", nhanVien=" + nhanVien + '}';
    }
    
}
