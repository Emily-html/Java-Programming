import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) throws Exception {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        Scanner in = new Scanner(System.in);
        System.out.println("What is " + number1 + "+" + number2);
        int r = in.nextInt();
        while (r != number1 + number2) {
            System.out.println("Wrong answer.Try again." + "What is " + number1 + "+" + number2);
            r = in.nextInt();
        }
        System.out.println("You got it!");
        in.close();

    }
}
