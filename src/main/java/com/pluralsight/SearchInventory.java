package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        String fileName = "inventory.csv";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                ArrayList<Product> inventory = getInventory(id, name, price);
                for (Product product : inventory) {
                    System.out.println(product);
                }
            }
        } catch (Exception a) {
            System.out.println("explosions everywhere!!!!");
        }

    }

    public static ArrayList<Product> getInventory(int id, String name, double price) {
        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product(id, name, price));

        return inventory;
    }
}

