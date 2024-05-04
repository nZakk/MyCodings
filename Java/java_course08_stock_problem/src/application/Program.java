package application;

import entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        Product product01 = new Product();

        System.out.print("Name: ");
        product01.name = sc.nextLine();
        System.out.print("Price: ");
        product01.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product01.quantity = sc.nextInt();

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