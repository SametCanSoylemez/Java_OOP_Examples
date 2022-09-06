package veterinerBilgiSimilasyonu;

public class Main {

    public static void main(String[] args) {
        ilkNesneleriOlustur();

    }

    private static void ilkNesneleriOlustur() {
        Kedi kedi1 = new Kedi("01.01.2001", true, "Van Kedisi");
        Kedi kedi2 = new Kedi("02.02.2002", false, "British Kedisi");
        Kedi kedi3 = new Kedi("03.03.2003", true, "Siyam Kedisi");

        Kopek kopek1 = new Kopek("04.04.2004", true, "Doberman", 4);
        Kopek kopek2 = new Kopek("05.05.2005", true, "Shiba", 5);
        Kopek kopek3 = new Kopek("06.06.2006", true, "Pitbul", 5);

        Musteri musteri1 = new Musteri("Can", "123", "Malatya");
        musteri1.hayvanEkle(kedi1);
        musteri1.hayvanEkle(kopek1);

        Musteri musteri2 = new Musteri("Ahmet", "321", "Elazığ");
        musteri2.hayvanEkle(kedi2);
        musteri2.hayvanEkle(kopek2);

        Musteri musteri3 = new Musteri("Mustafa", "789", "İstanbul");
        musteri3.hayvanEkle(kedi3);
        musteri3.hayvanEkle(kopek3);

        Veteriner veteriner1 = new Veteriner("Ayşe", "147", "Fırat Üniversitesi", "5 Yıl");
        veteriner1.musteriEkle(musteri1);
        veteriner1.musteriEkle(musteri2);

        Veteriner veteriner2 = new Veteriner("fatma", "258", "Fırat Üniversitesi", "5 Ay");
        veteriner2.musteriEkle(musteri2);
        veteriner2.musteriEkle(musteri3);

        Veteriner veteriner3 = new Veteriner("Hayriye", "369", "Fırat Üniversitesi", "6 Yıl");
        veteriner2.musteriEkle(musteri3);

        veteriner1.musterilerListele();

        VeterinerSehirleri ankara = new VeterinerSehirleri("Ankara");
        ankara.sehireVeterinerEkle(veteriner1);
        ankara.sehireVeterinerEkle(veteriner3);

        VeterinerSehirleri izmir = new VeterinerSehirleri("İzmir");
        izmir.sehireVeterinerEkle(veteriner3);

        ankara.toplamVeterinerSayisi();
        izmir.toplamVeterinerSayisi();

        System.out.println("Yönetim Paneli");

        YonetimPaneli<Hayvan> hayvanYonetimPaneli = new YonetimPaneli<>();
        hayvanYonetimPaneli.bilgileriGoster(kedi1);
        hayvanYonetimPaneli.bilgileriGoster(kopek1);

        YonetimPaneli<Musteri> musteriYonetimPaneli = new YonetimPaneli<>();
        musteriYonetimPaneli.bilgileriGoster(musteri1);

        musteriYonetimPaneli.sahipOlduguHayvanlar(musteri1);
    }
}
