public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Yuliya", "Dabreha", 69071);
        Student s2 = new Student("Maria", "Babarik", 12312);
        Student[] studenci = {s1, s2};

        Prowadzacy p = new Prowadzacy("Karol", "Struniawski", Prowadzacy.Stanowisko.ASYSTENT);

        BlokZajeciowy b1 = new BlokZajeciowy("Java - Wyklad", p, studenci);

        Sala s = new Sala(125, Sala.Dzien.CZWARTEK);

        System.out.println(s1);
        System.out.println(p);
        System.out.println(b1);
        System.out.println(s);

        System.out.println(s.DodajZajecieDoSali(b1, 6));
        System.out.println(s);
//        System.out.println(s.DodajZajecieDoSali(b1, 6));

        System.out.println(s.UsunZajeciaZSali(6));
        System.out.println(s);


    }
}