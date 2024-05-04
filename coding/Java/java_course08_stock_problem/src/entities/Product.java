package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;
    public double stockValue() {
        return price * (double) quantity;
    }

    public void increaseStock(int quantity) {
        this.quantity += quantity;
    }

    public void decreaseStock (int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: " + String.format("%.2f", stockValue());
    }
}


