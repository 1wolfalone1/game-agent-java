/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.payments_methods;

/**
 *
 * @author ASUS
 */
public class PaymentsMethodsDTO {
    private String maPTTT;
    private String tenCongTy;
    private String cachThanhToan;

    public PaymentsMethodsDTO() {
    }

    public PaymentsMethodsDTO(String maPTTT, String tenCongTy, String cachThanhToan) {
        this.maPTTT = maPTTT;
        this.tenCongTy = tenCongTy;
        this.cachThanhToan = cachThanhToan;
    }

    public String getMaPTTT() {
        return maPTTT;
    }

    public void setMaPTTT(String maPTTT) {
        this.maPTTT = maPTTT;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getCachThanhToan() {
        return cachThanhToan;
    }

    public void setCachThanhToan(String cachThanhToan) {
        this.cachThanhToan = cachThanhToan;
    }
        
}
