package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();

        student1.name = sc.nextLine();
        student1.firstTrimester = sc.nextDouble();
        student1.secondTrimester = sc.nextDouble();
        student1.thirdTrimester = sc.nextDouble();

        student1.gradeCheck();

        sc.close();
    }
}