package kursPlayer;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("ali", "alinin tanıtım yazısı", "ali_udemy");
        Egitmen can = new Egitmen("Can", "Can ile Java", "CanSoylemez");
        Egitmen anil = new Egitmen("Anil", "Anıl ile Java", "AnilDemiryürek");
        System.out.println(ogr1);
        System.out.println(can);

        Ders d1 = new Ders(1, "Giris", 3.5);
        Ders d2 = new Ders(2, "Java Nedir?", 9.2);
        Ders d3 = new Ders(3, "Primitive Veri Tipleri", 22.9);
        Ders d4 = new Ders(4, "Diziler", 15.9);
        Ders d5 = new Ders(5, "Metotlar", 15.9);

        Ders d6 = new Ders(6, "Nesneler", 20.4);
        Ders d7 = new Ders(7, "Try Catch", 30.5);
        Ders d8 = new Ders(8, "Recyclerview", 10.7);
        Ders d9 = new Ders(9, "Sharedpreferencas", 14.0);
        Ders d10 = new Ders(10, "Firebase", 17.6);


        Kurs javaKursu = new Kurs("İleri Seviye Java Kursu", can);
        javaKursu.kursaDersEkle(d1);
        javaKursu.kursaDersEkle(d2);
        javaKursu.kursaDersEkle(d3);
        javaKursu.kursaDersEkle(d4);
        javaKursu.kursaDersEkle(d5);

        javaKursu.kursaEgitmenEkle(anil);
        javaKursu.kursaEgitmenSil(can);
        javaKursu.kursaEgitmenSil(anil);

        Kurs andridKursu = new Kurs("Android Kursu", can);
        andridKursu.kursaDersEkle(d6);
        andridKursu.kursaDersEkle(d7);
        andridKursu.kursaDersEkle(d8);
        andridKursu.kursaDersEkle(d9);
        andridKursu.kursaDersEkle(d10);

        ogr1.kursaKatil(javaKursu);
        ogr1.kursaKatil(andridKursu);

        ogr1.izlenecekDersEkle(d6);
        ogr1.izlenecekDersEkle(d2);
        ogr1.izlenecekDersEkle(d8);
        ogr1.izlenecekDersEkle(d7);

        listeyiOynat(ogr1.getIzlenecekDersListesi());
    }

    public static void listeyiOynat(LinkedList<Ders> izlenecekDersler) {

        Scanner klavye = new Scanner(System.in);
        boolean cikis = false;
        boolean ileriHareket = true;

        ListIterator<Ders> iterator = izlenecekDersler.listIterator();
        if (izlenecekDersler.size() == 0) {
            System.out.println("Henüz bir ders eklenmemiş");
        } else {
            Ders ilkDers = iterator.next();
            System.out.println("Şu an izlenen ders: " + ilkDers.getDersBaslik() + " Süre: " + ilkDers.getDakika());
        }
        menuGoster();
        while (!cikis) {
            System.out.println("Seçiminiz : ");
            int kullaniciSeçimi = klavye.nextInt();
            switch (kullaniciSeçimi) {

                case 0:
                    System.out.println("Uygulamadan Çıkılıyor");
                    cikis = true;
                    break;
                case 1:
                    if (iterator.hasNext()) {
                        Ders ilkDers = iterator.next();
                        System.out.println("====================================");
                        System.out.println("ŞUAN OYNATILAN : Ders no : " + ilkDers.getDersNo() + " Başlık: " + ilkDers.getDersBaslik() + " Süre: " + ilkDers.getDakika());
                        System.out.println("====================================");
                    } else {
                        System.out.println("Listenin sonuna geldiniz.");
                    }
                    break;
                case 2:
                    if (ileriHareket) {
                        ileriHareket = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        Ders ilkDers = iterator.previous();
                        System.out.println("====================================");
                        System.out.println("ŞUAN OYNATILAN : Ders no : " + ilkDers.getDersNo() + " Başlık: " + ilkDers.getDersBaslik() + " Süre: " + ilkDers.getDakika());
                        System.out.println("====================================");
                    } else {
                        System.out.println("Listenin başına geldiniz.");

                    }
                case 3:
                    izlenecekDersleriListele(izlenecekDersler);
                    break;
                case 9:
                    menuGoster();
                    break;
            }
        }
    }

    private static void izlenecekDersleriListele(LinkedList<Ders> izlenecekDersler) {
        ListIterator<Ders> iterator = izlenecekDersler.listIterator();
        if (izlenecekDersler.size() == 0) {
            System.out.println("Henüz bir ders eklenmemiş");
            return;
        } else {

            while (iterator.hasNext()) {
                Ders ilkDers = iterator.next();
                System.out.println("Ders no : " + ilkDers.getDersNo() + " Başlık: " + ilkDers.getDersBaslik() + " Süre: " + ilkDers.getDakika());
            }

        }
    }

    private static void menuGoster() {
        System.out.println("--------- MENU --------");
        System.out.println("0 - Cikis");
        System.out.println("1 - Bir sonraki derse git");
        System.out.println("2 - Bir önceki derse git");
        System.out.println("3 - Tüm listeyi göster");
        System.out.println("9 - Menu");
    }
}
