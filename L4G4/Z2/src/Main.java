import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nWprowadź dane studenta. Wpisz 'KONIEC' w pole imię, aby zakończyć");


        String imie = "", nazwisko, nrAlbumu, glos;
        while (true)
        {
            System.out.print("\nImię: ");
            imie = in.nextLine();
            if (Objects.equals(imie, "KONIEC"))
                break;
            System.out.print("Nazwisko: ");
            nazwisko = in.nextLine();
            System.out.print("Numer Albumu: ");
            nrAlbumu = in.nextLine();
            Student student = new Student(nazwisko, nrAlbumu, imie);
//            System.out.print("glos: ");
            do
            {
                System.out.println("Wpisz F - za Fortnite, C - za Counter Strike");
                glos = in.nextLine();
            }while (!glos.equals("C") && !glos.equals("F"));
            if (glos.equals("C"))
                student.zaglosujZaCounterStrike();
            else
                student.zaglosujZaFortnite();
        }

        System.out.println("\nGlosów za Fortnite: "  + GlosZaGraFortnite.zwrocIloscGlosow());
        System.out.println("Glosów za Counter Strike: "  + GlosZaGraCounterStrike.zwrocIloscGlosow());
    }
}