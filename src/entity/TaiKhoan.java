/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ACER
 */
public class TaiKhoan {
    private String maTaiKhoan;
    private String matKhau;

    public TaiKhoan(String maTaiKhoan, String matKhau, NhanVienHanhChanh maNhanVienHanhChanh) {
        this.maTaiKhoan = maTaiKhoan;
        this.matKhau = matKhau;
        this.maNhanVienHanhChanh = maNhanVienHanhChanh;
    }

    public TaiKhoan() {
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setMaNhanVienHanhChanh(NhanVienHanhChanh maNhanVienHanhChanh) {
        this.maNhanVienHanhChanh = maNhanVienHanhChanh;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public NhanVienHanhChanh getMaNhanVienHanhChanh() {
        return maNhanVienHanhChanh;
    }
    private NhanVienHanhChanh maNhanVienHanhChanh;

    @Override
    public String toString() {
        return "TaiKhoan{" + "maTaiKhoan=" + maTaiKhoan + ", matKhau=" + matKhau + ", maNhanVienHanhChanh=" + maNhanVienHanhChanh + '}';
    }
    
}
