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
public class NhanVienSanXuat extends NhanVien{
    private String maNhanVienSanXuat;
    private String trinhDo;
    private String chucVu;
    private String kinhNghiem;
    private PhanXuong phanXuong;

    public NhanVienSanXuat(String maNhanVienSanXuat, String trinhDo, String chucVu, String kinhNghiem, PhanXuong phanXuong, String maSo, String ho, String ten, Date ngaySinh, boolean gioiTinh, String diaChi, String dienThoai, String email, Date ngayVaoLam) {
        super(maSo, ho, ten, ngaySinh, gioiTinh, diaChi, dienThoai, email, ngayVaoLam);
        this.maNhanVienSanXuat = maNhanVienSanXuat;
        this.trinhDo = trinhDo;
        this.chucVu = chucVu;
        this.kinhNghiem = kinhNghiem;
        this.phanXuong = phanXuong;
    }
    

    public NhanVienSanXuat() {
    }

    public void setMaNhanVienSanXuat(String maNhanVienSanXuat) {
        this.maNhanVienSanXuat = maNhanVienSanXuat;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public void setPhanXuong(PhanXuong phanXuong) {
        this.phanXuong = phanXuong;
    }

    public String getMaNhanVienSanXuat() {
        return maNhanVienSanXuat;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public PhanXuong getPhanXuong() {
        return phanXuong;
    }
    
    @Override
    public String toString() {
        return "NhanVienSanXuat{" + "maNhanVienSanXuat=" + maNhanVienSanXuat + ", trinhDo=" + trinhDo + ", chucVu=" + chucVu + ", kinhNghiem=" + kinhNghiem + ", phanXuong=" + phanXuong + '}';
    }
}
