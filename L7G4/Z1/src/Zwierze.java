public abstract class Zwierze {
    public String gatunek;
    public int wiek;

    Zwierze(String gatunek, int wiek) {
        this.gatunek = gatunek;
        this.wiek = wiek;
    }

    public abstract void dajGlos();
}
