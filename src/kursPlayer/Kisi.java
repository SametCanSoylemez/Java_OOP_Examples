package kursPlayer;

public abstract class Kisi {
    private String isim;
    private String tanitimYazisi;
    private String kullaniciAdi;

    public Kisi() {

    }

    public Kisi(String isim, String tanitimYazisi, String kullaniciAdi) {
        this.isim = isim;
        this.tanitimYazisi = tanitimYazisi;
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getIsim() {                 // Herhangi bir döngü vs işlem yapmayacağımız için setter metotları
        return isim;                          // kullanmaya gerek duymadık.
    }

    public String getTanitimYazisi() {
        return tanitimYazisi;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", tanitimYazisi='" + tanitimYazisi + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                '}';
    }

}
