public class TestStock {
    public static void main(String[] args) {
        Stock s = new Stock("ORCL", "Oracle Corporation");
        s.previousClosingPrice = 34.5;
        System.out.println("The price-change pecentage is " + s.getChangePercent(34.35));

    }
}
