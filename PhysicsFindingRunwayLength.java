import java.util.Scanner;

public class PhysicsFindingRunwayLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the speed and acceleration:");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();
        System.out.println("The minimum runway length for this airplane is " + (speed * speed) / (acceleration * 2));
        in.close();
    }
}
