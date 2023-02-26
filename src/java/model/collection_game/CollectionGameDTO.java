/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.collection_game;

/**
 *
 * @author ASUS
 */
public class CollectionGameDTO {
    private String maBST;
    private String tenBST;
    private double giaBST;
    private String quaTang;

    public CollectionGameDTO(String maBST, String tenBST, double giaBST, String quaTang) {
        this.maBST = maBST;
        this.tenBST = tenBST;
        this.giaBST = giaBST;
        this.quaTang = quaTang;
    }

    public CollectionGameDTO() {
    }

    public String getMaBST() {
        return maBST;
    }

    public void setMaBST(String maBST) {
        this.maBST = maBST;
    }

    public String getTenBST() {
        return tenBST;
    }

    public void setTenBST(String tenBST) {
        this.tenBST = tenBST;
    }

    public double getGiaBST() {
        return giaBST;
    }

    public void setGiaBST(double giaBST) {
        this.giaBST = giaBST;
    }

    public String getQuaTang() {
        return quaTang;
    }

    public void setQuaTang(String quaTang) {
        this.quaTang = quaTang;
    }
    
}
