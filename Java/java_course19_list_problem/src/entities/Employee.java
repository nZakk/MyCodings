package entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(){}

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){ return id; }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalaryPercentage(int percentage){
        salary += salary * (double) percentage / 100;
    }


    @Override
    public String toString() {
        return String.format("%d, %s, %.2f%n", id, name, salary);
    }
}
