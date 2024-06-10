package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItemList = new ArrayList();

    public Order(){}

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem orderItem) {
        orderItemList.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItemList.remove(orderItem);
    }

    public Double total(){
        double total = 0;
        for(OrderItem item : orderItemList){
            total += item.subTotal();
        }
        return total;
    }

    public String toString() {

        StringBuilder orderDetailBuilder = new StringBuilder();
        orderDetailBuilder.append("\033[1mORDER SUMMARY: \033[0m" + "\n");
        orderDetailBuilder.append("Order moment: " + moment.format(fmt) + "\n");
        orderDetailBuilder.append("Order status: " + status + "\n");
        orderDetailBuilder.append("Client: " + client + "\n");
        orderDetailBuilder.append("Order items: " + "\n");

        for(OrderItem item: orderItemList){
            orderDetailBuilder.append(item + "\n");
        }

        orderDetailBuilder.append("Total price: $" + total() + "\n");

        return orderDetailBuilder.toString();
    }
}
