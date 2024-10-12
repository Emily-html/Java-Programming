import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char ch = s.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is a vowel.");
        else if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
            System.out.println(ch + " is a constant.");
        else
            System.out.println(ch + " is an incalid input.");
        in.close();
    }
}
