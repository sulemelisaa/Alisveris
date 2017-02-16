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
public class MagazaPersoneli extends Personel {
    private int subeKodu;


    public MagazaPersoneli(String ad, String soyad,String kullaniciAdi, int sifre, String yetki,  int subeKodu) {
        super( ad, soyad,kullaniciAdi, sifre, yetki);
        this.subeKodu = subeKodu;
    }

  

    public int getSubeKodu() {
        return subeKodu;
    }

    public void setSubeKodu(int subeKodu) {
        this.subeKodu = subeKodu;
    }
    
    
}
