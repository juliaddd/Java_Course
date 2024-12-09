import java.util.Arrays;

public class Sala {
    public int  numer;
    public BlokZajeciowy[] zajecia = new BlokZajeciowy[8];
    public enum Dzien {PONIEDZIALEK, WTOREK, SRODA, CZWARTEK, PIATEK};
    public Dzien dzien;

    public Sala(int numer, Dzien dzien) {
        this.numer = numer;
        this.dzien = dzien;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numer=" + numer +
                ", zajecia=" + Arrays.toString(zajecia) +
                ", dzien=" + dzien +
                '}';
    }

    public boolean DodajZajecieDoSali(BlokZajeciowy z, int numerBloku){
        if(zajecia[numerBloku] == null){
            zajecia[numerBloku] = z;
            return true;
        }
        return false;
    }

    public boolean UsunZajeciaZSali(int numerBloku){
        if(zajecia[numerBloku] != null){
            zajecia[numerBloku] = null;
            return true;
        }
        return false;
    }
}
