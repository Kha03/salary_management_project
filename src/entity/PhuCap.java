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
public class PhuCap {
    private String maPhuCap;
    private String tenPhuCap;
    private float soTien;
    private NhanVien nhanVien;
    private boolean coDinh;
    private Date thangHuong;

    public boolean getCoDinh() {
        return coDinh;
    }

    public void setCoDinh(boolean coDinh) {
        this.coDinh = coDinh;
    }

    public PhuCap(String maPhuCap, String tenPhuCap, float soTien, NhanVien nhanVien, boolean coDinh, Date thangHuong) {
        this.maPhuCap = maPhuCap;
        this.tenPhuCap = tenPhuCap;
        this.soTien = soTien;
        this.nhanVien = nhanVien;
        this.coDinh = coDinh;
        this.thangHuong = thangHuong;
    }

    

    public PhuCap() {
    }

    public void setMaPhuCap(String maPhuCap) {
        this.maPhuCap = maPhuCap;
    }

    public void setTenPhuCap(String tenPhuCap) {
        this.tenPhuCap = tenPhuCap;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }


    public void setThangHuong(Date thangHuong) {
        this.thangHuong = thangHuong;
    }

    public String getMaPhuCap() {
        return maPhuCap;
    }

    public String getTenPhuCap() {
        return tenPhuCap;
    }

    public float getSoTien() {
        return soTien;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public Date getThangHuong() {
        return thangHuong;
    }

    @Override
    public String toString() {
        return "PhuCap{" + "maPhuCap=" + maPhuCap + ", tenPhuCap=" + tenPhuCap + ", soTien=" + soTien + ", nhanVien=" + nhanVien + ", coDinh=" + coDinh + ", thangHuong=" + thangHuong + '}';
    }
    
}
