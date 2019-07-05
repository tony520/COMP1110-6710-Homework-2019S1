package comp1110.homework.J11;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String out = "";

        if (str.length() == 0) {
            System.out.println("");
        }
        else {
            int sum = 1;

            for (int i = 0; i < str.length() - 1; i += 1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    sum += 1;
                }
                else{
                    if (sum != 1) {
                        out = out + str.charAt(i) + sum;
                        sum = 1;
                    }
                    else {
                        out = out + str.charAt(i);
                    }
                }
            }

            if (sum > 1) {
                out = out + str.charAt(str.length() - 1) + sum;
            }
            else {
                out = out + str.charAt(str.length() - 1);
            }
            System.out.println(out);
        }
    }
}