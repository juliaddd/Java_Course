public class Main {

    static boolean parzystaDlugosc(int[] arr){
        System.out.println("\nZadanie 16");
        return arr.length % 2 == 0;
    }
    static int sumaElTablicy(int[] arr){
        System.out.println("\nZadanie 17");
        int suma = 0;
        for(int i = 0; i<arr.length; i++){
            suma += arr[i];
        }
        return suma;
    }
    static void parzysteIndeksy(int[] arr){
        System.out.println("\nZadanie 18");
        for(int i = 0; i<arr.length; i+=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int sumaParzystIndeks(int[] arr){
        System.out.println("\nZadanie 19");
        int suma = 0;
        for(int i = 0; i<arr.length; i+=2){
            suma += arr[i];
        }
        return suma;
    }

    static void dwuwymiarTablica(int[][] matrix){
        System.out.println("\nZadanie 20");
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[] arr1 = {0, 1,2,3,4,5,6,7};
        int[] arr2 = {-1,32,6,67,-7,5,12,8, 22};

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {-5, 7, 3},
                {4, 45, -6},
        };

//        z16
        System.out.println(parzystaDlugosc(arr1));
        System.out.println(parzystaDlugosc(arr2));
//        z17
        System.out.println(sumaElTablicy(arr1));
        System.out.println(sumaElTablicy(arr2));
//        z18
        parzysteIndeksy(arr1);
        parzysteIndeksy(arr2);
//        z19
        System.out.println(sumaParzystIndeks(arr1));
        System.out.println(sumaParzystIndeks(arr2));
//        z20
        dwuwymiarTablica(matrix1);
        dwuwymiarTablica(matrix2);
    }
}