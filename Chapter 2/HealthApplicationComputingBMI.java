import java.util.Scanner;

public class HealthApplicationComputingBMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double pounds = in.nextDouble();
        System.out.println("Enter weight in pounds:");
        double inches = in.nextDouble();
        System.out.println("BMI is " + pounds * 0.45359237 / (0.0254 * inches * inches * 0.0254));

        in.close();
    }
}
