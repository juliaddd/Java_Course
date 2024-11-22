public class Pojazd extends Maszyna implements Jezdzacy{
    public int predkosc;

    Pojazd(String nazwa, String numerSeryjny, int predkosc) {
        super(nazwa, numerSeryjny);
        this.predkosc = predkosc;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "numerSeryjny='" + numerSeryjny + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }

    @Override
    public void przyspiesz() {
        predkosc++;
        System.out.println(nazwa + ": prędkość wynosi " + predkosc + " km/h");

    }

    @Override
    public void zwolnij() {
        if (predkosc > 0) {
            predkosc--;
            System.out.println(nazwa + ": prędkość wynosi " + predkosc + " km/h");
        } else {
            System.out.println(nazwa + " już stoi");
        }
    }
}
