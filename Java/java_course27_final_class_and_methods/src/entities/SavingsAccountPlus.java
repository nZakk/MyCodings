package entities;

public class SavingsAccountPlus extends SavingsAccount{

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 10;
    }}
