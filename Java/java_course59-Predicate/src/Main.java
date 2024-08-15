import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("hd case", 80.00));

        /*
        Predicate<Product> prod = p -> p.getPrice() >= 100;

        list.removeIf(prod); declared lambda expression
        */

        list.removeIf(p -> p.getPrice() >= 100); // inline lambda expression

        //list.removeIf(Product::nonStaticProductPredicate); reference method non-static

        //list.removeIf(Product::staticProductPredicate); reference method static

        //list.removeIf(new ProductPredicate()); predicate class

        for(Product p : list){
            System.out.println(p);
        }
    }
}