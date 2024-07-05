package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer contractNum;
    private LocalDate contractDate;
    private Double contractValue;

    private List<Installment> installmentsList = new ArrayList<>();

    public Contract(){}

    public Contract(Integer contractNum, LocalDate contractDate, Double contractValue) {
        this.contractNum = contractNum;
        this.contractDate = contractDate;
        this.contractValue = contractValue;
    }

    public Integer getContractNum() {
        return contractNum;
    }

    public void setContractNum(Integer contractNum) {
        this.contractNum = contractNum;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public Double getContractValue() {
        return contractValue;
    }

    public void setContractValue(Double contractValue) {
        this.contractValue = contractValue;
    }

    public List<Installment> getInstallmentsList() {
        return installmentsList;
    }
}
