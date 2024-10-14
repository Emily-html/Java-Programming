import java.util.Scanner;

public class GeometryGreatCircleDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter point 1(latitude and longtitude) in degrees: ");
        System.out.println("Enter point 2(latitude and longtitude) in degrees: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double a1 = Math.toRadians(x1);
        double b1 = Math.toRadians(y1);
        double a2 = Math.toRadians(x2);
        double b2 = Math.toRadians(y2);
        double d = 6371.01 * Math.acos(Math.sin(a1) * Math.sin(a2) + Math.cos(a1) * Math.cos(a2) * Math.cos(b1 - b2));
        System.out.println("The distance between the two points is " + d + " km");
        in.close();

    }
}
