import java.util.Scanner;

public class TestdoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        data = in.nextInt();
        do {
            sum += data;
            data = in.nextInt();
        } while (data != 0);
        System.out.println("The sum is " + sum);
        in.close();
    }
}
