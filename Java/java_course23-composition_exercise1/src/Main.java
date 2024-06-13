import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[1mEnter client data: \033[0m");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date(DD/MM/YYYY): ");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(),fmt);
        System.out.println("\033[1mEnter order data: \033[0m");
        System.out.print("Status: ");
        String statusString = sc.nextLine();
        OrderStatus status = OrderStatus.valueOf(statusString);
        System.out.print("How many items to this order? ");
        int qtdItems = sc.nextInt();

        Client client_0 = new Client(name, email, birthDate);

        LocalDateTime orderMoment = LocalDateTime.now();
        Order order_0 = new Order(orderMoment, status, client_0);

        for(int curr = 0; curr < qtdItems; curr++){
            System.out.printf("\033[1mEnter #%d item data: \033[0m%n", curr + 1);
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, product);

            order_0.addItem(item);
        }

        System.out.println();
        System.out.println(order_0);

        sc.close();
    }
}