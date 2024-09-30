import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        System.out.println("Enter the subtotal and a gratuity rate:");
        Scanner in = new Scanner(System.in);
        double subtotal = in.nextDouble();
        double rate = in.nextDouble();
        System.out.println(
                "The gratuity is $" + subtotal * rate / 100 + " and toal is $" + (subtotal * rate / 100 + subtotal));
        in.close();
    }
}
