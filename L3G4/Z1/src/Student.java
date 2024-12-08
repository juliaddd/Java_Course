public class Student extends Czlowiek {
    public int numerIndeksu,  rokRozpoczeciaStudiow, rokStudiow;

    public Student(int rokUrodzenia, String imie, String nazwisko, String PESEL, int numerIndeksu, int rokRozpoczeciaStudiow, int rokStudiow) {
        super(rokUrodzenia, imie, nazwisko, PESEL);
        this.numerIndeksu = numerIndeksu;
        this.rokStudiow = rokStudiow;
        this.rokRozpoczeciaStudiow = rokRozpoczeciaStudiow;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + PESEL + " " + numerIndeksu + " " + rokRozpoczeciaStudiow + " " + rokStudiow;
    }
}