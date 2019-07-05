package comp1110.homework.J07;

import java.util.Scanner;
import java.util.Arrays;

public class Menu {
    public static void main(String[] args) {
        String Menu = "Please enter:\n1 to find range of the scores\n2 to find the maximum score\n3 to find the second highest score";
        Scanner in = new Scanner(System.in);
        System.out.println(Menu);
        int choice = in.nextInt();
        if (choice < 1 || choice > 3) {
            System.out.println("Invalid Option Selected");
        }
        else {
            int N = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i += 1) {
                a[i] = in.nextInt();
            }
            switch (choice) {
                case 1:
                    System.out.println(findRange(a));
                    break;
                case 2:
                    System.out.println(getMax(a));
                    break;
                case 3:
                    System.out.println(getSecondHighest(a));
                    break;
                default:
                    break;
            }
        }

    }

    public static int findRange(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i += 1) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return (getMax(array) - minValue);
    }

    public static int getMax(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i += 1) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int getSecondHighest(int[] array) {
        int secondHighestValue = array[0];
        if (secondHighestValue != getMax(array)) {
            for (int i = 0; i < array.length; i += 1) {
                if (array[i] != getMax(array) && secondHighestValue < array[i]) {
                    secondHighestValue = array[i];
                }
            }
        }
        if (secondHighestValue == getMax(array)) {
            secondHighestValue = getMax(Arrays.copyOfRange(array,1, array.length));
        }
        return secondHighestValue;
    }
}
