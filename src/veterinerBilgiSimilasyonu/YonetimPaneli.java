package veterinerBilgiSimilasyonu;

public class YonetimPaneli<T> {

    public void bilgileriGoster(T nesne) {
        System.out.println(nesne);
    }

    public <T extends Musteri> void sahipOlduguHayvanlar(T musteri) {
        musteri.MusteriHayvanlariniListele();
    }
}
