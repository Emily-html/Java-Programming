import java.util.Scanner;

public class RandomPointsOnACircle {
    public static void main(String[] args) {
        double a = Math.random() * 2 * Math.PI;
        double b = Math.random() * 2 * Math.PI;
        double c = Math.random() * 2 * Math.PI;
        System.out.println("Enter the radius of a circle:");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double x1 = r * Math.cos(a);
        double y1 = r * Math.sin(a);
        double x2 = r * Math.cos(b);
        double y2 = r * Math.sin(b);
        double x3 = r * Math.cos(c);
        double y3 = r * Math.sin(c);
        System.out.println("p1:(" + x1 + " , " + y1 + " )");
        System.out.println("p2:(" + x2 + " , " + y2 + " )");
        System.out.println("p3:(" + x3 + " , " + y3 + " )");
        double s1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double s2 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double s3 = Math.sqrt((x2 - x2) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double A = Math.toDegrees(Math.acos((-s2 * s2 + s1 * s1 + s3 * s3) / (2 * s1 * s3)));
        double B = Math.toDegrees(Math.acos((-s3 * s3 + s1 * s1 + s2 * s2) / (2 * s1 * s2)));
        double C = Math.toDegrees(Math.acos((-s1 * s1 + s2 * s2 + s3 * s3) / (2 * s2 * s3)));
        System.out.println("Angle1:" + A + " Angle2:" + B + " Angle3:" + C);
        in.close();

    }
}
