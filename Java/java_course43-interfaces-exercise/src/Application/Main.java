package Application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePayamentService;
import model.services.PaypalOnlineServices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contract data: ");
        System.out.print("Contract number: ");
        int contractNumber = sc.nextInt();
        System.out.print("Contract dat(dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate contractDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        System.out.print("Enter number of installments: ");
        int installmentsQtd = sc.nextInt();

        OnlinePayamentService paymentService = new PaypalOnlineServices();

        ContractService service = new ContractService();
        service.process(contract, installmentsQtd, paymentService);

        System.out.println("INSTALLMENTS: ");
        for (Installment installment : contract.getInstallmentsList()){
            System.out.println(installment);
        }


        sc.close();
    }
}