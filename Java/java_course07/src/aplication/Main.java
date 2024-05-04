package aplication;

import entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:" );
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:" );
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X are : %.4f%n", areaX);
        System.out.printf("Triangle Y are : %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else if (areaY > areaX) {
            System.out.println("Larger area: Y");
        } else {
            System.out.println("Equal");
        }

        sc.close();
    }
}