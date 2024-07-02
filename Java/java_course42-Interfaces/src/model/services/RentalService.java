package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double hourlyPrice;
    private Double dailyPrice;

    private TaxService taxService;

    public RentalService(Double hourlyPrice, Double dailyPrice, TaxService taxService) {
        this.hourlyPrice = hourlyPrice;
        this.dailyPrice = dailyPrice;
        this.taxService = taxService;
    }

    public void ProcessInvoice(CarRental rental){
        double rentalDurationMinutes = Duration.between(rental.getStart(), rental.getFinish()).toMinutes();
        double rentalDurationHours = Math.ceil(rentalDurationMinutes / 60);

        if(rentalDurationHours < 12){
            double basicPayment = hourlyPrice * rentalDurationHours;
            rental.setInvoice(new Invoice(basicPayment, taxService.getTax(basicPayment)));
        } else {
            double rentalDurationDays= Math.ceil(rentalDurationHours / 24);
            double basicPayment = dailyPrice * rentalDurationDays;
            rental.setInvoice(new Invoice(basicPayment, taxService.getTax(basicPayment)));
        }
    }
}
