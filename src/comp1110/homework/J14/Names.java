package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();

        while (in.hasNext()) {
            arr.add(in.nextLine());
        }

        for (int i = 0; i < arr.size(); i += 1) {
            System.out.println(arr.get(arr.size() - i - 1));
        }
    }
}
