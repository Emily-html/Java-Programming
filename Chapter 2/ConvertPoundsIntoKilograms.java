import java.util.Scanner;

public class ConvertPoundsIntoKilograms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(("Enter a number in pounds:"));
        double pounds = in.nextDouble();
        double kilograms = 0.454 * pounds;
        System.out.println(pounds + " pound is " + kilograms + " kilograms ");
        in.close();
    }
}
