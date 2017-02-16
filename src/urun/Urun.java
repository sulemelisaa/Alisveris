/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urun;

/**
 *
 * @author melisaborekcioglu
 */
public class Urun {
    private String cins; 
    private int seriNo;
    private int fiyat;
    private String ad;
    
    public Urun(String ad, int seriNo, int fiyat, String cins) {
        this.ad=ad;
        this.cins = cins;
        this.seriNo = seriNo;
        this.fiyat = fiyat;
    }
    
    public Urun(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
   
    
    
    public Urun(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public int getSeriNo() {
        return seriNo;
    }

    public void setSeriNo(int seriNo) {
        this.seriNo = seriNo;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    
}
