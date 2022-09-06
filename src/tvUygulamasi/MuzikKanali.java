package tvUygulamasi;

public class MuzikKanali extends Kanal {

    private String muzikTuru;

    public MuzikKanali(String ad, int kanalNo, String muzikTuru) {
        super(ad, kanalNo);
        this.muzikTuru = muzikTuru;
    }
}
