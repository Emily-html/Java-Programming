
import java.util.Scanner;

public class Ep12NumberOverAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int number = in.nextInt();
        double[] items = new double[number];
        double sum = 0;
        System.out.println("Enter the numbers:");
        for (int i = 0; i < number; i++) {
            items[i] = in.nextDouble();
            sum += items[i];
        }
        double avg = sum / number;
        int cnt = 0;
        for (int i = 0; i < number; i++) {
            if (items[i] > avg)
                cnt++;
        }
        System.out.println("Average is " + avg);
        System.out.println("Number of elements above the average is " + cnt);
        in.close();
    }
}
