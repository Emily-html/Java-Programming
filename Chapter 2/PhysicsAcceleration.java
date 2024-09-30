import java.util.Scanner;

public class PhysicsAcceleration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter vo,v1 and t:");
        double v0 = in.nextDouble();
        double v1 = in.nextDouble();
        double t = in.nextDouble();
        System.out.println("The average acceleration is " + (v1 - v0) / t);
        in.close();
    }
}
