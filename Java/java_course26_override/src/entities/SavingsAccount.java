package entities;

public class SavingsAccount extends Account{
    private Integer interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Integer interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * ((double) interestRate / 100);
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        //it's a method to call the method from superclass to use
        balance -= 5;
    }
}
