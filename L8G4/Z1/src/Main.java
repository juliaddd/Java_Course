
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Produkt[] produkty = {
        new Produkt("Laptop", "001AXDX", 2999.9),
        new Produkt("Watch", "0A2FFD", 355.0 ),
        new Produkt("Tablet",  "A2222DX", 899.99),
        new Produkt("Monitor", "DFDFD45", 1000.0)
    };

        System.out.println("Produkty:");
        System.out.println(Arrays.toString(produkty));
        Arrays.sort(produkty);
        System.out.println("\nProdukty posortowane po cenie:");
        for (Produkt produkt : produkty) {
            System.out.println(produkt);
        }

        Arrays.sort(produkty, new ProduktPoNazwieComparator());
        System.out.println("\nProdukty posortowane po nazwie:");
        for (Produkt produkt : produkty) {
            System.out.println(produkt);
        }

    }
}