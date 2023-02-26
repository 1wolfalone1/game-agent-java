/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.region;

/**
 *
 * @author ASUS
 */
public class RegionDTO {
    private String maVung;
    private String tenVung;
    private String moTa;

    public RegionDTO(String maVung, String tenVung, String moTa) {
        this.maVung = maVung;
        this.tenVung = tenVung;
        this.moTa = moTa;
    }

    public RegionDTO() {
    }

    public String getMaVung() {
        return maVung;
    }

    public void setMaVung(String maVung) {
        this.maVung = maVung;
    }

    public String getTenVung() {
        return tenVung;
    }

    public void setTenVung(String tenVung) {
        this.tenVung = tenVung;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
}
