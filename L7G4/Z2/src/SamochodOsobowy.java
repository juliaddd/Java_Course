public class SamochodOsobowy extends Samochod {
    public SamochodOsobowy(int maxPredkosc) {
        super(maxPredkosc);
    }
    @Override
    public String info() {
        return "Samochód osobowy: " + super.info();
    }
}
