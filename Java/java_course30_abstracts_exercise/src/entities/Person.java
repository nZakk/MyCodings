package entities;

public abstract class Person {
    private String name;
    protected Double anualRevenue;

    public Person(){}

    public Person(String name, Double anualRevenue) {
        this.name = name;
        this.anualRevenue = anualRevenue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualRevenue() {
        return anualRevenue;
    }

    public void setAnualRevenue(Double anualRevenue) {
        this.anualRevenue = anualRevenue;
    }

    public abstract double tax();
}
