/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import data.Veriler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kisi.Kisi;
import kisi.Mudur;
import kisi.Musteri;
import kisi.Personel;
import static test.FileReadTest.list;
import urun.AltGiyim;
import urun.Deterjan;
import urun.EvAletleri;
import urun.Icecek;
import urun.Telefon;
import urun.TemizlikGerecleri;
import urun.Urun;
import urun.UstGiyim;
import urun.Yiyecek;

/**
 *
 * @author melisaborekcioglu
 */
public class FileReadTest {

    public static ArrayList<Kisi> list;

    static {
        list = new ArrayList<>();
    }

    public static void main(String[] args) {
        Urun();
        System.out.println("");
    }

    public static int Urun() {
        try (BufferedReader read = new BufferedReader(new FileReader(new File("/Users/melisaborekcioglu/Desktop/Urun.txt")))) {
            Urun y = (new Yiyecek("", 0, 0, ""));
            Urun i = (new Icecek("", 0, 0, ""));
            Urun ea = (new EvAletleri(0, "", 0, 0, ""));
            Urun t = (new Telefon( 0, "", 0, 0, ""));
            Urun alt = (new AltGiyim("", "", 0, 0, ""));
            Urun ust = (new UstGiyim("", "", 0, 0, ""));
            Urun det = (new Deterjan("", 0, 0, ""));
            Urun tg = (new TemizlikGerecleri("", 0, 0, ""));
            String satir = read.readLine();
            while (satir != null) {
                int count = 0;
                System.out.println(satir);
                String[] tokens = satir.split(" ");
                for (String token : tokens) {
                    count++;
                    if (count == 1) {
                        switch (token) {
                            case "yiyecek":
                                System.out.println("token: " + token);
                                int coun = 0;
                                for (coun = 1; coun < 5; coun++) {
                                    switch (coun) {
                                        case 1:
                                            y.setCins(tokens[0]);
                                            System.out.println("cins: " + tokens[0]);
                                            break;
                                        case 2:
                                            y.setAd(tokens[1]);
                                            System.out.println("ad: " + tokens[1]);
                                            break;
                                        case 3:
                                            int seri = Integer.parseInt(tokens[2]);
                                            y.setSeriNo(seri);
                                            System.out.println("seriNo: " + y.getSeriNo());
                                            break;
                                        case 4:
                                            int fiyat = Integer.parseInt(tokens[3]);
                                            y.setFiyat(fiyat);
                                            System.out.println("fiyat: " + y.getFiyat());
                                            break;
                                    }
                                }
                                Veriler.urunList.add(y);

                                System.out.println("urunlistesi: " + Veriler.urunList);
                                break;
                            case "icecek":
                                for (int c = 1; c < 5; c++) {
                                    switch (c) {
                                        case 1:
                                            i.setCins(tokens[0]);
                                            System.out.println("cins: " + tokens[0]);
                                            break;
                                        case 2:
                                            i.setAd(tokens[1]);
                                            System.out.println("ad: " + tokens[1]);
                                            break;

                                        case 3:
                                            int fiyat = Integer.parseInt(tokens[2]);
                                            i.setFiyat(fiyat);
                                            System.out.println("fiyat: " + i.getFiyat());
                                            break;
                                        case 4:
                                            int seri = Integer.parseInt(tokens[3]);
                                            i.setSeriNo(seri);
                                            System.out.println("seriNo: " + i.getSeriNo());
                                            break;
                                    }
                                }
                                Veriler.urunList.add(i);

                                System.out.println("urunlistesi: " + Veriler.urunList);
                                break;
                            case "evAletleri":
                                for (int c = 1; c < 6; c++) {
                                    switch (c) {
                                        case 1:
                                            ((EvAletleri) ea).setCins(tokens[0]);
                                            System.out.println("cins: " + tokens[0]);
                                            break;
                                        case 2:
                                            int guc = Integer.parseInt(tokens[1]);
                                            ((EvAletleri) ea).setGuc(guc);
                                            System.out.println("guc: " + ((EvAletleri) ea).getGuc());
                                            break;
                                        case 3:
                                            ((EvAletleri) ea).setAd(tokens[2]);
                                            System.out.println("ad: " + tokens[2]);
                                            break;

                                        case 4:
                                            int fiyat = Integer.parseInt(tokens[3]);
                                            ea.setFiyat(fiyat);
                                            System.out.println("fiyat: " +ea.getFiyat());
                                            break;
                                        case 5:
                                            int seri = Integer.parseInt(tokens[4]);
                                            ea.setSeriNo(seri);
                                            System.out.println("seriNo: " + ea.getSeriNo());
                                            break;
                                    }
                                }
                                Veriler.urunList.add(ea);

                                System.out.println("urunlistesi: " + Veriler.urunList);
                                break;
                            case "telefon":
                                for (int c = 1; c < 7; c++) {
                                    switch (c) {
                                        case 1:
                                            ((Telefon) t).setCins(tokens[0]);
                                            System.out.println("cins: " + tokens[0]);
                                            break;
                                        case 4:
                                            int guc = Integer.parseInt(tokens[3]);
                                            ((Telefon) t).setGuc(guc);
                                            System.out.println("guc: " + ((Telefon) t).getGuc());
                                            break;
                                        case 3:
                                            ((Telefon) t).setAd(tokens[2]);
                                            System.out.println("ad: " + tokens[2]);
                                            break;
                                        case 2:
                                            int seri = Integer.parseInt(tokens[1]);
                                            t.setSeriNo(seri);
                                            System.out.println("seriNo: " + t.getSeriNo());
                                            break;
                                        case 5:
                                            int fiyat = Integer.parseInt(tokens[4]);
                                            t.setFiyat(fiyat);
                                            System.out.println("fiyat: " + t.getFiyat());
                                            break;

                                    }

                                }
                                Veriler.urunList.add(t);
                                System.out.println("urunlistesi: " + Veriler.urunList);
                                break;
                            case "altGiyim":
                                for (int c = 1; c < 6; c++) {
                                    switch (c) {
                                        case 1:
                                            ((AltGiyim) alt).setCins(tokens[0]);
                                            System.out.println("cins: " + tokens[0]);
                                            break;
                                        case 2:
                                            ((AltGiyim) alt).setRenk(tokens[1]);
                                            System.out.println("renk: " + tokens[1]);
                                            break;
                                        case 3:
                                            ((AltGiyim) alt).setAd(tokens[2]);
                                            System.out.println("ad: " + tokens[2]);
                                            break;
                                        case 4:
                                            int seri = Integer.parseInt(tokens[3]);
                                            alt.setSeriNo(seri);
                                            System.out.println("seriNo: " +alt.getSeriNo());
                                            break;
                                        case 5:
                                            int fiyat = Integer.parseInt(tokens[4]);
                                            alt.setFiyat(fiyat);
                                            System.out.println("fiyat: " + alt.getFiyat());
                                            break;
                                    }
                                }
                                Veriler.urunList.add(alt);

                                System.out.println("urunlistesi: " + Veriler.urunList);
                                break;
                            case "üstGiyim":
                                for (int c = 1; c < 6; c++) {
                                    switch (c) {
                                        case 1:
                                            ((UstGiyim) ust).setCins(tokens[0]);
                                            System.out.println("cins: " + tokens[0]);
                                            break;
                                        case 2:
                                            ((UstGiyim) ust).setRenk(tokens[1]);
                                            System.out.println("renk: " + tokens[1]);
                                            break;
                                        case 3:
                                            ((UstGiyim) ust).setAd(tokens[2]);
                                            System.out.println("ad: " + tokens[2]);
                                            break;
                                        case 4:
                                            int seri = Integer.parseInt(tokens[3]);
                                            ust.setSeriNo(seri);
                                            System.out.println("seriNo: " + ust.getSeriNo());
                                            break;
                                        case 5:
                                            int fiyat = Integer.parseInt(tokens[4]);
                                            ust.setFiyat(fiyat);
                                            System.out.println("fiyat: " +ust.getFiyat());
                                            break;

                                    }
                                }
                                Veriler.urunList.add(ust);
                                System.out.println("urunlistesi: " + Veriler.urunList);
                                break;
                            case "deterjan":
                                for (int c = 1; c < 5; c++) {
                                    switch (c) {
                                        case 1:
                                            ((Deterjan) det).setCins(tokens[0]);
                                            System.out.println("cins: " + tokens[0]);
                                            break;
                                        case 2:
                                            ((Deterjan) det).setAd(tokens[1]);
                                            System.out.println("ad: " + tokens[1]);
                                            break;
                                        case 3:
                                            int seri = Integer.parseInt(tokens[2]);
                                            det.setSeriNo(seri);
                                            System.out.println("seriNo: " + seri);
                                            break;
                                        case 4:
                                            int fiyat = Integer.parseInt(tokens[3]);
                                            det.setFiyat(fiyat);
                                            System.out.println("fiyat: " + fiyat);
                                            break;

                                    }
                                }
                                Veriler.urunList.add(det);

                                System.out.println("urunlistesi: " + Veriler.urunList);
                                break;
                            case "temizlikGerecleri":
                                for (int c = 1; c < 5; c++) {
                                    switch (c) {
                                        case 1:
                                            ((TemizlikGerecleri) tg).setCins(tokens[0]);
                                            System.out.println("cins: " + tokens[0]);
                                            break;
                                        case 2:
                                            ((TemizlikGerecleri) tg).setAd(tokens[1]);
                                            System.out.println("ad: " + tokens[1]);
                                            break;
                                        case 3:
                                            int seri = Integer.parseInt(tokens[2]);
                                            tg.setSeriNo(seri);
                                            System.out.println("seriNo: " + tg.getSeriNo());
                                            break;
                                        case 4:
                                            int fiyat = Integer.parseInt(tokens[3]);
                                            tg.setFiyat(fiyat);
                                            System.out.println("fiyat: " +tg.getFiyat());
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                Veriler.urunList.add(tg);

                                System.out.println("urunlistesi: " + Veriler.urunList);
                        }

                    }
                }
                satir = read.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(FileReadTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static void Kisi() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/melisaborekcioglu/Desktop/Personel.txt")))) {
            Personel p = (new Mudur("", "", "", 0, "", 0, ""));
            Musteri m = new Musteri("", "", 0);
            String satir = reader.readLine();
            while (satir != null) {
                int count = 0;
                System.out.println(satir);
                String[] tokens = satir.split(" ");
                for (String token : tokens) {
                    count++;
                    if (count == 5) {
                        p.setYetki(token);
                        if (p.getYetki().equals("mudur")) {
                            count = 0;
                            for (count = 1; count < 8; count++) {
                                switch (count) {
                                    case 1:
                                        p.setIsim(tokens[0]);
                                        System.out.println("isim: " + p.getIsim());
                                        break;
                                    case 2:
                                        p.setSoyad(tokens[1]);
                                        System.out.println("soyisim: " + p.getSoyisim());
                                        break;
                                    case 3:
                                        p.setKullaniciAdi(tokens[2]);
                                        System.out.println("Kullanıcı Adı: " + p.getKullaniciAdi());
                                        break;
                                    case 4:
                                        int y = Integer.parseInt(tokens[3]);
                                        p.setSifre(y);
                                        System.out.println("Sifre: " + p.getSifre());
                                        break;
                                    case 5:
                                        p.setYetki(tokens[4]);
                                        System.out.println("yetki: " + p.getYetki());
                                        break;
                                    case 6:
                                        int x = Integer.parseInt(tokens[5]);
                                        ((Mudur) p).setSubeKodu(x);
                                        System.out.println("Sube Kodu: " + ((Mudur) p).getSubeKodu());
                                        break;
                                    case 7:
                                        ((Mudur) p).setBolum(tokens[6]);
                                        System.out.println("Bolum: " + ((Mudur) p).getBolum());
                                        break;
                                    default:
                                        break;
                                }
                            }
                            Veriler.personelList.add(p);

                            System.out.println("personel listesi");
                            System.out.println(Veriler.personelList);
                            System.out.println("");
                        }
                    } else if (count == 1) {
                        if (token.equals("musteri")) {
                            count = 0;
                            for (count = 1; count < 4; count++) {
                                switch (count) {
                                    case 1:
                                        m.setIsim(tokens[1]);
                                        System.out.println("isim: " + p.getIsim());
                                        break;
                                    case 2:
                                        m.setSoyad(tokens[2]);
                                        System.out.println("soyisim: " + p.getSoyisim());
                                        break;
                                    case 3:
                                        int y = Integer.parseInt(tokens[3]);
                                        m.setMusteriNo(y);
                                        System.out.println("Musteri No: " + m.getMusteriNo());
                                        break;

                                    default:
                                        break;
                                }
                            }
                            Veriler.musteriList.add(m);

                            System.out.println("Müsteri Listesi: ");
                            System.out.println(Veriler.musteriList);
                            System.out.println("");
                        }
                    }
                    //list.add(p);
                }
                satir = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReadTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
