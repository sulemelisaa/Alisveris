/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Siparis;
import data.Veriler;
import static file.FileRead.Kisi;
import static file.FileRead.Urun;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import kisi.Mudur;
import kisi.Musteri;
import kisi.Personel;
import urun.AltGiyim;
import urun.Deterjan;
import urun.EvAletleri;
import urun.Icecek;
import urun.Telefon;
import urun.TemizlikGerecleri;
import urun.Urun;
import urun.UrunAdet;
import urun.UstGiyim;
import urun.Yiyecek;

/**
 *
 * @author melisaborekcioglu
 */
public class Run {

    public static void main(String[] args) {
               Kisi();
               Urun();
        while (true) {
            try {
                System.out.println("* * * * * * * * * * * *  HOŞ GELDİNİZ  * * * * * * * * * * * *");
                Scanner giris = new Scanner(System.in);
                System.out.println(" ");
                System.out.println("Giriş seçiniz: ");
                System.out.println("1-Müsteri ");
                System.out.println("2-Personel ");
                int d = giris.nextInt();
                String cinsi;
                int fiyati;
                
                
                if (d == 2) {
                    Scanner kullanıcıAdı = new Scanner(System.in);
                    System.out.println("Kullanıcı adınızı giriniz : ");
                    String a = kullanıcıAdı.nextLine();
                    Scanner sifre = new Scanner(System.in);
                    System.out.println("Şifre girin :");
                    int b = sifre.nextInt();
                    Personel p;
                    p = Veriler.kontrol(a, b);
                            if (p != null) {
                                if (p instanceof Mudur) {
                            String bolum = ((Mudur) p).getBolum();
                            Siparis cins = Veriler.siparisleriListele(bolum);
                            System.out.println("detay istiyo musun ? ");
                            Scanner detay = new Scanner(System.in);
                            String mn = detay.nextLine();
                            if (mn.equals("e")){
                                Veriler.detayListele(bolum);
                            }
                            else{
                            break;
                            }
                            
                                }
                        } 
                    
                    
                } else if (d == 1) {
                    //Müşteri no sorulacak, musteri olşacak
                    Scanner musNo = new Scanner(System.in);
                    System.out.println("Müşteri Numaranızı Giriniz : ");
                    int mn = musNo.nextInt();
                    Musteri musteri;
                    musteri = Veriler.mKontrol(mn);
                    System.out.println(" ");

                    do {
                        if (musteri != null) {
                            Scanner secim = new Scanner(System.in);
                            System.out.println("       LÜTFEN UYGUN BÖLÜMÜ SEÇİNİZ        ");
                            System.out.println(" ");
                            System.out.println("1-GIDA ");
                            System.out.println("2-ELEKTRONİK ");
                            System.out.println("3-GİYİM");
                            System.out.println("4-TEMİZLK");
                            System.out.println("5-ÖNCEKİ MENÜ");
                            int sec = secim.nextInt();
                            ArrayList<Urun> tempUrunList = new ArrayList<>();
                            //gida bölümü
                            if (sec == 1) {
                                System.out.println(" ");
                                Scanner gida = new Scanner(System.in);
                                System.out.println("1-Yiyecek: ");
                                System.out.println("2-İcecek: ");
                                System.out.println("3-Önceki Menü: ");

                                int g = gida.nextInt();

                                //yiyecek bölümü
                                if (g == 1) {
                                    int count = -1;
                                    for (int i = 0; i < Veriler.urunList.size(); i++) {
                                        Urun u = Veriler.urunList.get(i);
                                        if (u instanceof Yiyecek) {
                                            count++;
                                            Veriler.UrunGetir(u, i, count);
                                            tempUrunList.add(u);
                                        }

                                    }
                                    urunSec(musteri, tempUrunList);
                                }
                                //icecek
                                if (g == 2) {
                                    int count = -1;
                                    for (int i = 0; i < Veriler.urunList.size(); i++) {
                                        Urun u = Veriler.urunList.get(i);
                                        if (u instanceof Icecek) {
                                            count++;
                                            Veriler.UrunGetir(u, i, count);
                                            tempUrunList.add(u);
                                        }
                                    }
                                    urunSec(musteri, tempUrunList);
                                }
                            }

                            //elektronik bölümü
                            if (sec == 2) {
                                System.out.println(" ");
                                Scanner el = new Scanner(System.in);
                                System.out.println("1-Ev Aletleri: ");
                                System.out.println("2-Telefon ");
                                System.out.println("3-Önceki menü");
                                int e = el.nextInt();
                                //ev aletleri
                                if (e == 1) {
                                    int count = -1;
                                    for (int i = 0; i < Veriler.urunList.size(); i++) {
                                        Urun u = Veriler.urunList.get(i);
                                        if (u instanceof EvAletleri) {
                                            count++;
                                            Veriler.UrunGetir(u, i, count);
                                            tempUrunList.add(u);
                                        }
                                    }
                                    urunSec(musteri, tempUrunList);
                                }
                                //telefon
                                if (e == 2) {
                                    int count = -1;
                                    for (int i = 0; i < Veriler.urunList.size(); i++) {
                                        Urun u = Veriler.urunList.get(i);
                                        if (u instanceof Telefon) {
                                            count++;
                                            Veriler.UrunGetir(u, i, count);
                                            tempUrunList.add(u);
                                        }
                                    }
                                    urunSec(musteri, tempUrunList);
                                }
                            }
                            // giyim bölümü
                            if (sec == 3) {
                                System.out.println(" ");
                                Scanner giyim = new Scanner(System.in);
                                System.out.println("1-Üst Giyim: ");
                                System.out.println("2-Alt Giyim ");
                                System.out.println("3-Önceki menü");
                                int giy = giyim.nextInt();
                                //üst giyim
                                if (giy == 1) {
                                    int count = -1;
                                    for (int j = 0; j < Veriler.urunList.size(); j++) {
                                        Urun u = Veriler.urunList.get(j);
                                        if (u instanceof UstGiyim) {
                                            count++;
                                            Veriler.UrunGetir(u, j, count);
                                            tempUrunList.add(u);
                                        }
                                    }
                                    urunSec(musteri, tempUrunList);
                                }
                                //alt giyim
                                if (giy == 2) {
                                    int count = -1;
                                    for (int i = 0; i < Veriler.urunList.size(); i++) {
                                        Urun u = Veriler.urunList.get(i);
                                        if (u instanceof AltGiyim) {
                                            count++;
                                            Veriler.UrunGetir(u, i, count);
                                            tempUrunList.add(u);
                                        }
                                    }
                                    urunSec(musteri, tempUrunList);
                                }
                            }
                            // temizlik bölümü
                            if (sec == 4) {
                                System.out.println(" ");
                                Scanner temizlik = new Scanner(System.in);
                                System.out.println("1-Deterjanlar: ");
                                System.out.println("2-Temizlik gereçleri:");
                                System.out.println("3-Önceki menü");
                                int t = temizlik.nextInt();
                                //ev aletleri
                                if (t == 1) {
                                    int count = -1;
                                    for (int i = 0; i < Veriler.urunList.size(); i++) {
                                        Urun u = Veriler.urunList.get(i);
                                        if (u instanceof Deterjan) {
                                            count++;
                                            Veriler.UrunGetir(u, i, count);
                                            tempUrunList.add(u);
                                        }
                                    }
                                    urunSec(musteri, tempUrunList);
                                }

                                //telefon
                                if (t == 2) {
                                    int count = -1;
                                    System.out.println(" ");
                                    for (int i = 0; i < Veriler.urunList.size(); i++) {
                                        Urun u = Veriler.urunList.get(i);
                                        if (u instanceof TemizlikGerecleri) {
                                            count++;
                                            Veriler.UrunGetir(u, i, count);
                                            tempUrunList.add(u);
                                        }
                                    }
                                    urunSec(musteri, tempUrunList);
                                }
                                if (t == 3) {
                                    continue;
                                }
                            }
                            if (sec == 5) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } while (1 == 1);
                }

            } catch (InputMismatchException e) {
                System.out.println("lütfen sayı giriniz !");
            }

        }
    }

    public static void urunSec(Musteri m, ArrayList<Urun> tempUrunList) {
        int coun;
        int adet;
        int s;

        String a;

        do {
            int fiyat = 0;
            int toplam = 0;
            int toplamTutar = 0;
            Scanner b = new Scanner(System.in);
            System.out.println("Ürün seciniz: ");
            s = b.nextInt();
            if (s != -1) {
                coun = 0;
                for (int i = 0; i < tempUrunList.size(); i++) {
                    Urun u = tempUrunList.get(i);
                    UrunAdet urunAdet = new UrunAdet(u, 0);
                    coun++;
                    if (coun == s) {
                        fiyat = u.getFiyat();
                        System.out.println("fiyat:" + fiyat);
                        System.out.println("Ürün adedi: ");
                        adet = b.nextInt();
                        System.out.println("adet:" + adet);
                        urunAdet.setAdet(adet);
                        m.getSiparis().addUrun(urunAdet);
                        break;
                    }
                }
            } else {
                break;
            }
            System.out.println("toplamTutar: " + toplamTutar);
            for (int i = 0; i < m.getSiparis().getUrunListesi().size(); i++) {
                UrunAdet ua = m.getSiparis().getUrunListesi().get(i);
                toplam = ua.getAdet() * ua.getUrun().getFiyat();
                toplamTutar += ua.getAdet() * ua.getUrun().getFiyat();
            }

            System.out.println("Ürününüz sepete eklendi!");
            System.out.println("toplam: " + toplam);
            System.out.println("toplam tutar: " + toplamTutar);
            System.out.println("Devam etmek ister misiniz?(E/H)");
            Scanner y = new Scanner(System.in);
            a = y.nextLine();
        } while (a.equalsIgnoreCase("e"));
    }
}
