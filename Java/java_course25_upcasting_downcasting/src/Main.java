import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1010, "Maria", 10000.0, 500000.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1002, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1003, "maria", 0.0, 10);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.Loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount)acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.Loan(100.0);
            System.out.println("LOan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.deposit(1000.0);
            acc5.updateBalance();
            System.out.println("balance updated!" + acc5.getBalance());
        }
    }
}