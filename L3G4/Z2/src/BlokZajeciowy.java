import java.util.Arrays;

public class BlokZajeciowy {
    public String nazwaPrzedmiotu;
    public Prowadzacy prowadzacy;
    public Student[] studenci;

    public BlokZajeciowy(String nazwaPrzedmiotu, Prowadzacy prowadzacy, Student[] studenci) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
        this.prowadzacy = prowadzacy;
        this.studenci = studenci;
    }

    @Override
    public String toString() {
        return "BlokZajeciowy{" +
                "nazwaPrzedmiotu='" + nazwaPrzedmiotu + '\'' +
                ", prowadzacy=" + prowadzacy +
                ", ilosc studentow=" + studenci.length +
                '}';
    }
}
