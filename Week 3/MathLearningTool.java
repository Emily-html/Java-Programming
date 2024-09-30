import java.util.Scanner;

public class MathLearningTool {
    public static void main(String[] args) throws Exception {
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10E5 % 10);
        System.out.println("Calculate the value:" + number1 + " + " + number2 + "=");
        Scanner in = new Scanner(System.in);
        int ans = in.nextInt();
        if (ans == number1 + number2)
            System.out.println("Great!");
        else
            System.out.println("Come on!");
        in.close();

    }
}
