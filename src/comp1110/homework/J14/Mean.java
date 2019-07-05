package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<>();

        while (in.hasNextDouble()) {
            arr.add(in.nextDouble());
        }

        Double sum = 0.0D;

        for (Double d: arr) {
            sum += d;
        }

        System.out.println(sum / arr.size());
    }
}
