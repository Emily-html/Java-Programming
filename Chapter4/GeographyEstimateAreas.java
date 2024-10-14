import java.util.Scanner;

public class GeographyEstimateAreas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double x4 = in.nextDouble();
        double y4 = in.nextDouble();
        double s1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double s2 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double s3 = Math.sqrt((x2 - x4) * (x2 - x4) + (y2 - y4) * (y4 - y4));
        double s4 = Math.sqrt((x3 - x4) * (x3 - x4) + (y3 - y4) * (y3 - y4));
        double s5 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double a = Math.acos((s1 * s1 + s2 * s2 - s5 * s5) / (-2 * s1 * s2));
        double b = Math.acos((s3 * s3 + s4 * s4 - s5 * s5) / (-2 * s3 * s4));
        System.out.println(0.5 * s1 * s2 * Math.sin(a) + 0.5 * s3 * s4 * Math.sin(b));
        in.close();
    }
}
