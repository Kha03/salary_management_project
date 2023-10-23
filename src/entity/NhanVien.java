
package entity;
import java.util.Date;
/**
 *
 * @author ACER
 */
public class NhanVien {
    private String maSo;
    private String hoVaTen;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String diaChi;
    private String dienThoai;
    private String email;
    private Date ngayVaoLam;

    

    public NhanVien(String maSo, String hoVaTen, Date ngaySinh, boolean gioiTinh, String diaChi, String dienThoai, String email, Date ngayVaoLam) {
        this.maSo = maSo;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.email = email;
        this.ngayVaoLam = ngayVaoLam;
    }

    public NhanVien(String maSo, String hoVaTen) {
        this.maSo = maSo;
        this.hoVaTen = hoVaTen;
    }
    
    public NhanVien() {
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setHo(String hoVaTen) {
        this.hoVaTen = hoVaTen;
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

    public String getHoVaTen() {
        return hoVaTen;
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
        return "NhanVien{" + "maSo=" + maSo + ", hoVaTen=" + hoVaTen  + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", dienThoai=" + dienThoai + ", email=" + email + ", ngayVaoLam=" + ngayVaoLam + '}';
    }
}
