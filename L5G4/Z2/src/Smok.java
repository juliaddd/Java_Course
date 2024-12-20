public class Smok extends Postac{

    private String kolor;

    public Smok( String nazwa, int punktyAtaku, int punktyMany, int punktyZycia, String kolor) {
        super( nazwa, punktyAtaku, punktyMany, punktyZycia);
        this.kolor = kolor;
    }

    @Override
    public String toString(){
        return super.toString() + " " + kolor;
    }

}
