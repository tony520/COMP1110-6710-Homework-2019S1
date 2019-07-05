package comp1110.homework.J04;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sb = in.nextInt();
        int db = in.nextInt();
        String s = in.next();
        int num = Integer.parseInt(s, sb);
        System.out.println(Integer.toString(num, db));
    }
}