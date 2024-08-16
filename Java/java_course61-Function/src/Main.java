import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("hd case", 80.00));

        //List<String> names =  list.stream().map(new upperFunction()).toList(); interface implementation method

        //List<String> names =  list.stream().map(Product::staticUpperFunction).toList(); static method

        //List<String> names =  list.stream().map(Product::nonStaticUpperFunction).toList(); non-static method

        /*
        Function<Product, String> toUpperLambda = p -> p.getName().toUpperCase();

        List<String> names =  list.stream().map(toUpperLambda).toList(); declared lambda method
        */

        List<String> names =  list.stream().map(p -> p.getName().toUpperCase()).toList(); // inline lambda method

        names.forEach(System.out::println);
    }
}