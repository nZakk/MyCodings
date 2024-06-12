import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {


        Account acc1 = new Account(1001, "alex" , 1000.0);
        acc1.withdraw(100.0);

        Account bacc1 = new BusinessAccount(1002, "mario", 1000.0, 10000.0);
        bacc1.withdraw(100.0);

        Account sacc1 = new SavingsAccount(1002, "maria", 1000.0, 10);
        sacc1.withdraw(100.0);


        System.out.println("acc = " + acc1.getBalance());
        System.out.println("bacc = " + bacc1.getBalance());
        System.out.println("sacc = " + sacc1.getBalance());
    }
}