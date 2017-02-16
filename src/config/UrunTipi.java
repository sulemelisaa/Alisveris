/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author melisaborekcioglu
 */
public class UrunTipi {
    public static String gida = "GIDA";
    public static String elektronik = "ELEKTRONIK";
    public static String giyim = "GIYIM";
    public static String temizlik = "TEMIZLIK";

    public static String getGida() {
        return gida;
    }

    public static void setGida(String gida) {
        UrunTipi.gida = gida;
    }

    public static String getElektronik() {
        return elektronik;
    }

    public static void setElektronik(String elektronik) {
        UrunTipi.elektronik = elektronik;
    }

    public static String getGiyim() {
        return giyim;
    }

    public static void setGiyim(String giyim) {
        UrunTipi.giyim = giyim;
    }

    public static String getTemizlik() {
        return temizlik;
    }

    public static void setTemizlik(String temizlik) {
        UrunTipi.temizlik = temizlik;
    }
    
}
