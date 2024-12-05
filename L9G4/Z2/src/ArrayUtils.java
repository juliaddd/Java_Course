import java.util.Arrays;
import java.util.Objects;

public class ArrayUtils {

    public static <T> void display(T[] tabl){
        for (T el: tabl){
            System.out.println(el);
        }
    }

    public static <T> T[] concat(T[] a, T[] b){
        T[] result = Arrays.copyOf(a, a.length + b.length);
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        return result;
    }

    public static <T>  boolean contains(T[] tabl, T a){
        for (T el: tabl){
            if (Objects
                    .equals(el,a)) return true;
        }
        return false;
    }
}
