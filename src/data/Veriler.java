package data;

import urun.TemizlikGerecleri;
import urun.Deterjan;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import kisi.Kasiyer;
import kisi.Mudur;
import kisi.Musteri;
import kisi.Personel;
import urun.AltGiyim;
import urun.EvAletleri;
import urun.Icecek;
import urun.Telefon;
import urun.Urun;
import urun.UrunAdet;
import urun.UstGiyim;
import urun.Yiyecek;

/**
 *
 * @author melisaborekcioglu
 */
public class Veriler {

    public static ArrayList<Personel> personelList;
    public static ArrayList<Musteri> musteriList;
    public static ArrayList<Urun> urunList;
// 

    static {
        personelList = new ArrayList<>();
//        personelList.add(new Personel("ali", "b", "a", 0, "kasiyer"));
//        personelList.add(new Mudur("mehmet", "b", "mb1", 0, "mudur", 5, "gida"));
//        personelList.add(new Mudur("murat", "b", "mb2", 0, "mudur", 5, "elektronik"));
//        personelList.add(new Mudur("mehmet", "b", "mb3", 0, "mudur", 5, "giyim"));
//        personelList.add(new Mudur("murat", "b", "mb4", 0, "mudur", 5, "temizlik"));

        musteriList = new ArrayList<>();
//        musteriList.add(new Musteri("melisa", "börek", 13));
//        musteriList.add(new Musteri("melis", "b", 12));
        urunList = new ArrayList<>();
//        urunList.add(new Yiyecek("biskrem", 1, 1, "gida"));
//        urunList.add(new Yiyecek("popkek", 2, 2, "gida"));
//        urunList.add(new Yiyecek("tadelle", 3, 1, "gida"));
//        urunList.add(new Yiyecek("benimo", 4, 3, "gida"));
//        urunList.add(new Yiyecek("çubuk kraker", 5, 1, "gida"));
//        urunList.add(new Icecek("su", 1, 1, "gida"));
//        urunList.add(new Icecek("soda", 1, 2, "gida"));
//        urunList.add(new Icecek("meyve suyu", 1, 2, "gida"));
//        urunList.add(new Icecek("gazoz", 1, 3, "gida"));
//        urunList.add(new Icecek("kola", 1, 4, "gida"));
//        urunList.add(new EvAletleri(1000, "süpürge", 1, 200, "elektronik"));
//        urunList.add(new EvAletleri(200, "saç kurutma", 1, 50, "elektronik"));
//        urunList.add(new EvAletleri(100, "mixer", 1, 100, "elektronik"));
//        urunList.add(new EvAletleri(100, "mutfak robotu", 1, 120, "elektronik"));
//        urunList.add(new EvAletleri(100, "gece lambası", 1, 80, "elektronik"));
//        urunList.add(new EvAletleri(200, "vantilatör", 1, 70, "elektronik"));
//        urunList.add(new Telefon(1, 1, "iphone", 1, 3000, "elektronik"));
//        urunList.add(new Telefon(1, 2, "LG", 1, 1500, "elektronik"));
//        urunList.add(new Telefon(1, 3, "samsung", 1, 2500, "elektronik"));
//        urunList.add(new Telefon(1, 4, "venüs", 1, 500, "elektronik"));
//        urunList.add(new AltGiyim("q", "pantolon", 2, 90, "giyim"));
//        urunList.add(new AltGiyim("q", "etek", 2, 100, "giyim"));
//        urunList.add(new UstGiyim("q", "kazak", 3, 60, "giyim"));
//        urunList.add(new UstGiyim("q", "hırka", 3, 70, "giyim"));
//        urunList.add(new UstGiyim("q", "thirt", 3, 40, "giyim"));
//        urunList.add(new Deterjan("omo", 3, 20, "temizlik"));
//        urunList.add(new Deterjan("ariel", 3, 25, "temizlik"));
//        urunList.add(new TemizlikGerecleri("vileda", 3, 30, "temizlik"));
//        urunList.add(new TemizlikGerecleri("elbezi", 3, 10, "temizlik"));
//        siparis = new Siparis(1, 1);

    }
    //instanceof Mudur

    public static Personel kontrol(String kullaniciAdi, int sifre) {

        for (int i = 0; i < personelList.size(); i++) {

            if (personelList.get(i).getKullaniciAdi().equals(kullaniciAdi) && personelList.get(i).getSifre() == sifre) {
                return personelList.get(i);
            }
        }
        System.out.println("kullanıcı bulunamadı");
        return null;
    }

    public static Musteri mKontrol(int musteriNo) {

        for (int i = 0; i < musteriList.size(); i++) {

            if (musteriList.get(i).getMusteriNo() == musteriNo) {
                return musteriList.get(i);
            }
        }
        System.out.println("kullanıcı bulunamadı");
        return null;
    }

//    public static void detayGoruntule(Musteri m, String bolum) {
//        Scanner istek = new Scanner(System.in);
//        System.out.println("detay görüntülemek ister misiniz? E/H");
//        String x = istek.nextLine();
//        if (x.equalsIgnoreCase("e")) {
//            String a = m.getIsim();
//            String b = m.getSoyisim();
//            m.faturaOlustur(bolum);
//            System.out.println("Bir önceki menü");
//           
//        }
//    }
    public static void UrunGetir(Urun u, int i, int count) {
        String cinsi;
        int fiyati;
        count++;
        cinsi = u.getAd();
        fiyati = u.getFiyat();
        System.out.println((count) + ".ürün:" + cinsi + " cins " + fiyati + "TL");
    }

    public static Siparis detayListele(String bolum) {
        for (int i = 0; i < Veriler.musteriList.size(); i++) {
            Musteri m = Veriler.musteriList.get(i);
            Siparis musteriSiparis = Veriler.musteriList.get(i).getSiparis();

            if (musteriSiparis != null) {
                if (musteriSiparis.getUrunListesi() != null) {

                    String ad = Veriler.musteriList.get(i).getIsim();
                    int fiyat = 0;
                    int toplamAdet = 0;
                    for (int j = 0; j < musteriSiparis.getUrunListesi().size(); j++) {
                        String cins = musteriSiparis.getUrunListesi().get(j).getUrun().getCins();

                        if (bolum.equals(cins)) {

                            UrunAdet adet = musteriSiparis.getUrunListesi().get(j);
                            int topFiyat = adet.getAdet() * adet.getUrun().getFiyat();
                            fiyat += topFiyat;
                            System.out.println("toplam: " + topFiyat);
                            toplamAdet++;
                           
                                String a = m.getIsim();
                                String b = m.getSoyisim();
                                m.faturaOlustur(bolum);
                                System.out.println(" ");
                        }

                    }
                }
            }
           
        } return null;
    }

    public static Siparis siparisleriListele(String bolum) {
        for (int i = 0; i < Veriler.musteriList.size(); i++) {
            Musteri m = Veriler.musteriList.get(i);
            Siparis musteriSiparis = Veriler.musteriList.get(i).getSiparis();

            if (musteriSiparis != null && !musteriSiparis.getUrunListesi().isEmpty()) {
                if (musteriSiparis.getUrunListesi() != null) {

                    String ad = Veriler.musteriList.get(i).getIsim();
                    int fiyat = 0;
                    int toplamAdet = 0;
                    for (int j = 0; j < musteriSiparis.getUrunListesi().size(); j++) {
                        String cins = musteriSiparis.getUrunListesi().get(j).getUrun().getCins();

                        if (bolum.equals(cins)) {

                            UrunAdet adet = musteriSiparis.getUrunListesi().get(j);
                            int topFiyat = adet.getAdet() * adet.getUrun().getFiyat();

                            fiyat += topFiyat;
                           
                            toplamAdet++;
                        }
                    }

                    System.out.println(ad + " - " + toplamAdet + " adet ürün" + fiyat + " - tl ");
//                    Veriler.detayGoruntule(m,bolum);
                }
            }
        }
        return null;
    }
}
