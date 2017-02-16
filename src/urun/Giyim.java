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
public class Giyim extends Urun {
 private String renk;
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
   

    public Giyim(String renk, String ad, int seriNo, int fiyat, String cins) {
        super(ad, seriNo, fiyat, cins);
        this.renk = renk;
    }

  
    }

