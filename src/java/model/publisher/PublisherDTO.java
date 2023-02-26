/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.publisher;

/**
 *
 * @author ASUS
 */
public class PublisherDTO {
    private String maNPH;
    private String tenNPH;
    private String maVung;
    private String maPTTT;

    public PublisherDTO(String maNPH, String tenNPH, String maVung, String maPTTT) {
        this.maNPH = maNPH;
        this.tenNPH = tenNPH;
        this.maVung = maVung;
        this.maPTTT = maPTTT;
    }

    public PublisherDTO() {
    }

    public String getMaNPH() {
        return maNPH;
    }

    public void setMaNPH(String maNPH) {
        this.maNPH = maNPH;
    }

    public String getTenNPH() {
        return tenNPH;
    }

    public void setTenNPH(String tenNPH) {
        this.tenNPH = tenNPH;
    }

    public String getMaVung() {
        return maVung;
    }

    public void setMaVung(String maVung) {
        this.maVung = maVung;
    }

    public String getMaPTTT() {
        return maPTTT;
    }

    public void setMaPTTT(String maPTTT) {
        this.maPTTT = maPTTT;
    }
    
}
