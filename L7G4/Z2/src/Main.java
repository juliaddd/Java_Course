public class Main {
    public static void main(String[] args) {
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy(300);

        System.out.println(samochodOsobowy.getPredkosc());
        samochodOsobowy.zwiekszPredkosc(150);
        System.out.println(samochodOsobowy.getPredkosc());
        samochodOsobowy.zwiekszPredkosc(100);
        System.out.println(samochodOsobowy.getPredkosc());
        samochodOsobowy.zmniejszPredkosc(30);
        System.out.println(samochodOsobowy.getPredkosc());
        samochodOsobowy.zwiekszPredkosc(150);

        System.out.println(samochodOsobowy.info());
    }
}