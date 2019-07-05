package comp1110.homework.J01;

import java.util.Scanner;

public class NumberWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int num = in.nextInt();
        System.out.println(num + ", " + str);
    }
}
