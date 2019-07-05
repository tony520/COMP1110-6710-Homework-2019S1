package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        while (in.hasNext()) {
            String str = in.nextLine();
            stringList.add(str);
        }

        in.close();

        for (int i = 0; i < stringList.size(); i += 1) {
            System.out.println(stringList.get(stringList.size() - i - 1));
        }
    }
}
