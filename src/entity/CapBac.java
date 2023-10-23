
package entity;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author ACER
 */
public class CapBac {
    private String maCapBac;
    private String tenCapBac;
    private List<BacLuong> bacLuongs;
   
    public CapBac() {
    }

    public CapBac(String maCapBac, String tenCapBac, List<BacLuong> bacLuongs) {
        this.maCapBac = maCapBac;
        this.tenCapBac = tenCapBac;
        this.bacLuongs = bacLuongs;
    }

    public List<BacLuong> getBacLuongs() {
        return bacLuongs;
    }

    public void setBacLuongs(List<BacLuong> bacLuongs) {
        this.bacLuongs = bacLuongs;
    }
    
    public CapBac(String maCapBac, String tenCapBac) {
        this.maCapBac = maCapBac;
        this.tenCapBac = tenCapBac;
    }

    public void setMaCapBac(String maCapBac) {
        this.maCapBac = maCapBac;
    }

    public void setTenCapBac(String tenCapBac) {
        this.tenCapBac = tenCapBac;
    }

    public String getMaCapBac() {
        return maCapBac;
    }

    public String getTenCapBac() {
        return tenCapBac;
    }
    @Override
    public String toString() {
        return "CapBac{" + "maCapBac=" + maCapBac + ", tenCapBac=" + tenCapBac + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CapBac other = (CapBac) obj;
        return Objects.equals(this.tenCapBac, other.tenCapBac);
    }
    
}
