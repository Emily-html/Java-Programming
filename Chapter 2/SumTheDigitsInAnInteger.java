import java.util.Scanner;

public class SumTheDigitsInAnInteger {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 1000");
        int integer = in.nextInt();
        int i, j, k;
        if (integer < 10) {
            k = integer % 10;
            System.out.println("The sum of digits is " + k);
        } else if (integer >= 10 && integer < 100) {
            k = integer % 10;
            integer /= 10;
            j = integer % 10;
            System.out.println("The sum of digits is " + (k + j));
        } else {
            k = integer % 10;
            integer /= 10;
            j = integer % 10;
            integer /= 10;
            i = integer % 10;
            System.out.println("The sum of digits is " + (k + j + i));

        }
        in.close();
    }
}
