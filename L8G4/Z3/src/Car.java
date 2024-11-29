public class Car implements Cloneable {
    public int speed;
    public Engine engine;

    public Car(int speed, Engine engine) {
        this.speed = speed;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", engine=" + engine +
                '}';
    }

    @Override
    protected Object clone(){
        return new Car(this.speed, this.engine);
    }
}
