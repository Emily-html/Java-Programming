import java.util.Scanner;

public class ComputeTheVolumeOfACylinder {
    public static void main(String[] args) {
        System.out.println("Enter the radius and length of a cylinder");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double length = in.nextDouble();
        System.out.println("The area is " + 3.14159 * radius * radius);
        System.out.println("The volume is " + length * 3.14159 * radius * radius);
        in.close();

    }
}
