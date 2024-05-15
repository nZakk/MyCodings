package application;

import entities.Client;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client client1;

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("y")){
            System.out.print("Enter initial deposit value:");
            double initBalance = sc.nextDouble();

            client1 = new Client(accNumber, name, initBalance);
        }   else {
            client1 = new Client(accNumber, name);
        }

        System.out.println();
        
        System.out.println("Account data:");
        System.out.println(client1);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double amountMoney = sc.nextDouble();
        client1.deposit(amountMoney);

        System.out.println();

        System.out.println("Updated account data:");
        System.out.println(client1);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        amountMoney = sc.nextDouble();
        client1.withdraw(amountMoney);

        System.out.println();

        System.out.println("Updated account data:");
        System.out.println(client1);


        sc.close();
    }
}
