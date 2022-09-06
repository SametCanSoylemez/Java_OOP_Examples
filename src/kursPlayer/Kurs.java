package kursPlayer;

import java.util.ArrayList;

public class Kurs {

    private String kursAdi;
    private ArrayList<Ders> kurstakiDersler;
    private ArrayList<Egitmen> kursEgitmenleri;         // Bir kursda birden fazla eğitmen olabilir.
    private ArrayList<Ogrenci> kursOgrencileri;
    private boolean yayinda;                            // Ders sayısı en az 5 ve toplam 60 dkaika olmalı.

    public Kurs(String kursAdi, Egitmen basEgitmen) {
        this.kursAdi = kursAdi;
        this.kurstakiDersler = new ArrayList<>();
        this.kursEgitmenleri = new ArrayList<>();
        this.kursOgrencileri = new ArrayList<>();
        kursEgitmenleri.add(0, basEgitmen);
        this.yayinda = false;
    }

    public ArrayList<Ogrenci> getKursOgrencileri() {
        return kursOgrencileri;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void kursaEgitmenEkle(Egitmen yeniEgitmen) {
        if (!kursEgitmenleri.contains(yeniEgitmen)) {
            kursEgitmenleri.add(yeniEgitmen);
            System.out.println(yeniEgitmen.getIsim() + " kursa eğitmen olarak eklendi..");
        } else {
            System.out.println(yeniEgitmen.getIsim() + "zaten kursa tanımlı bir eğitmendir.");
        }
    }

    public void kursaEgitmenSil(Egitmen silinecekEgitmen) {
        if (silinecekEgitmen.getIsim().equals(kursEgitmenleri.get(0).getIsim())) {
            System.out.println(silinecekEgitmen.getIsim() + " kursun baş eğitmeni o yüden silinemez...");
        } else {
            kursEgitmenleri.remove(silinecekEgitmen);
            System.out.println(silinecekEgitmen.getIsim() + " kurs eğitmenliğinden silindi..");
        }
    }

    public void kursaDersEkle(Ders eklenecekDers) {
        kurstakiDersler.add(eklenecekDers);
    }

    public int kursakiDersSayisi() {
        return kurstakiDersler.size();
    }

    public int kurstakiDerslerinDakikaSuresi() {
        double toplamSure = 0;
        for (Ders ders : kurstakiDersler) {
            toplamSure = toplamSure + ders.getDakika();

        }
        return (int) toplamSure;
    }

    public boolean yayindaKontrol() {
        if (kurstakiDersler.size() >= 5 && kurstakiDerslerinDakikaSuresi() >= 60) {
            yayinda = true;
            return true;
        } else return false;
    }

    public void kursaOgrenciEkle(Ogrenci kursOgrencisi) {
        if (yayindaKontrol()) {
            kursOgrencileri.add(kursOgrencisi);

        }
    }

    public ArrayList<Ders> getKurstakiDersler() {
        return kurstakiDersler;
    }
}
