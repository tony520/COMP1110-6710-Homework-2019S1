package comp1110.homework.J13;

import java.util.Scanner;
import java.util.HashMap;

public class People {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String input;
        String[] tmp;
        String queryName = "";

        while (in.hasNext()) {
            input = in.nextLine();
            tmp = input.split(" ");
            if (tmp.length == 1) {
                queryName = tmp[0];
            }
            else {
                hmap.put(tmp[0], tmp[1]);
            }
        }

        if (hmap.get(queryName) == null) {
            System.out.println("unknown");
        }
        else {
            System.out.println(hmap.get(queryName));
        }

        in.close();
    }
}
