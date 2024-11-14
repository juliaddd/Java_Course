public class Main {
    public static void main(String[] args) {
        try{
            Pracownik p1 = new Pracownik("Tomasz", "Grusha", 1985, "123456789", 6000, 4, 40);
            Pracownik p2 = new Pracownik("Anna", "Nowak", 1990, "000000009", 4800, 55, 28);
            Pracownik p3 = new Pracownik("Jana", "Chechota", 1999, "100000080", 6000, 15, 29);
            Pracownik p4 = new Pracownik("Piotr", "Kowalski", 2001, "120006009", 4400, 8, 32);

            Pracownik[] pracownicy = {p1, p2, p3, p4};

            Kierownik kierownik = new Kierownik("Yuliya", "Dabreha", 2004, "987654321", 9000, 20, 50, pracownicy, 150);

            Osoba[] osoby = new Osoba[5];
            osoby[0] = p3;
            osoby[1] = p1;
            osoby[2] = p2;
            osoby[3] = kierownik;
            osoby[4] = p4;


            for (Osoba osoba : osoby) {
                System.out.println(osoba.toString());
                System.out.println("Roczna wypłata: " + osoba.obliczRocznaWyplate()+"\n");
                if (osoba instanceof Kierownik) {
                    System.out.println("Kierownik ma "+((Kierownik)osoba).podwladni.length +" podwładnych\n");
                }
            }

        }
        catch (PracownikException e) {
            System.out.println(e.getMessage());
        }
    }
}