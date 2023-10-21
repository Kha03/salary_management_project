package entity;

import java.util.List;

/**
 *
 * @author ACER
 */
public class LuongHanhChanh {

    private String maLuong;
    private NhanVienHanhChanh nhanVienHanhChanh;
    private List<ChamCongNhanVien> ngayCongNhanVien;
    private String thangLap;
    private String chucVu;
    private float heSoLuong;
    private float luongCoBan;
    private int soNgayCongChuan;
    private int ngayCongThucTe;
    private float tienPhuCap;
    private float tienTangCa;
    private float tongLuong;

    public LuongHanhChanh(String maLuong, NhanVienHanhChanh nhanVienHanhChanh, List<ChamCongNhanVien> ngayCongNhanVien, String thangLap, String chucVu, float heSoLuong, float luongCoBan, int soNgayCongChuan, int ngayCongThucTe, float tienPhuCap, float tienTangCa, float tongLuong) {
        this.maLuong = maLuong;
        this.nhanVienHanhChanh = nhanVienHanhChanh;
        this.ngayCongNhanVien = ngayCongNhanVien;
        this.thangLap = thangLap;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.soNgayCongChuan = soNgayCongChuan;
        this.ngayCongThucTe = ngayCongThucTe;
        this.tienPhuCap = tienPhuCap;
        this.tienTangCa = tienTangCa;
        this.tongLuong = tongLuong;
    }

    public LuongHanhChanh() {
    }

    public float getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(float tongLuong) {
        this.tongLuong = tongLuong;
    }

    public void setMaLuong(String maLuong) {
        this.maLuong = maLuong;
    }

    public void setNhanVienHanhChanh(NhanVienHanhChanh nhanVienHanhChanh) {
        this.nhanVienHanhChanh = nhanVienHanhChanh;
    }

    public void setNgayCongNhanVien(List<ChamCongNhanVien> ngayCongNhanVien) {
        this.ngayCongNhanVien = ngayCongNhanVien;
    }

    public void setThangLap(String thangLap) {
        this.thangLap = thangLap;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setSoNgayCongChuan(int soNgayCongChuan) {
        this.soNgayCongChuan = soNgayCongChuan;
    }

    public void setNgayCongThucTe(int ngayCongThucTe) {
        this.ngayCongThucTe = ngayCongThucTe;
    }

    public void setTienPhuCap(float tienPhuCap) {
        this.tienPhuCap = tienPhuCap;
    }

    public void setTienTangCa(float tienTangCa) {
        this.tienTangCa = tienTangCa;
    }

    public String getMaLuong() {
        return maLuong;
    }

    public NhanVienHanhChanh getNhanVienHanhChanh() {
        return nhanVienHanhChanh;
    }

    public List<ChamCongNhanVien> getNgayCongNhanVien() {
        return ngayCongNhanVien;
    }

    public String getThangLap() {
        return thangLap;
    }

    public String getChucVu() {
        return chucVu;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public int getSoNgayCongChuan() {
        return soNgayCongChuan;
    }

    public int getNgayCongThucTe() {
        return ngayCongThucTe;
    }

    public float getTienPhuCap() {
        return tienPhuCap;
    }

    public float getTienTangCa() {
        return tienTangCa;
    }

    @Override
    public String toString() {
        return "LuongHanhChanh{" + "maLuong=" + maLuong + ", nhanVienHanhChanh=" + nhanVienHanhChanh + ", ngayCongNhanVien=" + ngayCongNhanVien + ", thangLap=" + thangLap + ", chucVu=" + chucVu + ", heSoLuong=" + heSoLuong + ", luongCoBan=" + luongCoBan + ", soNgayCongChuan=" + soNgayCongChuan + ", ngayCongThucTe=" + ngayCongThucTe + ", tienPhuCap=" + tienPhuCap + ", tienTangCa=" + tienTangCa + '}';
    }

}
