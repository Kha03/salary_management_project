/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ACER
 */
public class PhanXuong {
    private String maPhanXuong;
    private String tenPhanXuong;
    private NhanVienSanXuat toTruong;
    private NhanVienSanXuat nhanVien;

    public PhanXuong() {
    }

    public PhanXuong(String maPhanXuong, String tenPhanXuong, NhanVienSanXuat toTruong, NhanVienSanXuat nhanVien) {
        this.maPhanXuong = maPhanXuong;
        this.tenPhanXuong = tenPhanXuong;
        this.toTruong = toTruong;
        this.nhanVien = nhanVien;
    }

    public void setMaPhanXuong(String maPhanXuong) {
        this.maPhanXuong = maPhanXuong;
    }

    public void setTenPhanXuong(String tenPhanXuong) {
        this.tenPhanXuong = tenPhanXuong;
    }

    public void setToTruong(NhanVienSanXuat toTruong) {
        this.toTruong = toTruong;
    }

    public void setNhanVien(NhanVienSanXuat nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMaPhanXuong() {
        return maPhanXuong;
    }

    public String getTenPhanXuong() {
        return tenPhanXuong;
    }

    public NhanVienSanXuat getToTruong() {
        return toTruong;
    }

    public NhanVienSanXuat getNhanVien() {
        return nhanVien;
    }

    @Override
    public String toString() {
        return "PhanXuong{" + "maPhanXuong=" + maPhanXuong + ", tenPhanXuong=" + tenPhanXuong + ", toTruong=" + toTruong + ", nhanVien=" + nhanVien + '}';
    }
    
}
