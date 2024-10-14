import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int l = s.length();
        int temp = 1;

        for (int i = 0; i < l / 2; i++) {

            if (s.charAt(i) != s.charAt(l - i)) {
                temp = 0;
                break;
            }

        }
        if (temp == 0)
            System.out.println(s + " is not a palindrome");
        else
            System.out.println(s + " is a palindrome.");
        in.close();
    }
}
