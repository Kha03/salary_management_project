
package entity;
import java.util.Date;
import java.util.List;
/**
 *
 * @author ACER
 */
public class LuongHanhChanh {
    private String maLuong;
    private NhanVienHanhChanh nhanVienHanhChanh;
    private List<ChamCongNhanVien> ngayCongNhanVien;
    private Date thanhLap;
    private String chucVu;
    private float heSoLuong;
    private float luongCoBan;
    private int soNgayCongChuan;
    private int ngayCongThucTe;
    private float tienPhuCap;
    private float tienTangCa;

    public LuongHanhChanh(String maLuong, NhanVienHanhChanh nhanVienHanhChanh, List<ChamCongNhanVien> ngayCongNhanVien, Date thanhLap, String chucVu, float heSoLuong, float luongCoBan, int soNgayCongChuan, int ngayCongThucTe, float tienPhuCap, float tienTangCa) {
        this.maLuong = maLuong;
        this.nhanVienHanhChanh = nhanVienHanhChanh;
        this.ngayCongNhanVien = ngayCongNhanVien;
        this.thanhLap = thanhLap;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.soNgayCongChuan = soNgayCongChuan;
        this.ngayCongThucTe = ngayCongThucTe;
        this.tienPhuCap = tienPhuCap;
        this.tienTangCa = tienTangCa;
    }

    

    public LuongHanhChanh() {
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

    

    public void setThanhLap(Date thanhLap) {
        this.thanhLap = thanhLap;
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

    

    public Date getThanhLap() {
        return thanhLap;
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
        return "LuongHanhChanh{" + "maLuong=" + maLuong + ", nhanVienHanhChanh=" + nhanVienHanhChanh + ", ngayCongNhanVien=" + ngayCongNhanVien + ", thanhLap=" + thanhLap + ", chucVu=" + chucVu + ", heSoLuong=" + heSoLuong + ", luongCoBan=" + luongCoBan + ", soNgayCongChuan=" + soNgayCongChuan + ", ngayCongThucTe=" + ngayCongThucTe + ", tienPhuCap=" + tienPhuCap + ", tienTangCa=" + tienTangCa + '}';
    }
    
}
