package application;

import model.entities.Reservation;
import model.exeptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNum = sc.nextInt();
            sc.nextLine();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkInDate = LocalDate.parse(sc.nextLine(), fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOutDate = LocalDate.parse(sc.nextLine(), fmt);

            Reservation reservation = new Reservation(roomNum, checkInDate, checkOutDate);
            System.out.println();
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkInDate = LocalDate.parse(sc.nextLine(), fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOutDate = LocalDate.parse(sc.nextLine(), fmt);

            reservation.updateDates(checkInDate, checkOutDate);
            System.out.println();
            System.out.println("Reservation: " + reservation);
        }
        catch (DomainException e){
            System.out.println("Error in Reservation: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected Error");
        }
        sc.close();
    }
}
