import java.util.Scanner;

public class GeometryAreaOfAPentagon {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the lrngth from the center to a vertex:");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double s = 2 * r * Math.sin(Math.PI / 5);
        System.out.println("The area of the pentagon is: " + 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5)));
        in.close();

    }
}
