package entities;

public class NaturalPerson extends Person{
    private Double wealthExpenses;

    public NaturalPerson(){}

    public NaturalPerson(String name, Double anualRevenue, Double wealthExpenses) {
        super(name, anualRevenue);
        this.wealthExpenses = wealthExpenses;
    }

    public Double getWealthExpenses() {
        return wealthExpenses;
    }

    public void setWealthExpenses(Double wealthExpenses) {
        this.wealthExpenses = wealthExpenses;
    }

    @Override
    public double tax() {
        double tax = 0;
        if (anualRevenue < 20000){
            tax = anualRevenue * 0.15 - wealthExpenses * 0.5 ;
        } else {
            tax = anualRevenue * 0.25 - wealthExpenses * 0.5;
        }

        return tax;
    }
}
