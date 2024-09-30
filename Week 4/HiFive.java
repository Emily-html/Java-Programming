import java.util.Scanner;

public class HiFive {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 2 == 0)
            System.out.println("HiEven");
        if (num % 5 == 0)
            System.out.println("HiFive");
        in.close();
    }
}
