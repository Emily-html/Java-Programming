import java.util.Scanner;

public class GeometeryAreaOfATriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coordinates of three points seperated by spaces like x1 y1 x2 y2 x3 y3:");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double side1 = Math.pow(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)), 0.5);
        double side2 = Math.pow(((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3)), 0.5);
        double side3 = Math.pow(((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1)), 0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        System.out.println("The area of the triangle is " + area);
        in.close();

    }
}
