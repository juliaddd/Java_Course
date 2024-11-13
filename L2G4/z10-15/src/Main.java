public class Main {
    static int pierwszyElTablicy(int[] arr){
        System.out.println("\nZadanie 10");
        return arr[0];
    }
    static int ostatniElTablicy(int[] arr){
        System.out.println("\nZadanie 11");
        return arr[arr.length-1];
    }
    static int sumaPierwszegoOstatniego(int[] arr){
        System.out.println("\nZadanie 12");
        return arr[0] + arr[arr.length-1];
    }
    static int dlugoscTablicy(int[] arr){
        System.out.println("\nZadanie 13");
        return arr.length;
    }
    static void elementyTablicy(int[] arr){
        System.out.println("\nZadanie 14");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int sumaElTablicy(int[] arr){
        System.out.println("\nZadanie 15");
        int suma = 0;
        for(int i = 0; i<arr.length; i++){
            suma += arr[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 14, -8, 9, 2, 4};
        int[] arr2 = {0, 1, 2, 3, 4, 5};

//        z10
        System.out.println(pierwszyElTablicy(arr1));
        System.out.println(pierwszyElTablicy(arr2));
//        z11
        System.out.println(ostatniElTablicy(arr1));
        System.out.println(ostatniElTablicy(arr2));
//        z12
        System.out.println(sumaPierwszegoOstatniego(arr1));
        System.out.println(sumaPierwszegoOstatniego(arr2));
//        z13
        System.out.println(dlugoscTablicy(arr1));
        System.out.println(dlugoscTablicy(arr2));
//        z14
        elementyTablicy(arr1);
        elementyTablicy(arr2);
//        z15
        System.out.println(sumaElTablicy(arr1));
        System.out.println(sumaElTablicy(arr2));
    }
}