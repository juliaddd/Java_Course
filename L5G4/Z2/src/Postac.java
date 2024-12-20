public class Postac {
    private int punktyZycia, punktyMany, punktyAtaku;
    protected String nazwa;

    public Postac(String nazwa,int punktyAtaku,  int punktyMany, int punktyZycia) {
        this.punktyAtaku = punktyAtaku;
        this.nazwa = nazwa;
        this.punktyMany = punktyMany;
        this.punktyZycia = punktyZycia;
    }

    public void przywitajSie(){
        System.out.println("Jestem " + nazwa);
    }

    @Override
    public String toString() {
        return  nazwa + " " +punktyZycia +" " + punktyMany + " " + punktyAtaku;
    }
}
