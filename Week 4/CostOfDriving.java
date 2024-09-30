import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the driving distance:");
        System.out.println("Enter miles per gallon:");
        System.out.println("Enter price per gallon:");
        double dis = in.nextDouble();
        double miles = in.nextDouble();
        double price = in.nextDouble();
        System.out.println("The cost of driving is " + dis / miles * price);
        in.close();
    }
}
