import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        System.out.println("Enter the length of the side:");
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        System.out.println("The area of the hexagon is " + length * length * Math.pow(3, 0.5) * 3 / 2);
        in.close();
    }
}
