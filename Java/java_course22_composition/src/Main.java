import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        Department tempDepartment = new Department(sc.nextLine());

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String tempName = sc.nextLine();

        System.out.print("Level: ");
        WorkLevel tempLevel = WorkLevel.valueOf(sc.nextLine());

        System.out.print("Base Salary: ");
        Double tempSalary = sc.nextDouble();

        Worker worker0 = new Worker(tempDepartment, tempName, tempLevel, tempSalary);

        System.out.print("How many contracts to this worker? ");
        int qtdContracts = sc.nextInt();
        System.out.println();

        for (int curr = 0; curr < qtdContracts; curr++) {
            System.out.printf("Enter contract #%d data: %n", curr + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String tempDateString = sc.nextLine();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate tempDate = LocalDate.parse(tempDateString, fmt);

            System.out.print("Value per hour: ");
            double tempValuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int tempHours = sc.nextInt();
            System.out.println();

            HourContract workContract = new HourContract(tempDate, tempValuePerHour, tempHours);

            worker0.addContract(workContract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");

        sc.nextLine();
        String dateIncomeString = sc.nextLine();
        int dateIncomeMonth = Integer.parseInt(dateIncomeString.substring(0, 2));
        int dateIncomeYear = Integer.parseInt(dateIncomeString.substring(3));
        double workerIncome = worker0.income(dateIncomeYear, dateIncomeMonth);

        System.out.printf("Name: %s%n", worker0.getName());
        System.out.printf("Department: %s%n", worker0.getDepartment().getName());
        System.out.printf("Income for %d/%d: %.2f%n", dateIncomeMonth, dateIncomeYear, workerIncome);

        sc.close();
    }
}