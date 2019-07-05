package comp1110.homework.J04;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
    }
}
