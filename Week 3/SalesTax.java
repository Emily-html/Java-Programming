import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        System.out.println("Enter purchase amount:");
        Scanner in = new Scanner(System.in);
        double purchase = in.nextDouble();
        int tax = (int) (purchase * 0.06 * 100);
        double final_tax = tax / 100.0;
        System.out.println("Sales tax is $" + final_tax);
        in.close();

    }
}
