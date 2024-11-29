public class Engine implements Cloneable{
    public int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }

    @Override
    protected Engine clone(){
        return new Engine(this.horsePower);
    }
}
