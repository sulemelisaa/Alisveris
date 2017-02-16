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
public class Kasiyer extends MagazaPersoneli {

    int kasaNo; //Çalıştığı kasa numarası

    public Kasiyer(String ad, String soyad, String kullaniciAdi, int sifre, String yetki, int subeKodu, int kasaNo) {
        super(ad, soyad, kullaniciAdi, sifre, yetki, subeKodu);
        this.kasaNo = kasaNo;
    }

    public int getKasaNo() {
        return kasaNo;
    }

    public void setKasaNo(int kasaNo) {
        this.kasaNo = kasaNo;
    }
public static void kasiyerRapor(){
    //ürün fiyat toplam
}
    

}
