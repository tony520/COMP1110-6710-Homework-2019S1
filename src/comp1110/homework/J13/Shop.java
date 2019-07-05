package comp1110.homework.J13;

import java.util.HashMap;

public class Shop {

    private static class Product {
        String name;
        int stock;
        int price;
        int rate;
        int reorderdays;

        public Product(String name, int stock, int price) {
            this.name = name;
            this.stock = stock;
            this.price = price;
        }

        public Product(String name, int stock, int price, int rate, int reorderdays) {
            this.name = name;
            this.stock = stock;
            this.price = price;
            this.rate = rate;
            this.reorderdays = reorderdays;
        }
    }

    HashMap<String, Product> products = new HashMap<>();

    public void addItem(String name, int stock, int price) {
        products.put(name, new Product(name, stock, price));
    }

    public int totalStockValue() {
        int value = 0;
        for (String s : products.keySet()) {
            Product p = products.get(s);
            value += p.price*p.stock;
        }

        return value;
    }

    public void addItem(String name, int stock, int price, int rate, int reorderdays) {
        products.put(name, new Product(name, stock, price, rate, reorderdays));
    }

    public HashMap reorder() {
        HashMap<String, Integer> hmap = new HashMap<>();
        for (String s: products.keySet()) {
            Product p = products.get(s);
            if ((p.stock - p.rate * p.reorderdays) <= 1) {
                hmap.put(p.name, p.rate * 7 - p.stock);
            }
        }

        return hmap;
    }
}
