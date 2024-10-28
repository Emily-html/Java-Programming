import java.util.Scanner;

public class Ep3ArraysWithRandomValues {
    public static void main(String[] args) {
        double[] values = new double[5];
        Scanner in = new Scanner(System.in);
        int List = 5;
        for (int i = 0; i < List; i++) {
            values[i] = Math.random() * 10;
            System.out.println(values[i]);
        }
        in.close();
    }
}
