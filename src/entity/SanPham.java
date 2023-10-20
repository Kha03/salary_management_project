package entity;

import java.util.*;

/**
 *
 * @author ACER
 */
public class SanPham {

    private String maSanPham;
    private String tenSanPham;
    private int soLuong;
    private List<CongDoan> congDoanThucHien;
    private float donGia;
    private String donViTinh;

    public SanPham(String maSanPham, String tenSanPham, float donGia, List<CongDoan> congDoanThucHien, int soLuong, String donViTinh) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.congDoanThucHien = congDoanThucHien;
        this.donGia = donGia;
        this.donViTinh = donViTinh;
    }

    public SanPham(String maSanPham, String tenSanPham,float donGia, int soLuong, String donViTinh) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
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

    public void setCongDoanThucHien(List<CongDoan> congDoanThucHien) {
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

    public List<CongDoan> getCongDoanThucHien() {
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
