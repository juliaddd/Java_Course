public  class Ssak extends Zwierze{
    public enum RodzajDiety {
        MIESOZERNY, ROSLINOZERNY, WSZYSTKOZERNY
    }
    RodzajDiety rodzajDiety;

    Ssak(String gatunek, int wiek, RodzajDiety rodzajDiety) {
        super(gatunek, wiek);
        this.rodzajDiety = rodzajDiety;
    }


    public void dajGlos()
    {
        System.out.println(gatunek+ " daje glos!");
    };

    @Override
    public String toString() {
        return "Ssak{" +
                "rodzajDiety=" + rodzajDiety +
                ", gatunek='" + gatunek + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
