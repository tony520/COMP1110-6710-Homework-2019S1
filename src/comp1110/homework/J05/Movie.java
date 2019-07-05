package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int timeNum = in.nextInt();
        int hour;
        int minute;
        hour = timeNum / 60;
        minute = timeNum % 60;
        if (hour == 0 && minute != 0 && minute != 1) {
            System.out.println(name + " runs for " + minute + " minutes");
        }
        if (hour == 0 && minute == 1) {
            System.out.println(name + " runs for " + minute + " minute");
        }
        if (hour == 1 && minute == 1) {
            System.out.println(name + " runs for " + hour + " hour" + " and " + minute + " minute");
        }
        if (hour == 1 && minute != 1 && minute != 0) {
            System.out.println(name + " runs for " + hour + " hour" + " and " + minute + " minutes");
        }
        if (hour != 0 && hour != 1 && minute == 1) {
            System.out.println(name + " runs for " + hour + " hours" + " and " + minute + " minute");
        }
        if (hour != 0 && hour != 1 && minute == 0) {
            System.out.println(name + " runs for " + hour + " hours");
        }
        if (hour == 1 && minute == 0){
            System.out.println(name + " runs for " + hour + " hour");
        }
        if (hour != 0 && hour != 1 && minute != 0) {
            System.out.println(name + " runs for " + hour + " hours" + " and " + minute + " minutes");
        }
    }
}
