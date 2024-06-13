import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int qtdEmployees = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for(int curr = 0; curr < qtdEmployees; curr++){
            System.out.printf("\033[1mEmployee #%d data: \033[0m%n", curr + 1);
            System.out.print("Outsourced (y/n)? ");
            sc.nextLine();
            String isOutsouced = sc.nextLine();

            if(isOutsouced.equalsIgnoreCase("y")){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(employee);
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();

                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            }
        }
        System.out.println("PAYMENTS: ");
        for(Employee employee : employeeList){
            System.out.println(employee);
        }

        sc.close();
    }
}