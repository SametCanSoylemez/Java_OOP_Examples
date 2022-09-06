package veterinerBilgiSimilasyonu;

import java.util.ArrayList;

public class Veteriner extends Kisi {

    private String mezunOlduguOkul;
    private String caismaSuresi;
    private ArrayList<Musteri> veterinerMusterileri;
    private int musteriSayisi;

    public Veteriner(String isim, String tc, String mezunOlduguOkul, String caismaSuresi) {
        super(isim, tc);
        this.mezunOlduguOkul = mezunOlduguOkul;
        this.caismaSuresi = caismaSuresi;
        veterinerMusterileri = new ArrayList<>();
        musteriSayisi = 0;
    }

    public void musteriEkle(Musteri musteri) {
        veterinerMusterileri.add(musteri);
        musteriSayisi++;
    }

    public void musterilerListele() {
        for (Musteri m : veterinerMusterileri) {
            m.kendiniTanit();
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(toString() + "Ben bir veterinerim.");
    }

    @Override
    public String toString() {
        return super.toString() + "Veteriner{" +
                " Mezun Olduğu Okul= '" + mezunOlduguOkul + '\'' +
                ", Calışma Süresi ='" + caismaSuresi + '\'' +
                '}';
    }


}
