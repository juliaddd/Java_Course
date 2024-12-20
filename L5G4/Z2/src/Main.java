public class Main {
    public static void main(String[] args) {
        Postac p = new Postac("Volondemort", 120, 5000, 7);
        p.przywitajSie();
        System.out.println(p+"\n");

        Ork o = new Ork("Ork King", 200, 50,  300, Ork.TypOrka.BOJOWY);
        o.przywitajSie();
        System.out.println(o+"\n");

        Smok s = new Smok("Karkusza", 300, 10, 500, "czarny");
        s.przywitajSie();
        System.out.println(s);

    }
}