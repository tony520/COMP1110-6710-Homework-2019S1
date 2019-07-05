package comp1110.homework.J05;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        if (grade >= 0 && grade <= 49) {
            System.out.println("N");
        }
        else if (grade >= 50 && grade <= 59) {
            System.out.println("P");
        }
        else if (grade >= 60 && grade <= 69) {
            System.out.println("C");
        }
        else if (grade >= 70 && grade <= 79) {
            System.out.println("D");
        }
        else if (grade >= 80 && grade <= 100) {
            System.out.println("HD");
        }
        else {
            System.out.println("Bad mark");
        }
    }
}