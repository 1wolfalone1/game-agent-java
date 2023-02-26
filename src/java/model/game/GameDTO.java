/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.game;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class GameDTO {
    private String maTC;
    private String tenTC;
    private String loaiTC;
    private String maNPH;
    private String maBST;
    private double giaTien;
    private Date ngayXuatBan;

    public GameDTO() {
    }

    public GameDTO(String maTC, String tenTC, String loaiTC, String maNPH, String maBST, double giaTien, Date ngayXuatBan) {
        this.maTC = maTC;
        this.tenTC = tenTC;
        this.loaiTC = loaiTC;
        this.maNPH = maNPH;
        this.maBST = maBST;
        this.giaTien = giaTien;
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getMaTC() {
        return maTC;
    }

    public void setMaTC(String maTC) {
        this.maTC = maTC;
    }

    public String getTenTC() {
        return tenTC;
    }

    public void setTenTC(String tenTC) {
        this.tenTC = tenTC;
    }

    public String getLoaiTC() {
        return loaiTC;
    }

    public void setLoaiTC(String loaiTC) {
        this.loaiTC = loaiTC;
    }

    public String getMaNPH() {
        return maNPH;
    }

    public void setMaNPH(String maNPH) {
        this.maNPH = maNPH;
    }

    public String getMaBST() {
        return maBST;
    }

    public void setMaBST(String maBST) {
        this.maBST = maBST;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }
    
}
