import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        System.out.println("Enter a letter:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char Ch = s.charAt(0);
        char ch = Character.toLowerCase(s.charAt(0));
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'i' || ch == 'u')
            System.out.println(Ch + " is a vowel.");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(Ch + " is a consonant.");
        else
            System.out.println(Ch + " is an Invalid Input.");
        in.close();

    }
}
