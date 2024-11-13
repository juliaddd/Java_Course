public class Main {

    static int dwuwymiarTablSum(int[][] matrix){
        System.out.println("\nZadanie 21");
        int suma = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                suma += matrix[i][j];
            }
        }
        return suma;
    }
    static boolean dwuwymiarTablFind(int[][] matrix, int a){
        System.out.println("\nZadanie 22");
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if (matrix[i][j] == a) {
                   return true;
                }
            }
        }
        return false;
    }
    static int dwuwymiarTablCount(int[][] matrix, int a){
        System.out.println("\nZadanie 23");
        int k = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if (matrix[i][j] == a) {
                    k++;
                }
            }
        }
        return k;
    }
    static void kwadrat(int a){
        System.out.println("\nZadanie 24");

        for(int i = 0; i<a; i++){
            for(int j = 0; j<a; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    static void kwadratSymbol(String c,int a){
        System.out.println("\nZadanie 25");

        for(int i = 0; i<a; i++){
            for(int j = 0; j<a; j++){
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 2},
                {4, 5, 6},
                {6, 7, 6},
                {4, 2, 1},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {-5, 0, 2, 5},
                {0, 3, -6, 0},
                {4, 45, 2, 0},
        };
//        z21
        System.out.println(dwuwymiarTablSum(matrix1));
        System.out.println(dwuwymiarTablSum(matrix2));
//        z22
        System.out.println(dwuwymiarTablFind(matrix1, 9));
        System.out.println(dwuwymiarTablFind(matrix2, -7));
//        z23
        System.out.println(dwuwymiarTablCount(matrix1, 2));
        System.out.println(dwuwymiarTablCount(matrix2, 0));
//        z24
        kwadrat(5);
        kwadrat(3);
//        z25
        kwadratSymbol("&", 4);
        kwadratSymbol("0", 3);

    }
}