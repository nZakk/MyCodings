package model.services;

public class PaypalOnlineServices implements OnlinePayamentService {
    @Override
    public Double interest(Double amount, Integer month) {
        return amount + amount * month / 100;
    }

    @Override
    public Double paymentFee(Double amount) {
        return amount + amount * 0.02;
    }
}
