public class Student {
    public String imie, nazwisko, numerAlbumu;
    private GlosZaGraCounterStrike glosZaGraCounterStrike;
    private GlosZaGraFortnite glosZaGraFortnite;

    public Student(String imie, String nazwisko, String numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
    }
    public void zaglosujZaFortnite() {
        glosZaGraFortnite = new GlosZaGraFortnite();
    }
    public void zaglosujZaCounterStrike() {
        glosZaGraCounterStrike = new GlosZaGraCounterStrike();
    }

}
