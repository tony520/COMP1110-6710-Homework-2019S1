package comp1110.homework.J10;


public class SquareRoot {
    public static String findPreciseRoot(int n, int d) {
        if (n < 0) {
            return Integer.toString(-1);
        }

        double root = Math.sqrt(n);

        if (Math.round(root) * Math.round(root) == n) {
            return String.format("%.0f", root);
        }
        else {
            return String.format("%." + d + "f", root);
        }
    }
}
