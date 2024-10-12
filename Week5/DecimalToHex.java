import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        System.out.println("Enter a decimal value (o-15)");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 0 && n <= 9) {
            System.out.println(n);

        } else
            System.out.println(n - 9 + 'A');
        in.close();
    }
}
