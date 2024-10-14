import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        System.out.println("Enter a decimal value(0 to 15):");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 0 && n < 9)
            System.out.println("The hex value is " + n);
        if (n > 9 && n <= 15)
            System.out.println("The hex value is " + (char) (n - 10 + 'A'));
        else
            System.out.println("Invalid Input");
        in.close();
    }
}
