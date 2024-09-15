import java.util.Scanner;

public class FinancialApplicationMonetaryUnits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an amount in double ,for example 11.56:");
        double amount = in.nextDouble();
        int integer = (int) (amount * 100);
        int dollars = integer / 100;
        int remainingdollar = integer % 100;
        int quarters = remainingdollar / 25;
        int remainingquarter = remainingdollar % 25;
        int dimes = remainingquarter / 10;
        int remainingdime = remainingquarter % 10;
        int nikles = remainingdime / 5;
        int pennies = remainingdime % 5;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + quarters + " quarter ");
        System.out.println(" " + dimes + " dimes");
        System.out.println(" " + nikles + " nikles");
        System.out.println(" " + pennies + " pennies");

        in.close();
    }
}
