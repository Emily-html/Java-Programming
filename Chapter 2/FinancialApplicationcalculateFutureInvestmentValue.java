import java.util.Scanner;

public class FinancialApplicationcalculateFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        double amount = in.nextDouble();
        System.out.println("Enter annual interest rate in percentage:");
        double rate = in.nextDouble();
        System.out.println("Enter number of years:");
        double years = in.nextDouble();
        System.out.println("Future value is $" + amount * Math.pow((1 + rate / (12 * 100)), years * 12));

        in.close();
    }
}
