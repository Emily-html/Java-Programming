import java.util.Scanner;

public class FinancialApplicaations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity rate:");
        double subtotal = in.nextDouble();
        double rate = in.nextDouble();
        double gratuity = rate / 100.0 * subtotal;
        double sum = gratuity + subtotal;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + sum);
        in.close();

    }
}
