package entities;

import entities.enums.WorkLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}

    public Worker(Department department, Double baseSalary, WorkLevel level, String name) {
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

    public  double income(int year, int month){
        double totalContracts = 0;
        double totalIncome = baseSalary;

        Calendar calendar = Calendar.getInstance();
        for(HourContract contract : contracts){
            calendar.setTime(contract.getDate());
            int contract_year = calendar.get(Calendar.YEAR);
            int contract_month = 1 + calendar.get(Calendar.MONTH);
            if(contract_year == year && contract_month == month){
                totalIncome += contract.totalValue();
            }
        }
        return  totalIncome;
    }
}
