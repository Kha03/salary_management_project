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
public class NhanVien {
    private String maSo;
    private String ho;
    private String ten;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String diaChi;
    private String dienThoai;
    private String email;
    private Date ngayVaoLam;

    

    public NhanVien(String maSo, String ho, String ten, Date ngaySinh, boolean gioiTinh, String diaChi, String dienThoai, String email, Date ngayVaoLam) {
        this.maSo = maSo;
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.email = email;
        this.ngayVaoLam = ngayVaoLam;
    }

    public NhanVien() {
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getMaSo() {
        return maSo;
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }
    @Override
    public String toString() {
        return "NhanVien{" + "maSo=" + maSo + ", ho=" + ho + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", dienThoai=" + dienThoai + ", email=" + email + ", ngayVaoLam=" + ngayVaoLam + '}';
    }
}
