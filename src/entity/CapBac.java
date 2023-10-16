
package entity;

/**
 *
 * @author ACER
 */
public class CapBac {
    private String maCapBac;
    private String tenCapBac;

   
    public CapBac() {
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
}
