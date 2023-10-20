
package entity;
import java.util.*;
/**
 *
 * @author ACER
 */
public class PhanCongSanXuat {
    private String maPhanCong;
    private List<NhanVienSanXuat> nhanVienSanXuat;
    private SanPham sanPham;
    private Date ngayPhanCong;
    private CongDoan congDoan;
    private PhanXuong phanXuong;


    public PhanCongSanXuat(String maPhanCong, List<NhanVienSanXuat> nhanVienSanXuat, SanPham sanPham, Date ngayPhanCong, CongDoan congDoan, PhanXuong phanXuong) {
        this.maPhanCong = maPhanCong;
        this.nhanVienSanXuat = nhanVienSanXuat;
        this.sanPham = sanPham;
        this.ngayPhanCong = ngayPhanCong;
        this.congDoan = congDoan;
        this.phanXuong = phanXuong;
    }

    public PhanCongSanXuat(String maPhanCong, SanPham sanPham, Date ngayPhanCong, CongDoan congDoan, PhanXuong phanXuong) {
        this.maPhanCong = maPhanCong;
        this.sanPham = sanPham;
        this.ngayPhanCong = ngayPhanCong;
        this.congDoan = congDoan;
        this.phanXuong = phanXuong;
    }

    public PhanCongSanXuat() {
    }

    public void setMaPhanCong(String maPhanCong) {
        this.maPhanCong = maPhanCong;
    }

    public void setNhanVienSanXuat(List<NhanVienSanXuat> nhanVienSanXuat) {
        this.nhanVienSanXuat = nhanVienSanXuat;
    }

    

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public void setNgayPhanCong(Date ngayPhanCong) {
        this.ngayPhanCong = ngayPhanCong;
    }

    public void setCongDoan(CongDoan congDoan) {
        this.congDoan = congDoan;
    }

    public void setPhanXuong(PhanXuong phanXuong) {
        this.phanXuong = phanXuong;
    }

    public String getMaPhanCong() {
        return maPhanCong;
    }

    public List<NhanVienSanXuat> getNhanVienSanXuat() {
        return nhanVienSanXuat;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public Date getNgayPhanCong() {
        return ngayPhanCong;
    }

    public CongDoan getCongDoan() {
        return congDoan;
    }

    public PhanXuong getPhanXuong() {
        return phanXuong;
    }

    @Override
    public String toString() {
        return "PhanCongSanXuat{" + "maPhanCong=" + maPhanCong + ", nhanVienSanXuat=" + nhanVienSanXuat + ", sanPham=" + sanPham + ", ngayPhanCong=" + ngayPhanCong + ", congDoan=" + congDoan + ", phanXuong=" + phanXuong + '}';
    }
    
}
