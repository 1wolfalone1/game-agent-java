/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.account;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class AccountDTO {
    private String maTK;
    private String matKhau;
    private Date ngayTao;
    private String email;
    private double soDu;
    private String soCMND;
    private String role;

    public AccountDTO(String maTK, String matKhau, Date ngayTao, String email, double soDu, String soCMND, String role) {
        this.maTK = maTK;
        this.matKhau = matKhau;
        this.ngayTao = ngayTao;
        this.email = email;
        this.soDu = soDu;
        this.soCMND = soCMND;
        this.role = role;
    }

    public AccountDTO() {
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "AccountDTO{" + "maTK=" + maTK + ", matKhau=" + matKhau + ", ngayTao=" + ngayTao + ", email=" + email + ", soDu=" + soDu + ", soCMND=" + soCMND + ", role=" + role + '}';
    }
    
}
