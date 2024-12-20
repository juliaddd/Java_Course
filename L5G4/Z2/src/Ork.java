public class Ork extends Postac {
    public enum TypOrka {BOJOWY, KUCHARZ, GARNCARZ};
    public TypOrka typOrka;

    public Ork(String nazwa, int punktyAtaku, int punktyMany, int punktyZycia, TypOrka typOrka) {
        super( nazwa, punktyAtaku, punktyMany, punktyZycia);
        this.typOrka = typOrka;
    }

    @Override
    public void przywitajSie() {
        System.out.printf("Grr, jestem orkiem o imieniu %s\n", nazwa);
    }

    @Override
    public String toString() {
        return super.toString() + " " + typOrka;
    }
}
