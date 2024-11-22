public class Samolot extends Pojazd implements Latajacy{
    public int wysokoscLotu;
    public Samolot(String nazwa, String numerSeryjny, int predkosc, int wysokoscLotu) {
        super(nazwa, numerSeryjny, predkosc);
        this.wysokoscLotu = wysokoscLotu;
    }

    @Override
    public String toString() {
        return "Samolot{" +
                "numerSeryjny='" + numerSeryjny + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }

    @Override
    public void lecWyzej() {
        wysokoscLotu++;
        System.out.println(nazwa + ": wysokość lotu wynosi " + wysokoscLotu + " m");
    }

    @Override
    public void lecNizej() {
        if (wysokoscLotu > 0) {
            wysokoscLotu--;
            System.out.println(nazwa + ": wysokość lotu wynosi " + wysokoscLotu + " m");
        } else {
            System.out.println(nazwa + " nie może liecec niżej");
        }
    }
}
