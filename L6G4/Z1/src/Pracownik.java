public class Pracownik  extends  Osoba{
    private String PESEL;
    private int pensja, liczbaNadgodzin, kwotaZaNadgodzine;


    public Pracownik(String imie, String nazwisko,  int rokUrodzenia, String PESEL, int pensja, int liczbaNadgodzin, int kwotaZaNadgodzine) throws PracownikException{
        super(imie, nazwisko, rokUrodzenia);

        if (kwotaZaNadgodzine < WynagrodzenieMinimalne.minimalnaKwotaZaGodzine) {
            throw new PracownikException("Nie możesz tak mało zapłacić pracownikowi za godzinę pracy!");
        }
        if (pensja < WynagrodzenieMinimalne.minimalnaKwotaZaMiesiac) {
            throw new PracownikException("Nie możesz tak mało zapłacić pracownikowi za miesiąc pracy na etacie!");
        }

        this.PESEL = PESEL;
        this.pensja = pensja;
        this.liczbaNadgodzin = liczbaNadgodzin;
        this.kwotaZaNadgodzine = kwotaZaNadgodzine;

    }

    public int obliczRocznaWyplate(){
        return  pensja + liczbaNadgodzin * kwotaZaNadgodzine;
    }

    @Override
    public String toString() {
        return super.toString()+ " "+ PESEL+" "+ Integer.toString(pensja)+" "+ Integer.toString(liczbaNadgodzin)+" "+ Integer.toString(kwotaZaNadgodzine)+" Roczna wypłata: "+ Integer.toString(this.obliczRocznaWyplate()) ;
    }

}

class PracownikException extends Exception{
    public PracownikException(String message){
        super(message);
    }
}