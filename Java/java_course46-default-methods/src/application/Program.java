package application;

import service.BrazilInterestService;
import service.InterestService;
import service.UsaInterestService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        BrazilInterestService brazilInterestService = new BrazilInterestService(2.0);
        double BrazilPayment = brazilInterestService.payment(amount, months);

        System.out.printf("Brazil payment after %d months: %n",months);
        System.out.printf("%.2f %n",BrazilPayment);


        UsaInterestService usaInterestService = new UsaInterestService(1.0);
        double UsaPayment = usaInterestService.payment(amount, months);

        System.out.println();
        System.out.printf("Usa payment after %d months: %n",months);
        System.out.printf("%.2f %n",UsaPayment);

        sc.close();
    }
}
