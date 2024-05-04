package application;

import entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product01 = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();
        product01.setName(name);
        System.out.print("Price: ");
        double price = sc.nextDouble();
        product01.setPrice(price);

        System.out.println("Product data: " + product01);

        product01.setName("Pc");
        System.out.printf("Updated name: %s%n", product01.getName());

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product01.increaseStock(quantity);

        System.out.println();
        System.out.println("updated data: " + product01);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product01.decreaseStock(quantity);

        System.out.println();
        System.out.println("Updated data: " + product01);

        sc.close();
    }
}