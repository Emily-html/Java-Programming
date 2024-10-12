import java.util.Scanner;

public class StringFromConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three words seperated by spaces.");
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String s3 = in.nextLine();
        System.out.println("s1 is: " + s1);
        System.out.println("s2 is: " + s2);
        System.out.println("s3 is: " + s3);
        in.close();
    }
}
