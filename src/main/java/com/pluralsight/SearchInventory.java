package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchInventory {
    public static void main(String[] args) {
        String fileName = "inventory.csv";
        try {

            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            List<Product> inventory = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                inventory.add(new Product(id, name, price));

                }
            for (Product product : inventory) {
                System.out.println(product);
            }
            Collections.sort(inventory, Comparator.comparing(Product::getName));
            for (Product product : inventory) {
                System.out.println(product);
            }
        } catch (Exception a) {
            System.out.println("explosions everywhere!!!!");
        }

    }

    public static List<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        return inventory;
    }
}

