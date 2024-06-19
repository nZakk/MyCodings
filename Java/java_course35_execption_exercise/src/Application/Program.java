package Application;

import model.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data ");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double initBalance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initBalance, withdrawLimit);
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());

            System.out.printf("New balance: $%.2f%n", account.getBalance());
        }
        catch (IllegalArgumentException e){
            System.out.println("Withdraw Error: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



        sc.close();
    }
}
