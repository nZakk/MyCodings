package Java.java_course16_exercises.src.application;
import Java.java_course16_exercises.src.entities.Client;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String answer = sc.nextLine();
        
        Client client1 = new Client(accNumber, name);
        if (answer.equalsIgnoreCase("y")){
            System.out.print("Enter initial deposit value:");
            double initBalance = sc.nextDouble();
            client1.deposit(initBalance);
        }
        
        System.out.println();
        
        System.out.println("Account data:");
        client1.ToString();
        
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double amountMoney = sc.nextDouble();
        client1.deposit(amountMoney);

        System.out.println();

        System.out.println("Updated account data:");
        client1.ToString();

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        amountMoney = sc.nextDouble();
        client1.withdraw(amountMoney);

        System.out.println();

        System.out.println("Updated account data:");
        client1.ToString();


        sc.close();
    }
}
