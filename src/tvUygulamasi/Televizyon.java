package tvUygulamasi;


import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal = 1;

    public Televizyon(String marka, String boyut) {
        this.marka = marka;
        this.boyut = boyut;
        kanallar = new ArrayList<>();
        ses = 10;
        kanallariOlustır();
        this.acik = false;
    }

    public void sesArttir() {
        if (ses <= 20 && acik == true) {
            ses++;
            System.out.println("Ses Seviyesi: " + ses);
        } else {
            System.out.println("Ses maksimumda daha fazla arttıramazsın veya tv kapalı");
        }
    }

    public void sesAzalt() {
        if (ses > 0 && acik) {
            ses--;
            System.out.println("Ses Seviyesi: " + ses);
        } else {
            System.out.println("Ses minumumda daha fazla azaltamazsınız veya televizyon kapalı.");
        }
    }

    public void tvAc() {
        if (acik == false) {
            acik = true;
            System.out.println("TV açıldı");
        } else {
            System.out.println("Tv zaten açık");
        }
    }

    public void tvKapat() {
        if (acik == true) {
            acik = false;
            System.out.println("TV kapatıldı");
        } else {
            System.out.println("Tv zaten kapalı");
        }
    }

    private void kanallariOlustır() {
        HaberKanali cnn = new HaberKanali("Cnn", 1, "Genel Haber");
        kanallar.add(cnn);
        MuzikKanali powerTurk = new MuzikKanali("Power Turk", 2, "Yerli");
        kanallar.add(powerTurk);
    }

    public void kanalDegistir(int acilmasiİstenenKanal) {
        if (acik) {
            if (acilmasiİstenenKanal != aktifKanal) {
                if (acilmasiİstenenKanal <= kanallar.size()) {
                    aktifKanal = acilmasiİstenenKanal;
                    System.out.println("Kanal: " + acilmasiİstenenKanal + "Bilgi: " + kanallar.get(acilmasiİstenenKanal - 1).kanalBilgisiniGoster());
                } else {
                    System.out.println("Lütfen geçerli bir kanal numarası giriniz.");
                }

            } else {
                System.out.println("Zaten" + aktifKanal + " . kanaşdasınız. değiiştirme yapılmadı.");
            }

        } else {
            System.out.println("Önce televizyonu açınız");
        }

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "marka: " + marka + " boyut: " + boyut + " olan tv'i oluşturuldu.";
    }
}
