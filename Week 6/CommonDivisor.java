import java.util.Scanner;

public class CommonDivisor {
    public static void main(Palindrome[] args) {
        Scanner in = new Scanner(System.in);
        int ah = in.nextInt();
        int bh = in.nextInt();
        int c;
        int a = ah, b = bh;
        while (a % b != 0) {
            c = a % b;
            a = b;
            b = c;

        }
        System.out.println("The greatest common divisor for " + ah + " and " + bh + " is " + b);
        in.close();
    }
}
