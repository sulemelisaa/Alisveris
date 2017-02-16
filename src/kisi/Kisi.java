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
public class Kisi {
    String ad;           
    String soyad;  

    public Kisi(String ad,String soyad) {
        this.ad=ad;
        this.soyad=soyad;
  
    }


    public String getIsim() {
        return ad;
    }

    public void setIsim(String ad) {
        this.ad = ad;
    }

    public String getSoyisim() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    
    
    
//    
//    public static void main(String[] args) {
//        Kisi k1 = new Kisi();
//        Kisi k2 = new Kisi();
//        k1.isim = "osman";
//        k2.isim = "ahmet";
//        System.out.println(k1.isim);
//                
//    }
}
