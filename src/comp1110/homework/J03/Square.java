package comp1110.homework.J03;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        int area = side * side;
        System.out.println(area);
    }
}