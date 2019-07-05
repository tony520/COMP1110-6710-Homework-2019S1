package comp1110.homework.J09;


import java.util.Arrays;
import java.util.function.IntPredicate;

public class TeenCount {

    private static boolean applyPredicate(int value, IntPredicate predicate) {
        return predicate.test(value);
    }

    public static int[] teenLess(int[] array) {
        int[] tmp = {};
        for (int i = 0; i < array.length; i += 1) {
            if (applyPredicate(array[i], x -> x < 13 || x > 19)) {
                tmp = addElement(tmp, array[i]);
            }
        }

        return tmp;
    }

    public static int[] addElement(int[] arr, int item) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = item;
        return arr;
    }
}