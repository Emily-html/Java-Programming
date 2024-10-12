public class TaxRAteFormating {
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.err.println("Interest is $" + interest);
        System.out.printf("Interest with two decimal point is $%4.2f", interest);

    }
}
