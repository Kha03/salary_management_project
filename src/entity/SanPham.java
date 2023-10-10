/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ACER
 */
public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private int soLuong;
    private CongDoan congDoanThucHien;
    private float donGia;
    private String donViTinh;

    public SanPham(String maSanPham, String tenSanPham, int soLuong, CongDoan congDoanThucHien, float donGia, String donViTinh) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.congDoanThucHien = congDoanThucHien;
        this.donGia = donGia;
        this.donViTinh = donViTinh;
    }

    public SanPham() {
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setCongDoanThucHien(CongDoan congDoanThucHien) {
        this.congDoanThucHien = congDoanThucHien;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public CongDoan getCongDoanThucHien() {
        return congDoanThucHien;
    }

    public float getDonGia() {
        return donGia;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", congDoanThucHien=" + congDoanThucHien + ", donGia=" + donGia + ", donViTinh=" + donViTinh + '}';
    }
    
}
