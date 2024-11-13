//zadanie 2 - myNameFor

public class Main {

    static void myNameWhile(){
        System.out.println("\nZadanie 1");
        int i = 10;
        while(i-- > 0){
            System.out.println("Yuliya Dabreha");
        }
    }
    static void myNameFor(){
        System.out.println("\nZadanie 2");
        String name = "Yuliya";
        for (int i = 0; i <10; i++){
            System.out.println(name);
        }
    }

    static void liczbyDoNWhile(int n){
        System.out.println("\nZadanie 3");
        int i = 0;
        while (i < n){
            System.out.println(i);
            i++;
        }
    }
    static void liczbyDoNFor(int n){
        System.out.println("\nZadanie 4");
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }
    }
    static void liczbyABWhile(int a, int b){
        System.out.println("\nZadanie 5");
        int i = a;
        while (i < b){
            System.out.println(i);
            i++;
        }
    }
    static void liczbyABFor(int a, int b){
        System.out.println("\nZadanie 6");
        for (; a < b; a++){
            System.out.println(a);
        }
    }
    static int sumaDoN(int n){
        System.out.println("\nZadanie 7");
        int suma = 0;
        for (int i = 0; i < n; i++){
            suma  += i;
        }
        return suma;
    }

    static int sumaAB(int a, int b){
        System.out.println("\nZadanie 8");
        int suma = 0;
        for (int i = a; i < b; i++){
            suma  += i;
        }
        return suma;
    }
    static void sumaABFor(int a, int b){
        System.out.println("\nZadanie 9");
        int suma = 0;
        for (int i = a; i <= b; i++){
            suma  += i;
            System.out.println(suma);
        }
    }

    public static void main(String[] args) {
//      z1
        myNameWhile();
        myNameWhile();
//      z2
        myNameFor();
        myNameFor();
//      z3
        liczbyDoNWhile(6);
        liczbyDoNWhile(4);
//      z4
        liczbyDoNFor(4);
        liczbyDoNFor(7);
//      z5
        liczbyABWhile(5, 8);
        liczbyABWhile(0, 5);
//      z6
        liczbyABFor(3, 7);
        liczbyABFor(6, 11);
//      z7
        System.out.println(sumaDoN(5));
        System.out.println(sumaDoN(11));
//      z8
        System.out.println(sumaAB(11, 13));
        System.out.println(sumaAB(1, 4));
//      z9
        sumaABFor(3,5);
        sumaABFor(0,4);
    }
}