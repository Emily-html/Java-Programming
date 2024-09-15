import java.util.Scanner;

public class FinancialApplicationsCalculatingInterests {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter balance and interest rate(e.g.3 for 3%):");
        double balance = in.nextDouble();
        double rate = in.nextDouble();
        System.out.println("The interest is " + balance * rate / (100 * 12));

        in.close();

    }
}
