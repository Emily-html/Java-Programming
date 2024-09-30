import java.util.Random;
import java.util.Scanner;

public class ASimpleMathLearningTool {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = (int) (r.nextDouble() * 10);
        int num2 = (int) (r.nextDouble() * 10);
        System.out.println("What is " + num1 + " + " + num2);
        Scanner in = new Scanner(System.in);
        int result = in.nextInt();
        if (result == num1 + num2)
            System.out.println("true");
        else
            System.out.println("false");
        in.close();
    }
}
