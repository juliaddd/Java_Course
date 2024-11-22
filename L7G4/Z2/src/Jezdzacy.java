public interface Jezdzacy {
    public int getPredkosc();
    public abstract void setPredkosc(int predkosc);
    public int getMaxPredkosc();
    public abstract void setMaxPredkosc(int maxPredkosc);

    public abstract  boolean zwiekszPredkosc(int ile);
    public abstract  boolean zmniejszPredkosc(int ile);

    private String vehicleInfo() {
        return getPredkosc() + " " + getMaxPredkosc();
    }

    default String info() {
        return "Statystyki pojazdu: " + vehicleInfo();
    }
}
