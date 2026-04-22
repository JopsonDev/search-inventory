package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class Main {
    static void main(String[] args) {
        String fileName = "inventory.csv";
        List<Product> inventory = SearchInventory.getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }
/*        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

        } catch (Exception a) {
            System.out.println("explosions everywhere!!!!");
        }*/
    }
}
