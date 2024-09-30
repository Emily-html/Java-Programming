import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        System.out.println("Enter the monthly saving amount:");
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        double a1 = 1.00417 * amount;
        double a2 = 1.00417 * (100 + a1);
        double a3 = 1.00417 * (100 + a2);
        double a4 = 1.00417 * (100 + a3);
        double a5 = 1.00417 * (100 + a4);
        double a6 = 1.00417 * (100 + a5);
        System.out.println("After the six month, the account value is $:" + a6);
        in.close();
    }
}
