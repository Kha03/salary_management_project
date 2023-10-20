
package entity;
import java.util.*;
/**
 *
 * @author ACER
 */
public class PhuCap {
    private String maPhuCap;
    private String tenPhuCap;
    private float soTien;
    private List<NhanVien> nhanVien;
    private boolean coDinh;
    private String thangHuong;

    public boolean getCoDinh() {
        return coDinh;
    }

    public void setCoDinh(boolean coDinh) {
        this.coDinh = coDinh;
    }

    public PhuCap(String maPhuCap, String tenPhuCap, float soTien, List<NhanVien> nhanVien, boolean coDinh, String thangHuong) {
        this.maPhuCap = maPhuCap;
        this.tenPhuCap = tenPhuCap;
        this.soTien = soTien;
        this.nhanVien = nhanVien;
        this.coDinh = coDinh;
        this.thangHuong = thangHuong;
    }

    public PhuCap(String maPhuCap, String tenPhuCap, float soTien, boolean coDinh, String thangHuong) {
        this.maPhuCap = maPhuCap;
        this.tenPhuCap = tenPhuCap;
        this.soTien = soTien;
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

    public void setNhanVien(List<NhanVien> nhanVien) {
        this.nhanVien = nhanVien;
    }

    


    public void setThangHuong(String thangHuong) {
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

    public List<NhanVien> getNhanVien() {
        return nhanVien;
    }

    public boolean isCoDinh() {
        return coDinh;
    }

    

    public String getThangHuong() {
        return thangHuong;
    }

    @Override
    public String toString() {
        return "PhuCap{" + "maPhuCap=" + maPhuCap + ", tenPhuCap=" + tenPhuCap + ", soTien=" + soTien + ", nhanVien=" + nhanVien + ", coDinh=" + coDinh + ", thangHuong=" + thangHuong + '}';
    }
    
}
