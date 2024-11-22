public class Samochod extends Pojazd{
    public enum Marka{
        TOYOTA, BMW, CITROEN, AUDI
    };
    public Marka marka;

    public Samochod(String nazwa, String numerSeryjny, int predkosc, Marka marka) {
        super(nazwa, numerSeryjny, predkosc);
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka=" + marka +
                ", predkosc=" + predkosc +
                ", nazwa='" + nazwa + '\'' +
                ", numerSeryjny='" + numerSeryjny + '\'' +
                '}';
    }
}
