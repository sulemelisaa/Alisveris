/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisi;

/**
 *
 * @author melisaborekcioglu
 */
public class Personel extends Kisi {
    private String kullaniciAdi;
    private int sifre;
    private String yetki; // rapor için müdür-admin 

    public Personel(String ad, String soyad,String kullaniciAdi, int sifre, String yetki) {
        super(ad, soyad);
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.yetki = yetki;
    }
  
    public String getYetki() {
        return yetki;
    }

    public void setYetki(String yetki) {
        this.yetki = yetki;
    }
    
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }
  
}
