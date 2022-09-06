package veterinerBilgiSimilasyonu;

abstract public class Kisi {
    private String isim;
    private String tc;

    public Kisi(String isim, String tc) {
        this.isim = isim;
        this.tc = tc;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;

    }

    abstract void kendiniTanit();

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", tc='" + tc + '\'' +
                '}';
    }


}
