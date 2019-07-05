package comp1110.homework.J06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (ch1.length != ch2.length) {
            System.out.println("No");
        }
        else {
            boolean flag = true;
            for (int i = 0; i < ch1.length; i += 1) {
                if (ch1[i] != ch2[i]) {
                    flag = false;
                }
            }
            if (!flag) {
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}
