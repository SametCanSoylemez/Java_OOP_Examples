package veterinerBilgiSimilasyonu;

import java.util.ArrayList;

public class Musteri extends Kisi {

    private String adres;
    private ArrayList<Hayvan> musteriHayvanlari;

    public Musteri(String isim, String tc, String adres) {
        super(isim, tc);
        this.adres = adres;
        musteriHayvanlari = new ArrayList<>();
    }

    public void hayvanEkle(Hayvan hayvan) {
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan + " " + getIsim() + " müşterine eklendi.");
    }

    public void MusteriHayvanlariniListele() {
        for (Hayvan h : musteriHayvanlari) {
            System.out.println(h);
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString() + "Ben bir müşteriyim.");
    }

    @Override
    public String toString() {
        return super.toString() + "Musteri{" +
                "adres='" + adres + '\'' +
                '}';
    }
}
