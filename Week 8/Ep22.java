import java.util.Scanner;

public class Ep22 {
    public static void min(double[] a) {
        double min_num = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min_num > a[i])
                min_num = a[i];
        }
        System.out.println("The minimum number is " + min_num);
    }

    public static void main(String[] args) {
        System.out.println("Enter ten numbers:");
        Scanner in = new Scanner(System.in);
        double[] list = new double[10];
        for (int i = 0; i < 10; i++) {
            list[i] = in.nextDouble();
        }
        min(list);
        in.close();

    }
}
