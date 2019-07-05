package comp1110.homework.J06;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i += 1) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return false;
        }
        if (n == 2 && n == 3) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i += 1) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}