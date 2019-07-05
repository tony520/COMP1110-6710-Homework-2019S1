package comp1110.homework.J14;


import java.util.HashMap;

public class Shop {

    public class Item {
        String name;
        int stock;
        int price;
        int rate;
        int reorderdays;

        Item(String name, int stock, int price) {
            this.name = name;
            this. stock = stock;
            this.price = price;
        }

        Item(String name, int stock, int price, int rate, int reorderdays) {
            this.name = name;
            this.stock = stock;
            this.price = price;
            this.rate = rate;
            this.reorderdays = reorderdays;
        }
    }

    HashMap<String, Item> goods = new HashMap<>();

    public void addItem(String name, int stock, int price) {
        goods.put(name, new Item(name, stock, price));
    }

    public int totalStockValue() {
        int sum = 0;
        for (String s: goods.keySet()) {
            sum += goods.get(s).price * goods.get(s).stock;
        }

        return sum;
    }

    public void addItem(String name, int stock, int price, int rate, int reorderdays) {
        goods.put(name, new Item(name, stock, price, rate, reorderdays));
    }

    public HashMap<String, Integer> reorder() {
        HashMap<String, Integer> res = new HashMap<>();
        for (String s: goods.keySet()) {
            Item i = goods.get(s);
            if (i.stock - i.rate * i.reorderdays <= 1) {
                res.put(i.name, i.rate * 7 - i.stock);
            }
        }

        return res;
    }
}
