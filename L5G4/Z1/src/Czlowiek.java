public class Czlowiek {
    public int rokUrodzenia;
    public String imie, nazwisko, PESEL;

    public Czlowiek(int rokUrodzenia, String imie, String nazwisko, String PESEL) {
        this.rokUrodzenia = rokUrodzenia;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }

    @Override
    public String toString() {
        return "Czlowiek{" +
                "rokUrodzenia=" + rokUrodzenia +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
