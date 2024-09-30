import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        System.out.println("enter purchase amount:");
        Scanner in = new Scanner(System.in);
        double purchase = in.nextDouble();
        System.out.println("Sales tax is $" + purchase * 0.06);
        in.close();
    }
}
