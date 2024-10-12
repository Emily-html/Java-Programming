import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s = in.nextInt();
        System.out.println(5 * s * s / (4 * Math.tan(Math.PI / 5)));
        in.close();
    }
}
