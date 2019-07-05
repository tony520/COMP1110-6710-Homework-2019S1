package comp1110.homework.J06;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Integer.bitCount(n));
    }
}
