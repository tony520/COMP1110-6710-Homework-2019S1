package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> doubleList = new ArrayList<>();

        while (in.hasNextDouble()) {
            Double num = in.nextDouble();
            doubleList.add(num);
        }

        in.close();

        Double sum = 0.0;

        for (Double element: doubleList) {
            sum += element;
        }

        System.out.println(sum / doubleList.size());
    }
}
