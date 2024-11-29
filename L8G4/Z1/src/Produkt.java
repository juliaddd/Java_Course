public class Produkt implements Comparable<Produkt>{
    private String nazwa, kod;
    private double cena;

    public Produkt(String nazwa, String kod, double cena) {
        this.nazwa = nazwa;
        this.kod = kod;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", kod='" + kod + '\'' +
                ", cena=" + cena +
                '}';
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public int compareTo(Produkt o) {
        return Double.compare(cena, o.cena);
    }
}
