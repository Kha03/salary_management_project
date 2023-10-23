package entity;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class NhanVienSanXuat extends NhanVien {

    private String maNhanVienSanXuat;
    private String trinhDo;
    private String capBac;
    private String kinhNghiem;
    private PhanXuong phanXuong;

    public NhanVienSanXuat(String maSo, String ho, String ten, Date ngaySinh, boolean gioiTinh, String diaChi, String dienThoai, String email, Date ngayVaoLam, String maNhanVienSanXuat, String trinhDo, String capBac, String kinhNghiem, PhanXuong phanXuong) {
        super(maSo, ho, ten, ngaySinh, gioiTinh, diaChi, dienThoai, email, ngayVaoLam);
        this.maNhanVienSanXuat = maNhanVienSanXuat;
        this.trinhDo = trinhDo;
        this.capBac = capBac;
        this.kinhNghiem = kinhNghiem;
        this.phanXuong = phanXuong;
    }

    public NhanVienSanXuat(String maNhanVienSanXuat) {
        this.maNhanVienSanXuat = maNhanVienSanXuat;
    }

    public NhanVienSanXuat(String maNhanVienSanXuat, String maSo, String ho, String ten) {
        super(maSo, ho, ten);
        this.maNhanVienSanXuat = maNhanVienSanXuat;
    }

    public NhanVienSanXuat(String maSo, String ho, String ten) {
        super(maSo, ho, ten);
    }

    public NhanVienSanXuat() {
    }

    public void setMaNhanVienSanXuat(String maNhanVienSanXuat) {
        this.maNhanVienSanXuat = maNhanVienSanXuat;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public void setcapBac(String capBac) {
        this.capBac = capBac;
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

    public String getcapBac() {
        return capBac;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public PhanXuong getPhanXuong() {
        return phanXuong;
    }

    @Override
    public String toString() {
        return "NhanVienSanXuat{" + "maNhanVienSanXuat=" + maNhanVienSanXuat + ", trinhDo=" + trinhDo + ", capBac=" + capBac + ", kinhNghiem=" + kinhNghiem + ", phanXuong=" + phanXuong + '}';
    }
}
