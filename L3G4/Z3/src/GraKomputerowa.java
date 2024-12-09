public class GraKomputerowa {
    public String nazwa, wydawca;
    private int ocena, rokWydania, liczbaGraczy;


    public GraKomputerowa(String nazwa, String wydawca, int ocena, int rokWydania, int liczbaGraczy) {
        this.nazwa = nazwa;
        this.wydawca = wydawca;
        this.ocena = ocena;
        this.rokWydania = rokWydania;
        this.liczbaGraczy = liczbaGraczy;
    }

    public GraKomputerowa(String nazwa, String wydawca) {
        this(nazwa, wydawca, 0, 2000, 1);
    }

    public String wyswietlInformacje() {
        return "Nazwa: " + nazwa + ", Wydawca: " + wydawca + ", Ocena: " + ocena + ", Rok wydania: " + rokWydania + ", Liczba graczy: " + liczbaGraczy;
    }

    private String zwrocOcenaIRokWydania() {
        return ocena + " " + rokWydania;
    }

    public String graIKomponenty() {
        return zwrocOcenaIRokWydania() + " " + liczbaGraczy;
    }
    //  setters
    public void setNazwa(String nazwa) {
        if (nazwa != null)
            this.nazwa = nazwa;
    }

    public void setWydawca(String wydawca) {
        this.wydawca = wydawca;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public void setLiczbaGraczy(int liczbaGraczy) {
        this.liczbaGraczy = liczbaGraczy;
    }

    // getters
    public String getNazwa() {
        return nazwa;
    }

    public String getWydawca() {
        return wydawca;
    }

    public int getOcena() {
        return ocena;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public int getLiczbaGraczy() {
        return liczbaGraczy;
    }
}
