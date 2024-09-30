import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
        in.close();
    }

}