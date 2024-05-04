package application;

import entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product01 = new Product(name, price, quantity);

        System.out.println("Product data: " + product01);


        System.out.print("Enter the number of products to be added in stock: ");
        product01.increaseStock(sc.nextInt());

        System.out.println("updated data: " + product01);

        System.out.print("Enter the number of products to be removed in stock: ");
        product01.decreaseStock(sc.nextInt());

        System.out.println("Updated data: " + product01);

        sc.close();
    }
}