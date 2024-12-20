public class Main {
    public static void main(String[] args) {
        Czlowiek c1 = new Czlowiek(2004, "Yuliya", "Dabreha", "200400000");
        Czlowiek c2 = new Czlowiek(1994, "Nikita", "Belskish", "199400000");

        Student s1 = new Student(2003, "Mark", "Cofal", "200300000", 22334, 2022, 3);
        Student s2 = new Student(2005, "Kasia", "Kozhycz", "200500000", 89098, 2023, 2);

        Wykladowca w1 = new Wykladowca(1984, "Bartosz", "Smith", "909000000", Wykladowca.Stanowisko.ADIUNKT, Wykladowca.Wyksztalcenie.MAGISTER, 2010);
        Wykladowca w2 = new Wykladowca(1804, "Ernest", "Pierszy", "6660000000", Wykladowca.Stanowisko.ASYSTENT, Wykladowca.Wyksztalcenie.PROFESOR, 1990);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s1);
        System.out.println(w1);

        System.out.println(s2.imie);
        System.out.println(w2.rokZatrudnienia);

        Czlowiek czlowiek1 = new Student(2004, "Dzmitry", "Grit", "200430000", 12923, 2020, 4);
        System.out.println(((Student)czlowiek1).numerIndeksu);
    }
}