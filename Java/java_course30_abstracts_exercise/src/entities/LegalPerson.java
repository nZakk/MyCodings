package entities;

public class LegalPerson extends Person{
    private Integer qtdEmployee;

    public LegalPerson(){}

    public LegalPerson(String name, Double anualRevenue, Integer qtdEmployee) {
        super(name, anualRevenue);
        this.qtdEmployee = qtdEmployee;
    }

    public Integer getQtdEmployee() {
        return qtdEmployee;
    }

    public void setQtdEmployee(Integer qtdEmployee) {
        this.qtdEmployee = qtdEmployee;
    }

    @Override
    public double tax() {
        double tax = 0;
        if (qtdEmployee > 10){
            tax = anualRevenue * 0.14;
        } else {
            tax = anualRevenue * 0.16;
        }

        return tax;
    }
}
