package kursPlayer;

public class Egitmen extends Ogrenci {                // Her eğitmen aynı zamanda bir öğrenci niteliği taşıdığı için.

    public Egitmen(String isim, String tanitimYazisi, String kullaniciAdi) {
        super(isim, tanitimYazisi, kullaniciAdi);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
