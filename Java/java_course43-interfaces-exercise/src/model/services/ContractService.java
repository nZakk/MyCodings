package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    public void process(Contract contract, Integer months, OnlinePayamentService paymentService){
        for(int curr = 0; curr < months; curr++){
            LocalDate dueDate = contract.getContractDate().plusMonths(curr + 1);

            Double installmentValue = paymentService.paymentFee(paymentService.interest(contract.getContractValue() / months, curr + 1));

            Installment installment = new Installment(dueDate, installmentValue);

            contract.getInstallmentsList().add(installment);
        }
    }
}
