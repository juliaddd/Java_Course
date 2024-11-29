import java.util.Comparator;

public class Osoba implements Comparable<Osoba>{
    private String imie, nazwisko;
    private int rokUrodzenia;
    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }

    @Override
    public int compareTo(Osoba o) {
        int nazwiskoCompare = this.nazwisko.compareTo(o.nazwisko);
        if (nazwiskoCompare != 0) {
            return nazwiskoCompare;
        }
        else{
            int imieCompare = this.imie.compareTo(o.imie);
            if (imieCompare != 0) {
                return imieCompare;
            }
        }
         return Integer.compare(this.rokUrodzenia, o.rokUrodzenia);
    }


    public static class OsobaPoRokuComparator implements Comparator<Osoba> {

        @Override
        public int compare(Osoba o1, Osoba o2) {
            int rokCompare = Integer.compare(o1.rokUrodzenia, o2.rokUrodzenia);
            if (rokCompare != 0) {
                return rokCompare;
            }
            else{
                int nazwiskoCompare = o1.nazwisko.compareTo(o2.nazwisko);
                if (nazwiskoCompare != 0) {
                    return nazwiskoCompare;
                }
            }
            return o1.imie.compareTo(o2.imie);
        }
    }
}
