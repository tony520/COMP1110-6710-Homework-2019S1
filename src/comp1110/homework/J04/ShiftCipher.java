package comp1110.homework.J04;

import java.util.Scanner;

public class ShiftCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int shift = in.nextInt();
        String result = "";

        for (int i = 0; i < str.length(); i += 1) {
            char cur = str.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                int distance = cur - 'a';
                int real = shift + distance;
                if (real > 25) {
                    real = real % 26;
                }
                result += (char) ('a' + real);
            }
            else if (cur >= 'A' && cur <= 'Z') {
                int distance = cur - 'A';
                int real = shift + distance;
                if (real > 25) {
                    real = real % 26;
                }
                result += (char) ('A' + real);
            }
            else {
                result += cur;
            }
        }
        System.out.println(result);
    }
}