import java.util.Scanner;

public class GeometryAreaOfAHexagon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the side:");
        double side = in.nextDouble();
        double area = 3 * Math.sqrt(3) / 2 * side * side;
        System.out.println("The area of the hexagon is " + area);

        in.close();

    }
}
