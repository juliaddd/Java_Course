public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(100);
        Car c1 = new Car(230, e1);

        Car c2 = (Car)c1.clone();

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        c1.speed = 200;
        System.out.println("\nKorzystamy z clone głębokiego:");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        c2.engine.horsePower = 300;
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
    }
}