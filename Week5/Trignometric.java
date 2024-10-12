import java.util.Scanner;

public class Trignometric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double a = Math.abs(Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2)));
        double b = Math.abs(Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1)));
        double c = Math.abs(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
        double A = Math.abs((Math.acos(a * a - b * b - c * c)) / (-2 * b * c));
        double B = Math.abs((Math.acos(a * a - b * b - c * c)) / (-2 * a * c));
        double C = Math.abs((Math.acos(a * a - b * b - c * c)) / (-2 * b * a));
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        in.close();

    }
}
