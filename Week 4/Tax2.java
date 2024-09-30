import java.util.Scanner;

public class Tax2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double purchase = in.nextDouble();
        if (purchase <= 90) {
            System.out.println("Pay is $" + purchase * 1.03);
        } else
            System.out.println("Pay is $" + purchase * 1.01);
        in.close();
    }
}
