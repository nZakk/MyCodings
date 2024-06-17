import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int qtdPerson = sc.nextInt();

        List<Person> personList = new ArrayList<>();

        for(int curr = 0; curr < qtdPerson; curr++){
            System.out.printf("\033[1mTax payer #%d data: \033[0m%n", curr + 1);
            System.out.print("Individual or company (i/c): ");
            char typePerson = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();
            if( typePerson == 'i') {
                System.out.print("Wealth expenses: ");
                double wealthExpenses = sc.nextDouble();

                Person person = new NaturalPerson(name, annualIncome, wealthExpenses);
                personList.add(person);
            } else if (typePerson == 'c') {
                System.out.print("Number of employees: ");
                int qtdEmployee = sc.nextInt();

                Person person = new LegalPerson(name, annualIncome, qtdEmployee);
                personList.add(person);
            }
        }
        System.out.println();
        System.out.printf("\033[1mTAX PAID: \033[0m%n");
        double totalTax = 0;

        for(Person p : personList){
            System.out.printf("%s: $ %.2f%n",p.getName(), p.tax());
        }
        for(Person p : personList){
            totalTax += p.tax();
        }

        System.out.println();
        System.out.printf("\033[1mTOTAL TAXES: $ %.2f \033[0m%n", totalTax);



        sc.close();
    }
}