package kisi;

import data.Siparis;
import java.util.Date;
import java.util.Random;
import urun.Urun;
import urun.UrunAdet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author melisaborekcioglu
 */
public class Musteri extends Kisi {

    private Siparis siparis;
    private int musteriNo;

    public Musteri() {
        this(null, null,0);
    }

    public Musteri(String ad, String soyad, Integer musteriNo) {
        super(ad, soyad);
//        this.kartliMi = kartliMi;
        this.musteriNo = musteriNo;
        Random rand = new Random();
        int n = rand.nextInt(100000) + 1;
        this.siparis = new Siparis(n);
//        this.siparis.addUrun(new Urun("urun1", 123123, 100, "giyim"));
//         this.siparis.addUrun(new Urun("urun2", 4444, 50, "gida"));
//         this.siparis.addUrun(new Urun("urun3", 4455, 150, "gida"));
    }

    public int getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(int musteriNo) {
        this.musteriNo = musteriNo;
    }

    public Siparis getSiparis() {
        return siparis;
    }

    public void setSiparis(Siparis siparis) {
        this.siparis = siparis;
    }

    public void faturaOlustur(String bolum) {
        int count = 0;
        System.out.println("  fatura      ürün adı    fiyat    seri no            tarih                        müsteri adı-soyadı");

        for (int i = 0; i < siparis.getUrunListesi().size(); i++) {
            UrunAdet urunAdet = siparis.getUrunListesi().get(i);
            String uad = urunAdet.getUrun().getAd();
            int fiyat = urunAdet.getUrun().getFiyat();
            int seriNo = urunAdet.getUrun().getSeriNo();
            String cins = urunAdet.getUrun().getCins();
            if (bolum.equals(cins)) {
                count++;
                Date simdikiZaman = new Date();
                System.out.println(count + ".fatura:      " + uad + "      " + fiyat + "         " + seriNo + "         " + simdikiZaman.toString() + "    " + getIsim() + " " + getSoyisim());
            }
        }
    }

}
