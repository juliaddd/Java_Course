public class Ptak extends Zwierze implements Latajacy{
    public int wysokoscLotu;
    public enum TypGniazdowania {
        GNIAZDOWNIK, ZAGNIADOWNIK
    }
    TypGniazdowania typGniazdowania;

    public Ptak(String gatunek, int wiek, TypGniazdowania typGniazdowania, int wysokoscLotu) {
        super(gatunek, wiek);
        this.typGniazdowania = typGniazdowania;
        this.wysokoscLotu = wysokoscLotu;
    }

    @Override
    public void dajGlos() {
        System.out.println(gatunek+" daje glos!");
    }

    @Override
    public String toString() {
        return "Ptak{" + "wysokoscLotu=" + wysokoscLotu +
                "typGniazdowania=" + typGniazdowania +
                ", gatunek='" + gatunek + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public void lecWyzej() {
        wysokoscLotu++;
        System.out.println(gatunek + ": wysokość lotu wynosi " + wysokoscLotu + " m");
    }

    @Override
    public void lecNizej() {
        if (wysokoscLotu > 0) {
            wysokoscLotu--;
            System.out.println(gatunek + ": wysokość lotu wynosi " + wysokoscLotu + " m");
        } else {
            System.out.println(gatunek + " nie może liecec niżej");
        }
    }
}
