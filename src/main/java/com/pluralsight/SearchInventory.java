package com.pluralsight;

import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product(1234, "apple", 22.99));
        inventory.add(new Product(2345, "time", 27.99));
        inventory.add(new Product(3456, "ugh", 299.99));
        inventory.add(new Product(4567, "wait here", 21.99));
        inventory.add(new Product(5678, "top", 13.99));


        return inventory;
    }
}

