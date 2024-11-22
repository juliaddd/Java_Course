public class Delfin extends Ssak{
    public int glebokoscZanurzenia;

    public Delfin(String gatunek, int wiek, RodzajDiety rodzajDiety, int glebokoscZanurzenia) {
        super(gatunek, wiek, rodzajDiety);
        this.glebokoscZanurzenia = glebokoscZanurzenia;
    }

    @Override
    public void dajGlos() {
        super.dajGlos();
    }

    @Override
    public String toString() {
        return "Delfin{" +
                "glebokoscZanurzenia=" + glebokoscZanurzenia +
                ", rodzajDiety=" + rodzajDiety +
                ", gatunek='" + gatunek + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
