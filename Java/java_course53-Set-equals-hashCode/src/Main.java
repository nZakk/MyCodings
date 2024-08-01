import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();

        set.add(new Product("Tv", 900.00));
        set.add(new Product("Notebook", 1900.00));
        set.add(new Product("Tablet", 500.00));

        Product prod = new Product("Notebook", 1900.00);

        System.out.println(set.contains(prod));

    }
}