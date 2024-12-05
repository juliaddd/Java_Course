import java.util.Objects;

public class Person {
    private String name;
    private int rokUrodzenia;

    public Person(String name, int rokUrodzenia) {
        this.name = name;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getName() {
        return name;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null  || o.getClass() != getClass()) return false;
        Person person = (Person) o;
        return rokUrodzenia == person.rokUrodzenia && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rokUrodzenia);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', rokUrodzenia=" + rokUrodzenia + "}";
    }
}
