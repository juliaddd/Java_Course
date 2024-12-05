public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalculator = new Calculator<>();
        System.out.println("Dodawanie Integer: " + intCalculator.add(3, 5));
        System.out.println("Odejmowanie Integer: " + intCalculator.subtract(7, 2));

        Calculator<Double> doubleCalculator = new Calculator<>();
        System.out.println("Dodawanie Double: " + doubleCalculator.add(1.5, 5.7));
        System.out.println("Odejmowanie Double: " + doubleCalculator.subtract(9.99, 13.3));
    }
}