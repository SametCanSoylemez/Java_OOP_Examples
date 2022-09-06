package veterinerBilgiSimilasyonu;

public class Kopek extends Hayvan {

    private String tur;
    private String cinsi;
    private int asiSayisi;

    public Kopek(String dogumTarihi, boolean kayitli, String cinsi, int asiSayisi) {
        super(dogumTarihi, kayitli);
        this.tur = "Köpek";
        this.cinsi = cinsi;
        this.asiSayisi = asiSayisi;

    }

    @Override
    void bilgileriGöster() {
        System.out.println(toString() + " Kayıtlı Mı: " + isKayitli() + " Dogum Tarihi: " + getDogumTarihi());
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "Türr='" + tur + '\'' +
                ", Cinsi='" + cinsi + '\'' +
                ", Aşı Sayısı= " + asiSayisi +
                '}';
    }
}
