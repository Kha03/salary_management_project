/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ACER
 */
public class TrinhDo {
    private String maTrinhDo;
    private String tenTrinhDo;

    public TrinhDo(String maTrinhDo, String tenTrinhDo) {
        this.maTrinhDo = maTrinhDo;
        this.tenTrinhDo = tenTrinhDo;
    }

    public TrinhDo() {
    }

    public void setMaTrinhDo(String maTrinhDo) {
        this.maTrinhDo = maTrinhDo;
    }

    public void setTenTrinhDo(String tenTrinhDo) {
        this.tenTrinhDo = tenTrinhDo;
    }

    public String getMaTrinhDo() {
        return maTrinhDo;
    }

    public String getTenTrinhDo() {
        return tenTrinhDo;
    }

    @Override
    public String toString() {
        return "TrinhDo{" + "maTrinhDo=" + maTrinhDo + ", tenTrinhDo=" + tenTrinhDo + '}';
    }
    
}
