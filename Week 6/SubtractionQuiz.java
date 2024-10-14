import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        Scanner in = new Scanner(System.in);
        int count = 5;
        int ans;
        int n;
        long startTime, endTime, testTime;
        int cnt = 0;
        startTime = System.currentTimeMillis();
        while (count > 0) {
            count--;
            if (number1 < number2) {
                n = number1;
                number1 = number2;
                number2 = n;
            }
            System.out.println("What is " + number1 + "-" + number2 + "?");
            ans = in.nextInt();
            if (ans == number1 - number2) {
                System.out.println("You are correct!");
                cnt++;
            } else
                System.out.println(number1 + "-" + number2 + " should be " + (number1 - number2));

        }
        endTime = System.currentTimeMillis();
        testTime = endTime - startTime;
        System.out.println("Correct count is " + cnt);
        System.out.println("Test time is " + testTime + " seconds");
        in.close();

    }
}
