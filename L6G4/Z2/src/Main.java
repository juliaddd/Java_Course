public class Main {
    public static void main(String[] args) {

        try {
            int[] tabl = {0,9,33, -3, 3};
//            int[] tabl2 = new int[0];
            MojeLiczby mojeLiczby = new MojeLiczby(tabl);
//            MojeLiczby mojeLiczby2 = new MojeLiczby(tabl2);


            System.out.println("Element o indeksie 2:: " + mojeLiczby.getElementAtIndex(2));
//            System.out.println("Element o indeksie 15: " + mojeLiczby.getElementAtIndex(15));

            System.out.println("Dzielenie elementów o indeksach 2 i 3: " + mojeLiczby.dzielenieElementow(2, 3));
            System.out.println("Dzielenie elementów o indeksach 1 i 0 (dzielenie przez zero): " + mojeLiczby.dzielenieElementow(1, 0));
            System.out.println("Dzielenie elementów o indeksach 1 i 10: " + mojeLiczby.dzielenieElementow(1, 10));

        } catch (MojeLiczby.MojeLiczbyException e) {
            System.out.println(e.getMessage());
        }
    }
}