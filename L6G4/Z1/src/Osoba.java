public abstract class Osoba {
    private String imie, nazwisko;
    private int rokUrodzenia;

    public Osoba( String imie, String nazwisko, int rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public abstract int obliczRocznaWyplate();

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + rokUrodzenia;
    }
}
