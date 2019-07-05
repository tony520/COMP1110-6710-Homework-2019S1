package comp1110.homework.J14;

import java.util.HashMap;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hmp = new HashMap<>();

        String query = "";
        while (in.hasNext()) {
            String input = in.nextLine();
            String[] strArr = input.split(" ");
            if (strArr.length == 2) {
                hmp.put(strArr[0], Integer.parseInt(strArr[1]));
            }
            if (strArr.length == 1) {
                query = strArr[0];
            }


        }
        if (hmp.get(query) == null) {
            System.out.println("unknown");
        }
        else {
            System.out.println(hmp.get(query));
        }
    }
}