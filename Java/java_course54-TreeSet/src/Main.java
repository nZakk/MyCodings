import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();

        set.add(new Product("Tv", 900.00));
        set.add(new Product("Notebook", 1900.00));
        set.add(new Product("Tablet", 500.00));

        for(Product p : set){
            System.out.println(p);
        }

    }
}