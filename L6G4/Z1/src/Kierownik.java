public class Kierownik extends Pracownik{
    public Pracownik[] podwladni;
    public int dodatekZaPodwladnego;

    public Kierownik(String imie, String nazwisko, int rokUrodzenia, String PESEL, int pensja, int liczbaNadgodzin, int kwotaZaNadgodzine, Pracownik[] podwladni, int dodatekZaPodwladnego) throws PracownikException {
        super(imie, nazwisko, rokUrodzenia, PESEL, pensja, liczbaNadgodzin, kwotaZaNadgodzine);
        this.podwladni = podwladni;
        this.dodatekZaPodwladnego = dodatekZaPodwladnego;
    }

    @Override
    public int obliczRocznaWyplate(){
        return super.obliczRocznaWyplate() + podwladni.length*dodatekZaPodwladnego;
    }

    @Override
    public String toString() {
        StringBuilder podwladniInfo = new StringBuilder();

        for (Pracownik podwladny : podwladni) {
            podwladniInfo.append(podwladny.toString()).append("\n");
        }
        if (podwladni.length> 0) {
            podwladniInfo.deleteCharAt(podwladniInfo.length() - 1);
        }

        return super.toString()+"\nInformacja o podwładnych: "+ podwladniInfo.toString() + "\nDodatkowa wypłata za podwładnych: "+ Integer.toString(dodatekZaPodwladnego);
    }
}
