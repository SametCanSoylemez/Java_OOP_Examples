package veterinerBilgiSimilasyonu;

public class Kedi extends Hayvan {

    private String tur;
    private String cinsi;


    public Kedi(String dogumTarihi, boolean kayitli, String cinsi) {
        super(dogumTarihi, kayitli);
        this.tur = "Kedi";
        this.cinsi = cinsi;
    }

    @Override
    void bilgileriGöster() {
        System.out.println(toString() + " Kayıtlı mı: " + isKayitli() + " Dogum Tarihi: " + getDogumTarihi());
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "tur='" + tur + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
