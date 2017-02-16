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
public class Elektronik  extends Urun{

    public int getGuc() {
        return guc;
    }

    public void setGuc(int guc) {
        this.guc = guc;
    }
 private int guc;

    public Elektronik(int guc, String ad, int seriNo, int fiyat, String cins) {
        super(ad, seriNo, fiyat, cins);
        this.guc = guc;
    }

     
}
