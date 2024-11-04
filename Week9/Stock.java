public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String s1, String s2) {
        symbol = s1.substring(0, 3);
        name = s2.substring(0, 17);
    }

    double getChangePercent(double current) {
        return (current - previousClosingPrice) / previousClosingPrice;

    }

}
