package comp1110.homework.J05;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (isOdd(num)) {
            System.out.println(num + " is odd");
        }
        else {
            System.out.println(num + " is even");
        }
    }

    public static boolean isOdd(int i) {
        if (i % 2 == 0) {
            return false;
        }
        return true;
    }
}