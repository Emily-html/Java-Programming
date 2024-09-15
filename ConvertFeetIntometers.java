import java.util.Scanner;

public class ConvertFeetIntometers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value for feet:");
        double feet = in.nextDouble();
        System.out.println(feet + " feet is " + feet * 0.305 + " meters");
        in.close();
    }
}
