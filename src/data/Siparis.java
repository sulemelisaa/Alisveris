/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Scanner;
import kisi.Musteri;
import urun.Urun;
import urun.UrunAdet;



/**
 *
 * @author melisaborekcioglu
 */
public class Siparis { 
    private int siparisNo;
    private ArrayList<UrunAdet> urunListesi;
    
    public ArrayList<UrunAdet> getUrunListesi() {
        return urunListesi;
    }

    public void setUrunListesi(ArrayList<UrunAdet> urunListesi) {
        this.urunListesi = urunListesi;
    }
    
    public Siparis(int siparisNo) {  
        this.siparisNo = siparisNo;
        this.urunListesi = new ArrayList<>();
    }

    public int getSiparisNo() {
        return siparisNo;
    }

    public void setSiparisNo(int siparisNo) {
        this.siparisNo = siparisNo;
    }
   
    public void addUrun(UrunAdet urun) {
        this.urunListesi.add(urun);
    }
    
 
}
