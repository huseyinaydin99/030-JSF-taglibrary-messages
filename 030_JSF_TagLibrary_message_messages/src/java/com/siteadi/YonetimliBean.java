/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class YonetimliBean {

    /**
     * Creates a new instance of YonetimliBean
     */
    private String adi,soyadi;
    private int numarasi;
    public YonetimliBean() {
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(int numarasi) {
        this.numarasi = numarasi;
    }
    
}
