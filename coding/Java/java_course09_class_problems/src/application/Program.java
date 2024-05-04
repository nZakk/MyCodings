package application;

import entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle1.width = sc.nextDouble();
        rectangle1.height = sc.nextDouble();

        System.out.printf("Area = %.2f%n" +
                "Perimeter = %.2f%n" +
                "Diagonal = %.2f%n", rectangle1.area(), rectangle1.perimeter(), rectangle1.diagonal());

        sc.close();
    }
}