
package entity;

/**
 *
 * @author ACER
 */
public class BacLuong {
    private String maBacLuong;
    private int soBac;
    private float heSoLuong;
    private float luongCoSo;
    private CapBac maCapBac;

    public BacLuong(String maBacLuong, int soBac, float heSoLuong, float luongCoSo, CapBac maCapBac) {
        this.maBacLuong = maBacLuong;
        this.soBac = soBac;
        this.heSoLuong = heSoLuong;
        this.luongCoSo = luongCoSo;
        this.maCapBac = maCapBac;
    }

    public BacLuong() {
    }

    public void setMaBacLuong(String maBacLuong) {
        this.maBacLuong = maBacLuong;
    }

    public void setSoBac(int soBac) {
        this.soBac = soBac;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setLuongCoSo(float luongCoSo) {
        this.luongCoSo = luongCoSo;
    }

    public void setMaCapBac(CapBac maCapBac) {
        this.maCapBac = maCapBac;
    }

    public String getMaBacLuong() {
        return maBacLuong;
    }

    public int getSoBac() {
        return soBac;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public float getLuongCoSo() {
        return luongCoSo;
    }

    public CapBac getMaCapBac() {
        return maCapBac;
    }

    @Override
    public String toString() {
        return "BacLuong{" + "maBacLuong=" + maBacLuong + ", soBac=" + soBac + ", heSoLuong=" + heSoLuong + ", luongCoSo=" + luongCoSo + ", maCapBac=" + maCapBac + '}';
    }

    
    
}
