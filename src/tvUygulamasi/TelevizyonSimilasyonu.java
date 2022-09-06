package tvUygulamasi;

import java.util.Scanner;

public class TelevizyonSimilasyonu {

    static Scanner klavye = new Scanner(System.in);
    static Televizyon tv;


    public static void main(String[] args) {
        menuGoster();
        boolean cikis = false;

        while (!cikis) {
            System.out.println("Seçiminiz : Menüyü görmek için 8'i tuşlayınız");
            int secim = klavye.nextInt();
            switch (secim) {
                case 1:
                    tvKurveKanallariOlustur();
                case 2:
                    tvAc();
                    break;
                case 3:
                    sesArttir();
                    break;
                case 4:
                    sesAzalt();
                    break;
                case 5:
                    kanalDegistir();
                case 7:
                    tvKapat();
                    break;
                case 8:
                    menuGoster();
                    break;
                case 0:
                    System.out.println("Sistemden çıkılıyor");
                    cikis = true;
                    break;
                default:
                    System.out.println("0 ile 8 arasında bir değer giriniz.");
                    break;
            }
        }
    }

    private static void kanalDegistir() {
        if (tv != null) {
            System.out.println("Hangi kanalı görmek istiyorsunuz?\n");
            int acilmasiIstenenKanal = klavye.nextInt();
            tv.kanalDegistir(acilmasiIstenenKanal);
            tv.kanalDegistir(2);
        } else {
            System.out.println("Önce tv yi kurun ve kanalları oluşturun");
        }
    }

    private static void sesArttir() {
        if (tv != null) {
            tv.sesArttir();
        } else {
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun.");
        }
    }

    private static void sesAzalt() {
        if (tv != null) {
            tv.sesAzalt();
        } else {
            System.out.println("Önce Tv yi kurun ve kanalları oluşturun.");
        }
    }

    private static void tvKapat() {
        if (tv != null) {
            tv.tvKapat();
        } else {
            System.out.println("Önce tv'yi kurun ve kanalları oluşturun");
        }
    }

    private static void tvAc() {
        if (tv != null) {
            tv.tvAc();
        } else {
            System.out.println("Önce v'tyi kurun ve kanalları oluşturun");
        }
    }

    private static void tvKurveKanallariOlustur() {

        if (tv == null) {
            klavye.nextLine();
            System.out.println("Televizyon markasını giriniz");
            String marka = klavye.nextLine();
            System.out.println("Televizyonun boyutunu giriniz");
            String boyut = klavye.nextLine();
            tv = new Televizyon(marka, boyut);
            System.out.println(tv);
        } else {
            System.out.println(tv);
        }
    }

    private static void menuGoster() {
        System.out.println("------------Menü-----------");
        System.out.println("""
                0 -- Çıkış
                1 -- Televizyonu Kur
                2 -- Televizyonu Aç
                3 -- Sesi Arttır
                4 -- Sesi Azalt
                5 -- Kanaı Değiştir
                6 -- Kanal Bilgisini Göster
                7 -- Televizyonu Kapat
                8 -- Menüyü Göster
                """);
    }
}
