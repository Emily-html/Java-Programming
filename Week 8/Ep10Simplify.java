import java.util.Scanner;

public class Ep10Simplify {
    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December" };
        System.out.println("Enter a month number(1 to 12):");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        System.out.println(months[month - 1]);
        in.close();
    }
}
