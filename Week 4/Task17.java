import java.util.Random;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        System.out.println("Enter your lottery pick(two digits):");
        Scanner in = new Scanner(System.in);
        int pick = in.nextInt();
        Random r = new Random();
        int lottery = (int) (r.nextInt() % 100);
        if (pick == lottery) {
            System.out.println("The lottery number is " + lottery);
            System.out.println("Exact Match:you win $10000");
        }
        if (pick / 10 == lottery % 10 && pick % 10 == lottery / 10) {
            System.out.println("The lottery number is " + lottery);
            System.out.println("match all digits:you win $3000");
        }
        if (pick / 10 == lottery % 10 ^ pick % 10 == lottery / 10) {
            System.out.println("The lottery number is " + lottery);
            System.out.println("match one digits:you win $1000");
        } else {
            System.out.println("The lottery number is " + lottery);
            System.out.println("sorry:no match");
        }
        in.close();

    }
}
