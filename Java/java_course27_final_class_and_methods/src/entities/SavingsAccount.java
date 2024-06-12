package entities;

//if put final before class the class SavingsAccountPlus couldn't be created
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

    //if put final before, in the class SavingsAccountPlus
    // withdraw couldn't be modified
    @Override
    public final void withdraw(Double amount) {
        super.withdraw(amount);
        //it's a method to call the method from superclass to use
        balance -= 5;
    }
}
