public class Student {
    public String imie;
    public String nazwisko;
    public int nrAlbumu;

    public Student(String imie, String nazwisko, int nrAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrAlbumu = nrAlbumu;
    }

    @Override
    public String toString() {
        return "Student: "+imie + " " + nazwisko+ " " + nrAlbumu;
    }
}
