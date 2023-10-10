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
public class NhanVienHanhChanh extends NhanVien{
    private String maNhanVienHanhChanh;
    private String chucVu;
    private String ngoaiNgu;
    private String capBac;
    private PhongBan phongBan;
    private float luongCoBan;
    private float heSoLuong;

    public NhanVienHanhChanh(String maNhanVienHanhChanh, String chucVu, String ngoaiNgu, String capBac, PhongBan phongBan, float luongCoBan, float heSoLuong, String maSo, String ho, String ten, Date ngaySinh, boolean gioiTinh, String diaChi, String dienThoai, String email, Date ngayVaoLam) {
        super(maSo, ho, ten, ngaySinh, gioiTinh, diaChi, dienThoai, email, ngayVaoLam);
        this.maNhanVienHanhChanh = maNhanVienHanhChanh;
        this.chucVu = chucVu;
        this.ngoaiNgu = ngoaiNgu;
        this.capBac = capBac;
        this.phongBan = phongBan;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    

    

    public NhanVienHanhChanh() {
    }

    public void setMaNhanVienHanhChanh(String maNhanVienHanhChanh) {
        this.maNhanVienHanhChanh = maNhanVienHanhChanh;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setNgoaiNgu(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getMaNhanVienHanhChanh() {
        return maNhanVienHanhChanh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getNgoaiNgu() {
        return ngoaiNgu;
    }

    public String getCapBac() {
        return capBac;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }
    @Override
    public String toString() {
        return "NhanVienHanhChanh{" + "maNhanVienHanhChanh=" + maNhanVienHanhChanh + ", chucVu=" + chucVu + ", ngoaiNgu=" + ngoaiNgu + ", capBac=" + capBac + ", phongBan=" + phongBan + ", luongCoBan=" + luongCoBan + ", heSoLuong=" + heSoLuong + '}';
    }
}
