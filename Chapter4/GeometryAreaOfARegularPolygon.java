import java.util.Scanner;

public class GeometryAreaOfARegularPolygon {
    public static void main(String[] args) {
        System.out.println("Enter the number of sides:");
        System.out.println("Enter the side:");
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double s = in.nextDouble();
        System.out.println("The area of the polygon is " + n * s * s / (4 * Math.tan(Math.PI / n)));
        in.close();
    }
}
