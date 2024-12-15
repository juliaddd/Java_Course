public class PolaiObwody {
    public static final double Pi = 3.14;
    public static final double PierwiastekZTrzech = 1.73;

    public static double poleKola(double promien){
        return promien * promien * Pi;
    }
    public static double obwodKola(double promien){
        return 2*Pi*promien;
    }
    public static double poleProstokata(double a, double b){
        return a*b;
    }
    public static double obwodProstokata(double a, double b){
        return (a+b)*2;
    }
    public static double poleTrojkataRownobocznego(double a){
        return a*a*PierwiastekZTrzech/4;
    }
    public static double obwodTrojkataRownobocznego(double a){
        return 3*a;
    }
}
