import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int qtdEmployee = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for(int curr = 0; curr < qtdEmployee; curr++){
            System.out.printf("Employee #%d: %n", curr + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employeeList.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have a salary increase: ");
        int idChosen = sc.nextInt();

        Integer position = idPosition(employeeList, idChosen);

        if(position == null){
            System.out.println("This id doesn't exist!");
        } else {
            System.out.print("Enter the percentage: ");
            int percent = sc.nextInt();
            employeeList.get(position).updateSalaryPercentage(percent);
        }

        System.out.println("List of employees:");
        for (Employee employee : employeeList) {

            System.out.print(employee.toString());

        }

        sc.close();
    }

     public static Integer idPosition(List<Employee> list, int id){
        for(int curr = 0; curr < list.size(); curr++){
            if( list.get(curr).getId() == id){
                return curr;
            }
         }
        return null;
     }
}