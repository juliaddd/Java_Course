import java.util.Objects;

public class Person {
    private String imie;
    private int rokUrodzenia;

    public Person(String name, int rokUrodzenia) {
        this.imie = name;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null  || o.getClass() != getClass()) return false;
        Person person = (Person) o;
        return rokUrodzenia == person.rokUrodzenia && Objects.equals(imie, person.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, rokUrodzenia);
    }

    @Override
    public String toString() {
        return "Person{imie='" + imie + "', rokUrodzenia=" + rokUrodzenia + "}";
    }
}
