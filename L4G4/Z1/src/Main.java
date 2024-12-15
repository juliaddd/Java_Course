public class Main {
    public static void main(String[] args) {
        System.out.println("Pi = " + PolaiObwody.Pi );
        System.out.println("Pierwiastek z trzech = " + PolaiObwody.PierwiastekZTrzech );
        double promien = 5.5;
        double a = 2, b = 8.2;

        System.out.println("\nPole Kola = " + PolaiObwody.poleKola(promien) );
        System.out.println("Obwód Kola = " + PolaiObwody.obwodKola(promien) );

        System.out.println("\nPole Prostokąta = " + PolaiObwody.poleProstokata(a,b));
        System.out.println("Obwód Prostokąta = " + PolaiObwody.obwodProstokata(a,b));

        a = 10;
        System.out.println("\nPole Trójkąta = " + PolaiObwody.poleTrojkataRownobocznego(a));
        System.out.println("Obwód Trójkąta = " + PolaiObwody.obwodTrojkataRownobocznego(a));
    }
}