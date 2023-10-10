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
public class LuongCongNhan {
    private String maLuong;
    private NhanVienSanXuat nhanVienSanXuat;
    private Date thangLap;
    private ChamCongSanPham chamCongSanPham;
    private float tongLuongSanPham;
    private float tienPhuCap;

    public LuongCongNhan(String maLuong, NhanVienSanXuat nhanVienSanXuat, Date thangLap, ChamCongSanPham chamCongSanPham, float tongLuongSanPham, float tienPhuCap) {
        this.maLuong = maLuong;
        this.nhanVienSanXuat = nhanVienSanXuat;
        this.thangLap = thangLap;
        this.chamCongSanPham = chamCongSanPham;
        this.tongLuongSanPham = tongLuongSanPham;
        this.tienPhuCap = tienPhuCap;
    }

    public LuongCongNhan() {
    }

    public void setMaLuong(String maLuong) {
        this.maLuong = maLuong;
    }

    public void setNhanVienSanXuat(NhanVienSanXuat nhanVienSanXuat) {
        this.nhanVienSanXuat = nhanVienSanXuat;
    }

    public void setThangLap(Date thangLap) {
        this.thangLap = thangLap;
    }

    public void setChamCongSanPham(ChamCongSanPham chamCongSanPham) {
        this.chamCongSanPham = chamCongSanPham;
    }

    public void setTongLuongSanPham(float tongLuongSanPham) {
        this.tongLuongSanPham = tongLuongSanPham;
    }

    public void setTienPhuCap(float tienPhuCap) {
        this.tienPhuCap = tienPhuCap;
    }

    public String getMaLuong() {
        return maLuong;
    }

    public NhanVienSanXuat getNhanVienSanXuat() {
        return nhanVienSanXuat;
    }

    public Date getThangLap() {
        return thangLap;
    }

    public ChamCongSanPham getChamCongSanPham() {
        return chamCongSanPham;
    }

    public float getTongLuongSanPham() {
        return tongLuongSanPham;
    }

    public float getTienPhuCap() {
        return tienPhuCap;
    }

    @Override
    public String toString() {
        return "LuongCongNhan{" + "maLuong=" + maLuong + ", nhanVienSanXuat=" + nhanVienSanXuat + ", thangLap=" + thangLap + ", chamCongSanPham=" + chamCongSanPham + ", tongLuongSanPham=" + tongLuongSanPham + ", tienPhuCap=" + tienPhuCap + '}';
    }
    
}
