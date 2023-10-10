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
public class ChamCongNhanVien {
    private String maNgayCong;
    private NhanVienHanhChanh nhanVienHanhChanh;
    private Date ngayLamViec;
    private boolean trangThai;
    private int gioTangCa;

    public ChamCongNhanVien(String maNgayCong, NhanVienHanhChanh nhanVienHanhChanh, Date ngayLamViec, boolean trangThai, int gioTangCa) {
        this.maNgayCong = maNgayCong;
        this.nhanVienHanhChanh = nhanVienHanhChanh;
        this.ngayLamViec = ngayLamViec;
        this.trangThai = trangThai;
        this.gioTangCa = gioTangCa;
    }

    public ChamCongNhanVien() {
    }

    public void setMaNgayCong(String maNgayCong) {
        this.maNgayCong = maNgayCong;
    }

    public void setNhanVienHanhChanh(NhanVienHanhChanh nhanVienHanhChanh) {
        this.nhanVienHanhChanh = nhanVienHanhChanh;
    }

    public void setNgayLamViec(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void setGioTangCa(int gioTangCa) {
        this.gioTangCa = gioTangCa;
    }

    public String getMaNgayCong() {
        return maNgayCong;
    }

    public NhanVienHanhChanh getNhanVienHanhChanh() {
        return nhanVienHanhChanh;
    }

    public Date getNgayLamViec() {
        return ngayLamViec;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public int getGioTangCa() {
        return gioTangCa;
    }

    @Override
    public String toString() {
        return "ChamCongNhanVien{" + "maNgayCong=" + maNgayCong + ", nhanVienHanhChanh=" + nhanVienHanhChanh + ", ngayLamViec=" + ngayLamViec + ", trangThai=" + trangThai + ", gioTangCa=" + gioTangCa + '}';
    }
    
}
