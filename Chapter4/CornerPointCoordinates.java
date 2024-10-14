import java.util.Scanner;

public class CornerPointCoordinates {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the bounding circle: ");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double A = Math.PI / 2;
        double B = Math.PI / 2 - Math.PI * 2 / 5;
        double C = Math.PI / 2 - 2 * Math.PI * 2 / 5;
        double D = Math.PI / 2 + Math.PI / 5 * 4;
        double E = Math.PI / 2 + Math.PI * 2 / 5;
        System.out.println("The cordinates of five points on the pentagon are");
        System.out.print("(");
        System.out.printf("%.2f", r * Math.cos(B));
        System.out.print(",");
        System.out.printf("%.2f", r * Math.sin(B));
        System.out.println(")");
        System.out.print("(");
        System.out.printf("%.2f", r * Math.cos(A));
        System.out.print(",");
        System.out.printf("%.2f", r * Math.sin(A));
        System.out.println(")");
        System.out.print("(");
        System.out.printf("%.2f", r * Math.cos(E));
        System.out.print(",");
        System.out.printf("%.2f", r * Math.sin(E));
        System.out.println(")");
        System.out.print("(");
        System.out.printf("%.2f", r * Math.cos(D));
        System.out.print(",");
        System.out.printf("%.2f", r * Math.sin(D));
        System.out.println(")");
        System.out.print("(");
        System.out.printf("%.2f", r * Math.cos(C));
        System.out.print(",");
        System.out.printf("%.2f", r * Math.sin(C));
        System.out.println(")");
        in.close();
    }
}
