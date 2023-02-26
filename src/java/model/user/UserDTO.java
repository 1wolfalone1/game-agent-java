/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class UserDTO {
    private String soCMND;
    private String tenKH;
    private Date ngaySinh;
    private String gioiTinh;
    private String maVung;

    public UserDTO(String soCMND, String tenKH, Date ngaySinh, String gioiTinh, String maVung) {
        this.soCMND = soCMND;
        this.tenKH = tenKH;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.maVung = maVung;
    }

    public UserDTO() {
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaVung() {
        return maVung;
    }

    public void setMaVung(String maVung) {
        this.maVung = maVung;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "soCMND=" + soCMND + ", tenKH=" + tenKH + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", maVung=" + maVung + '}';
    }
    
}
