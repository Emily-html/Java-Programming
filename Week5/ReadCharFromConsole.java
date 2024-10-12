import java.util.Scanner;

public class ReadCharFromConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character:");
        String s = in.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is: " + ch);
        in.close();
    }
}
