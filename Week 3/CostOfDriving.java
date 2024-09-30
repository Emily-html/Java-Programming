import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the driving distance:");
        double distance = in.nextDouble();
        System.out.println("Enter miles per gallon:");
        double miles = in.nextDouble();
        System.out.println("Enter price per gallon:");
        double price = in.nextDouble();
        System.out.println("The cost of driving is $" + distance / miles * price);
        in.close();

    }
}