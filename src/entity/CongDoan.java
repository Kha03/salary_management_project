
package entity;

/**
 *
 * @author ACER
 */
public class CongDoan {
    private String maCongDoan;
    private String tenCongDoan;
    private float giaTien;
    private int tienDo;

    public CongDoan(String maCongDoan, String tenCongDoan, float giaTien, int tienDo) {
        this.maCongDoan = maCongDoan;
        this.tenCongDoan = tenCongDoan;
        this.giaTien = giaTien;
        this.tienDo = tienDo;
    }

    
    
    public void setTienDo(int tienDo) {
        this.tienDo = tienDo;
    }

    public int getTienDo() {
        return tienDo;
    }

    public CongDoan() {
    }

    public void setMaCongDoan(String maCongDoan) {
        this.maCongDoan = maCongDoan;
    }

    public void setTenCongDoan(String tenCongDoan) {
        this.tenCongDoan = tenCongDoan;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public String getMaCongDoan() {
        return maCongDoan;
    }

    public String getTenCongDoan() {
        return tenCongDoan;
    }

    public float getGiaTien() {
        return giaTien;
    }

    @Override
    public String toString() {
        return "CongDoan{" + "maCongDoan=" + maCongDoan + ", tenCongDoan=" + tenCongDoan + ", giaTien=" + giaTien + ", tienDo=" + tienDo + '}';
    }

    
}
