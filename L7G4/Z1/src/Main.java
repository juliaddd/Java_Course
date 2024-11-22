public class Main {
    public static void main(String[] args) {
        Ptak ptak = new Ptak("Orzeł", 5, Ptak.TypGniazdowania.GNIAZDOWNIK, 0);
        System.out.println(ptak);
        ptak.lecWyzej();
        ptak.lecNizej();
        ptak.lecNizej();

        Samolot samolot = new Samolot("Boeing", "737", 1000, 1000);
        System.out.println(samolot);
        samolot.lecWyzej();
        samolot.lecNizej();

        Pojazd samochod = new Samochod("Samochód", "1234", 60, Samochod.Marka.AUDI);
        System.out.println(samochod);
        samochod.przyspiesz();
        samochod.zwolnij();
        samochod.zwolnij();

        Delfin delfin = new Delfin("Delfin butlonosy", 3, Ssak.RodzajDiety.MIESOZERNY, 8);
        System.out.println(delfin);
        delfin.dajGlos();
    }
}