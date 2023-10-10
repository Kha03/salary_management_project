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
public class ChamCongSanPham {
    private String maCongSanPham;
    private NhanVienSanXuat nhanVienSanXuat;
    private SanPham sanPham;
    private Date ngayLamViec;
    private CongDoan congDoan;
    private float donGia;
    private int soLuong;

    public ChamCongSanPham(String maCongSanPham, NhanVienSanXuat nhanVienSanXuat, SanPham sanPham, Date ngayLamViec, CongDoan congDoan, float donGia, int soLuong) {
        this.maCongSanPham = maCongSanPham;
        this.nhanVienSanXuat = nhanVienSanXuat;
        this.sanPham = sanPham;
        this.ngayLamViec = ngayLamViec;
        this.congDoan = congDoan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    
    
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }


    public ChamCongSanPham() {
    }

    public void setMaCongSanPham(String maCongSanPham) {
        this.maCongSanPham = maCongSanPham;
    }

    public void setNhanVienSanXuat(NhanVienSanXuat nhanVienSanXuat) {
        this.nhanVienSanXuat = nhanVienSanXuat;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public void setNgayLamViec(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public void setCongDoan(CongDoan congDoan) {
        this.congDoan = congDoan;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

   

    public String getMaCongSanPham() {
        return maCongSanPham;
    }

    public NhanVienSanXuat getNhanVienSanXuat() {
        return nhanVienSanXuat;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public Date getNgayLamViec() {
        return ngayLamViec;
    }

    public CongDoan getCongDoan() {
        return congDoan;
    }

    public float getDonGia() {
        return donGia;
    }

    @Override
    public String toString() {
        return "ChamCongSanPham{" + "maCongSanPham=" + maCongSanPham + ", nhanVienSanXuat=" + nhanVienSanXuat + ", sanPham=" + sanPham + ", ngayLamViec=" + ngayLamViec + ", congDoan=" + congDoan + ", donGia=" + donGia + ", soLuong=" + soLuong + '}';
    }

    
    
}
