package kursPlayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ogrenci extends Kisi {

    private ArrayList<Kurs> katildigiKurslar;
    private LinkedList<Ders> izlenecekDersListesi;
    private Ders izlenecekDers;

    public Ogrenci(String isim, String tanitimYazisi, String kullaniciAdi) {
        super(isim, tanitimYazisi, kullaniciAdi);
        katildigiKurslar = new ArrayList<>();
        izlenecekDersListesi = new LinkedList<>();
    }

    @Override
    public String toString() {
        return super.toString() + "Ogrenci{" +
                "katildigiKurslar=" + katildigiKurslar +
                '}';
    }

    public Ders getIzlenecekDers() {
        return izlenecekDers;
    }

    public LinkedList<Ders> getIzlenecekDersListesi() {
        return izlenecekDersListesi;
    }

    public void kursaKatil(Kurs javaKursu) {
        if (javaKursu.yayindaKontrol()) {
            javaKursu.getKursOgrencileri().add(this);
            katildigiKurslar.add(javaKursu);
            System.out.println(this.getIsim() + " kullanıcısı " + javaKursu.getKursAdi() + " kursuna katıldı.");
        } else {
            System.out.println(javaKursu.getKursAdi() + " isimli kurs yayında değil katılamazsınız..");
        }
    }

    public void izlenecekDersEkle(Ders izlenecekDers) {
        boolean dersBulundu = false;
        if (katildigiKurslar.size() > 0) {

            for (Kurs gecici : katildigiKurslar) {
                if (gecici.getKurstakiDersler().contains(izlenecekDers)) {
                    System.out.println("İzlenecekler listesine" + gecici.getKursAdi() + " kursunda bulunan " + izlenecekDers.getDersBaslik() + " ders eklendi");
                    izlenecekDersListesi.add(izlenecekDers);
                    dersBulundu = true;
                    break;
                }
            }
            if (!dersBulundu) {
                System.out.println("Girilen ders kurslarda bulunamadı veya yetkisiz erişim");
            }
        }
    }
}
