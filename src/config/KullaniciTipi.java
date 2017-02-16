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
public class KullaniciTipi {
    public static String admin = "ADMIN";
    public static String musteri = "MUSTERI";
    public static String mudur = "MUDUR";
    public static String kasiyer = "KASIYER";

    public static String getAdmin() {
        return admin;
    }

    public static void setAdmin(String admin) {
        KullaniciTipi.admin = admin;
    }

    public static String getMusteri() {
        return musteri;
    }

    public static void setMusteri(String musteri) {
        KullaniciTipi.musteri = musteri;
    }

    public static String getMudur() {
        return mudur;
    }

    public static void setMudur(String mudur) {
        KullaniciTipi.mudur = mudur;
    }

    public static String getKasiyer() {
        return kasiyer;
    }

    public static void setKasiyer(String kasiyer) {
        KullaniciTipi.kasiyer = kasiyer;
    }

    
}
