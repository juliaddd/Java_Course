public class MojeLiczby {
    private int[] tablicaLiczby;

    public static class MojeLiczbyException extends Exception {
        public MojeLiczbyException(String message) {
            super(message);
        }
    }

    public MojeLiczby(int[] tablicaLiczby) throws MojeLiczbyException {

        if (tablicaLiczby == null || tablicaLiczby.length == 0){
            throw new MojeLiczbyException("Została przypisana pusta tablica");
        }
        this.tablicaLiczby = tablicaLiczby;
    }

    public int getElementAtIndex(int index) throws MojeLiczbyException {
        try{
            return tablicaLiczby[index];
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new MojeLiczbyException("Element o takim indeksie nie istnieje");
        }
    }

    public int dzielenieElementow(int index1, int index2){
        try{
            int a = tablicaLiczby[index1];
            int b = tablicaLiczby[index2];
            return a/b;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Jeden z indeksów jest poza zakresem tablicy!");
            return 0;
        }
        catch (ArithmeticException e){
            System.out.println("Próba dzielenia przez zero!");
            return 0;
        }

    }
}
