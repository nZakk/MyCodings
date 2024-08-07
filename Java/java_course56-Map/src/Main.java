import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "999-999-9990");
        cookies.put("spam", "You won 1.000.000 usd");

        cookies.remove("spam");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number:  " + cookies.get("phone"));
        System.out.println("Spam:  " + cookies.get("spam"));
        System.out.println("Size:  " + cookies.size());

        System.out.println("All cookies: ");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println();

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("tv", 2000.0);
        Product p2 = new Product("tablet", 1000.0);
        Product p3 = new Product("SmartPhone", 1500.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("tv", 2000.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));




    }
}