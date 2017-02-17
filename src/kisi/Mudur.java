package kisi;


import static kisi.Kasiyer.kasiyerRapor;

/**
 * Sadece kendi bölümüne ait raporları görebilir.
 *
 * @author melisaborekcioglu
 */
public class Mudur extends MagazaPersoneli {

    private String bolum; //gıda, giyim vs.

    public Mudur() {
        super(null, null, null, 0, null, 0);
    }

    public Mudur(String ad, String soyad, String kullaniciAdi, int sifre, String yetki, int subeKodu, String bolum) {
        super(ad, soyad, kullaniciAdi, sifre, yetki, subeKodu);
        this.bolum = bolum;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public static void Rapor() {
        kasiyerRapor();
    }

    
}
