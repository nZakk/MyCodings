package model.services;

public interface OnlinePayamentService {
    public Double interest(Double amount, Integer month);
    public Double paymentFee(Double amount);
}
