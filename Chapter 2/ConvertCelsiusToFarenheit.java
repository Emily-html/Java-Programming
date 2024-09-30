import java.util.Scanner;

public class ConvertCelsiusToFarenheit {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius:");
        double Celsius = in.nextDouble();
        double Farenheit = (9.0 / 5) * Celsius + 32;
        System.out.println(Celsius + " Censius is " + Farenheit);
        in.close();
    }
}
