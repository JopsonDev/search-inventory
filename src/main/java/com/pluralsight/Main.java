package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    static void main(String[] args) {
        String fileName = "inventory.csv";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
        } catch (Exception a) {
            System.out.println("explosions everywhere!!!!");
        }
    }
}
