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
public class Telefon extends Elektronik{
    private int model;

    public Telefon(int model, int guc, String ad, int seriNo, int fiyat, String cins) {
        super(guc, ad, seriNo, fiyat, cins);
        this.model = model;
    }

    

}