import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoby = {

                new Osoba("Yuliya", "Dabreha", 2004),
                new Osoba("Jan", "Kowalski", 1998),
                new Osoba("Jan", "Popel", 1998),
                new Osoba("Zhanna", "Popel", 1972),
                new Osoba("Zhanna", "Popel", 1965)
        };

        System.out.println("Osoby:");
        System.out.println(Arrays.toString(osoby));
        Arrays.sort(osoby);
        System.out.println("\nOsoby posortowane po Nazwisko>Imie>Rok:");
        for (Osoba osoba : osoby) {
            System.out.println(osoba);
        }

        Arrays.sort(osoby, new Osoba.OsobaPoRokuComparator());
        System.out.println("\nOsoby posortowane po Rok>Nazwisko>Imie:");
        for (Osoba osoba : osoby) {
            System.out.println(osoba);
        }

    }
}