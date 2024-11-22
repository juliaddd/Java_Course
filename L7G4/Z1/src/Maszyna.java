public abstract class Maszyna {
    public String nazwa;
    public String numerSeryjny;

    Maszyna(String nazwa, String numerSeryjny) {
        this.nazwa = nazwa;
        this.numerSeryjny = numerSeryjny;
    }

    @Override
    public String toString() {
        return "Maszyna{" +
                "nazwa='" + nazwa + '\'' +
                ", numerSeryjny='" + numerSeryjny + '\'' +
                '}';
    }
}
