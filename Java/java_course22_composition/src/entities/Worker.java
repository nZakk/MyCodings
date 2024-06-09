package entities;

import entities.enums.WorkLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}

    public Worker(Department department, String name, WorkLevel level, Double baseSalary) {
        this.department = department;
        this.baseSalary = baseSalary;
        this.level = level;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public String toString() {
        return "Worker{" +
                "department=" + department.getName() +
                ", baseSalary=" + baseSalary +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }

    public  double income(int year, int month){
        double totalContracts = 0;
        double totalIncome = baseSalary;

        for(HourContract contract : contracts){
            int contract_year = contract.getDate().getYear();
            int contract_month = contract.getDate().getMonthValue();
            if(contract_year == year && contract_month == month){
                totalIncome += contract.totalValue();
            }
        }
        return  totalIncome;
    }
}
