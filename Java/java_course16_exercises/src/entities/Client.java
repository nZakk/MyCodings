package Java.java_course16_exercises.src.entities;

public class Client {
    private int accNumber;
    public String name;
    private double balance = 0;

    public Client (int accNumber, String name){
        this.accNumber = accNumber;
        this.name = name;
    }

    public int getAccNumber(){
        return accNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= (amount + 5);
    }

    public void ToString(){
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", accNumber, name, balance);
    }
    
}
