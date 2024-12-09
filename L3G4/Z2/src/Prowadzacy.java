public class Prowadzacy {

    public String imie;
    public String nazwisko;
    public enum Stanowisko {ASYSTENT, ADIUNKT, PROFESOR};
    public Stanowisko stanowisko;

    public Prowadzacy(String imie, String nazwisko, Stanowisko st) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = st;
    }

    @Override
    public String toString() {
        return "Prowadzacy{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanowisko=" + stanowisko +
                '}';
    }
}
