import java.util.function.Consumer;

public class priceUpdateConsumer implements Consumer<Product> {
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
