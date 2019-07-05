package comp1110.homework.J12;


public class Exchange {
    public static <T> T[] swap(T[] a, int i, int j) {
        T temp;

        if ((i >= 0 && i < a.length) && (j >= 0 && j < a.length)) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        return a;
    }
}