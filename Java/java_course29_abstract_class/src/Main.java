import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //Account acc1 = new Account(1001, "alex", 1000.0)
        // can't instantiate an Account class because it's an abstract class now
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(1001, "alex", 400.0, 10));
        accounts.add(new SavingsAccount(1002, "maria", 600.0, 5));
        accounts.add(new BusinessAccount(1003, "bob", 10000.0, 5000.0));
        accounts.add(new BusinessAccount(1005, "Isaac", 8000.0, 2000.0));
        double sum = 0;
        for (Account acc : accounts) {
            acc.deposit(500.0);
            sum += acc.getBalance();
        }
        System.out.print(sum);
    }
}