/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.account;

import java.sql.Date;
import utils.MyUtils;

/**
 *
 * @author ASUS
 */
public class RegistrationError {

    private String maTK;
    private String tenKH;
    private String matKhau;
    private String soCMND;
    private String email;
    private String gioiTinh;
    private String ngaySinh;
    private String maVung;

    public String getMaVung() {
        return maVung;
    }

    public void setMaVung(String maVung) {
        this.maVung = maVung;
    }

    public RegistrationError() {
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean check(String maTK, String tenKH, String matKhau, String soCMND, 
            String email, String gioiTinh, String ngaySinh, String maVung) {
        boolean result = false;
        if (maTK.length() < 7 || maTK.length() > 25) {
            this.maTK = "Account name must have length between 8 and 25!!!";
            result = true;
        }
        if (!tenKH.matches("(?=.*[\\S].*).*")) {
            this.tenKH = "Name must not be empty!!!";
            result = true;
        }
        if (matKhau.length() < 7) {
            this.matKhau = "Password must be at least 8 characters";
            result = true;

        }
        if (!email.matches("(?=.*[\\S]).*")) {
            this.email = "Email must not be empty!!!";
            result = true;

        }
        Date date = MyUtils.utilDateToSqlDate(MyUtils.convertToDate(ngaySinh, "yyyy-MM-dd"));
        if (date == null) {
            this.ngaySinh = "Not a date!!!";
            result = true;
        }

        return result;
    }
}
