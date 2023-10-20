package entity;

import java.util.*;

/**
 *
 * @author ACER
 */
public class PhanXuong {

    private String maPhanXuong;
    private String tenPhanXuong;
    private NhanVienSanXuat toTruong;
    private List<NhanVienSanXuat> nhanVien;

    public PhanXuong() {
    }

    public PhanXuong(String maPhanXuong, String tenPhanXuong, NhanVienSanXuat toTruong, List<NhanVienSanXuat> nhanVien) {
        this.maPhanXuong = maPhanXuong;
        this.tenPhanXuong = tenPhanXuong;
        this.toTruong = toTruong;
        this.nhanVien = nhanVien;
    }

    public PhanXuong(String maPhanXuong, String tenPhanXuong, NhanVienSanXuat toTruong) {
        this.maPhanXuong = maPhanXuong;
        this.tenPhanXuong = tenPhanXuong;
        this.toTruong = toTruong;
    }

    public PhanXuong(String tenPhanXuong) {
        this.tenPhanXuong = tenPhanXuong;
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

    public void setNhanVien(List<NhanVienSanXuat> nhanVien) {
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

    public List<NhanVienSanXuat> getNhanVien() {
        return nhanVien;
    }

    @Override
    public String toString() {
        return "PhanXuong{" + "maPhanXuong=" + maPhanXuong + ", tenPhanXuong=" + tenPhanXuong + ", toTruong=" + toTruong + ", nhanVien=" + nhanVien + '}';
    }

}
