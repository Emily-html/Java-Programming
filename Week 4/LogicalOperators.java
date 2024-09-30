import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (age < 18) {
            System.out.println((age > 18));
        } else
            System.out.println(age > 18);
        in.close();
    }
}
