import java.util.Scanner;

public class Ep2ArraysWithInputValues {
    public static void main(String[] args) {
        double[] values = new double[5];
        Scanner in = new Scanner(System.in);
        int List = 5;
        System.out.println("Enter " + List + " values");
        for (int i = 0; i < List; i++) {
            values[i] = in.nextDouble();
            System.out.println(values[i]);
        }
        in.close();
    }
}
