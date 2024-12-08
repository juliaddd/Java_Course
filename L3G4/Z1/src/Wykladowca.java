public class Wykladowca extends Czlowiek{
    public enum Stanowisko {
        ASYSTENT, ADIUNKT, PROFESOR
    };
    public Stanowisko stanowiesko;

    public enum Wyksztalcenie{
        MAGISTER, DOKTOR, DOKTORHAB, PROFESOR
    };
    public Wyksztalcenie wyksztalcenie;

    public int rokZatrudnienia;

    public Wykladowca(int rokUrodzenia, String imie, String nazwisko, String PESEL, Stanowisko stanowiesko, Wyksztalcenie wyksztalcenie, int rokZatrudnienia) {
        super(rokUrodzenia, imie, nazwisko, PESEL);
        this.stanowiesko = stanowiesko;
        this.wyksztalcenie = wyksztalcenie;
        this.rokZatrudnienia = rokZatrudnienia;
    }

    @Override
    public String toString() {
        return imie +" "+ nazwisko +" "+ PESEL + " "+ stanowiesko +" "+ wyksztalcenie +" "+ rokZatrudnienia;
    }
}
