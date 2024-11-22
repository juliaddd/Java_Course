public class Samochod implements Jezdzacy{
    private int predkosc, maxPredkosc;

    public Samochod(int maxPredkosc) {
        this.maxPredkosc = maxPredkosc;
        this.predkosc = 0;
    }

    @Override
    public int getPredkosc() {
        return predkosc;
    }

    @Override
    public void setPredkosc(int predkosc) {
        if (predkosc <= maxPredkosc && predkosc >= 0) {
            this.predkosc = predkosc;
        } else {
            System.out.println("Nie można ustawic takiej prędkości");
        }
    }

    @Override
    public int getMaxPredkosc() {
        return maxPredkosc;
    }

    @Override
    public void setMaxPredkosc(int maxPredkosc) {
        if (maxPredkosc > 0) {
            this.maxPredkosc = maxPredkosc;
        } else {
            System.out.println("Maksymalna prędkośc musi być większa  0");
        }
    }

    @Override
    public boolean zwiekszPredkosc(int ile) {

        if (predkosc + ile <= maxPredkosc) {
            predkosc += ile;
            return true;
        }else {
            System.out.println("Nie można zwiększyc prędkości powyżej maksymalnej");
            return false;
        }
    }

    @Override
    public boolean zmniejszPredkosc(int ile) {
        if (predkosc - ile >= 0){
            predkosc -= ile;
            return true;
        }
        else{
            System.out.println("Nie można zmniejszyc prędkości poniżej 0");
            return false;
        }
    }
}
