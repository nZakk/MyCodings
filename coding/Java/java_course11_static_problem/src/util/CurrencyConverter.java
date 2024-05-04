package util;

public class CurrencyConverter {
    static final double IOF = 0.06;

    public static double dollarConverter (double dollarQuantity, double dollarPrice) {
        double totalDollar = dollarQuantity * dollarPrice;
        return totalDollar + totalDollar * IOF;
    }
}
