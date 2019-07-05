package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.HashMap;

public class Cost {

    public class Item implements Comparable<Item> {
        String name;
        int cost;
        public Item(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return name + " " + cost;
        }

        @Override
        public int compareTo(Item other) {
            return this.cost - other.cost;
        }
    }

    HashMap<String, Item> hmp;
    ArrayList<Item> arr;
    int smallestWaste;

    public Cost() {
        hmp = new HashMap<>();
        arr = new ArrayList<>();
    }

    public void addItem(String name, int cost) {
        Item i = new Item(name, cost);

        hmp.put(name, i);
        arr.add(i);
    }

    public void printCost() {
        arr.sort(Item::compareTo);

        for (Item i: arr) {
            System.out.println(i.toString());
        }
    }

    public int voucherWaste(int value) {
        smallestWaste = value;

        int[] prices = new int[arr.size()];

        for (int i = 0; i < arr.size(); i += 1) {
            prices[i] = arr.get(i).cost;
        }

        maxPurchase(prices, 0, value);

        return smallestWaste;
    }

    public void maxPurchase(int[] prices, int i, int remain) {
        if (remain == 0) {
            return;
        }

        if (i == prices.length - 1) {
            if (smallestWaste > remain % prices[i]) {
                smallestWaste = remain % prices[i];
            }

            return;
        }

        int N = remain / prices[i];

        for (int j = N; j >= 0; j -= 1) {
            int nextRemain = remain - prices[i] * j;

            maxPurchase(prices, i + 1, nextRemain);
        }
    }
}
