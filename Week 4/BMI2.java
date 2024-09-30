import java.util.Scanner;

public class BMI2 {
    public static void main(String[] args) {
        System.out.println("Enter weight in pounds:");
        System.out.println("Enter height in inches:");
        Scanner in = new Scanner(System.in);
        double weight = in.nextDouble() * 0.45359237;
        double height = in.nextDouble() * 0.0254;
        System.out.println("BMI is " + weight / height / height);
        in.close();
    }
}
