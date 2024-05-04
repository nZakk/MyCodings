package entities;

public class Person {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }
    public void IncreaseSalary(double percentage){
        grossSalary += grossSalary * (percentage / 100);
    }

    public String toString() {
        return String.format("%s", name) + ", $ " +
                String.format("%.2f%n", netSalary());
    }

}
