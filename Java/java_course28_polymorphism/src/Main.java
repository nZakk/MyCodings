import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {


        Account acc1 = new Account(1001, "alex" , 100.0);
        acc1.withdraw(50.0);

        Account bacc1 = new BusinessAccount(1002, "mario", 100.0, 10000.0);
        bacc1.withdraw(50.0);

        Account sacc1 = new SavingsAccount(1002, "maria", 100.0, 10);
        sacc1.withdraw(50.0);

//all of them being the same type but being initialized with different classes
//so each one still have the difference on their method with overrided methods
// that's polymorphism
        System.out.println("acc = " + acc1.getBalance());
        System.out.println("bacc = " + bacc1.getBalance());
        System.out.println("sacc = " + sacc1.getBalance());
    }
}