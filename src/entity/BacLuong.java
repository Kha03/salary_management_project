
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

    public BacLuong(String maBacLuong, int soBac, float heSoLuong, float luongCoSo) {
        this.maBacLuong = maBacLuong;
        this.soBac = soBac;
        this.heSoLuong = heSoLuong;
        this.luongCoSo = luongCoSo;
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

    @Override
    public String toString() {
        return "BacLuong{" + "maBacLuong=" + maBacLuong + ", soBac=" + soBac + ", heSoLuong=" + heSoLuong + ", luongCoSo=" + luongCoSo  + '}';
    }

    
    
}
