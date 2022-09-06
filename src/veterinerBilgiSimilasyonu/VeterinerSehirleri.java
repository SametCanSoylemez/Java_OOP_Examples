package veterinerBilgiSimilasyonu;

import java.util.ArrayList;

public class VeterinerSehirleri {
    private String sehir;
    private int veterinerSayisi;
    private ArrayList<Veteriner> sehirdekiVeterinerler;

    public VeterinerSehirleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler = new ArrayList<>();
        veterinerSayisi = 0;
    }

    public void sehireVeterinerEkle(Veteriner veteriner) {
        sehirdekiVeterinerler.add(veteriner);
    }

    public void toplamVeterinerSayisi() {
        System.out.println("Toplam veteriner sayısı; " + sehirdekiVeterinerler.size());
    }
}
