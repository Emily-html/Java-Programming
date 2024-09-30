import java.util.Scanner;

public class FinancialApplicationCompoundValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount:");
        int amount = in.nextInt();
        double a1 = amount * (1 + 0.00417);
        double a2 = (amount + a1) * (1 + 0.00417);
        double a3 = (amount + a2) * (1 + 0.00417);
        double a4 = (amount + a3) * (1 + 0.00417);
        double a5 = (amount + a4) * (1 + 0.00417);
        double a6 = (amount + a5) * (1 + 0.00417);
        System.out.println("After the six month, the account value is $" + a6);
        in.close();

    }
}
