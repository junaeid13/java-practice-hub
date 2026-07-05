package com.junaeid.arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> products = new ArrayList<>();

        boolean running = true;

        while (running) {

            System.out.println("""
                    1. Add product
                    2. Remove product
                    3. View cart
                    4. Total products
                    5. Exit
                    """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Product name: ");
                    String productName = sc.nextLine();
                    products.add(productName);
                    break;

                case 2:
                    System.out.print("Product name: ");
                    productName = sc.nextLine();

                    if (products.contains(productName)) {
                        products.remove(productName);
                        System.out.println("Removed successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.println(products);
                    break;

                case 4:
                    System.out.println("Total products: " + products.size());
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
