import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer(the input ends if it is 0):");
        int n = in.nextInt();
        while (n != 0) {
            sum += n;
            System.out.println("Enter an integer(the input ends if it is 0):");
            n = in.nextInt();
        }
        System.out.println("The sum is " + sum);
        in.close();
    }

}