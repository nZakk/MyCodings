package application;

import entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person personA = new Person();

        System.out.print("Name: ");
        personA.name = sc.nextLine();

        System.out.print("Gross salary: ");
        personA.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        personA.tax = sc.nextDouble();

        System.out.print("Employee: " + personA);

        System.out.print("Which percentage to increase salary? ");
        personA.IncreaseSalary(sc.nextDouble());

        System.out.print("Updated data: " + personA);
        sc.close();
    }
}