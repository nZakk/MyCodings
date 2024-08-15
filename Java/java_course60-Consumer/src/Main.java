import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("hd case", 80.90));

        //list.forEach(new priceUpdateConsumer()); interface implementation

        //list.forEach(Product::staticPriceUpdate); reference static method

        //list.forEach(Product::nonStaticPriceUpdate); reference non-static method

        /*
        double factor = 1.1;

        Consumer<Product> updater = p -> p.setPrice(p.getPrice() * factor);

        list.forEach(updater); declared lambda method
        */

        double factor = 1.1;

        list.forEach(p -> p.setPrice(p.getPrice() * factor)); // inline lambda method

        list.forEach(System.out::println);
    }
}