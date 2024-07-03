package Application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;
import model.services.TaxService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the rental data:" );
        System.out.print("Car model:" );
        Vehicle model = new Vehicle(sc.nextLine());
        System.out.print("Rental start date (dd/MM/yyyy hh:mm):" );
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Rental finish date (dd/MM/yyyy hh:mm):" );
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental carRental = new CarRental(start, finish, model);

        System.out.print("Hourly price:" );
        double hourlyPrice = sc.nextDouble();
        System.out.print("Daily price:" );
        double dailyPrice = sc.nextDouble();

        RentalService rentalService = new RentalService(hourlyPrice, dailyPrice, new BrazilTaxService());
        rentalService.ProcessInvoice(carRental);

        System.out.println("INVOICE: ");
        System.out.printf("Basic payment: $ %.2f%n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Tax payment: $ %.2f%n", carRental.getInvoice().getTax());
        System.out.printf("Total payment: $ %.2f%n", carRental.getInvoice().getTotalPayment());

        sc.close();
    }
}
//  25/06/2018 10:30
//  25/06/2018 14:40