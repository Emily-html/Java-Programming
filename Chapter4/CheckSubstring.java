import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string s1:");
        String s1 = in.nextLine();
        System.out.println("Enter string s2:");
        String s2 = in.nextLine();
        int l1 = s1.length();
        int l2 = s2.length();
        int temp = 0;
        for (int i = 0; i < l1 - l2; i++) {
            if (s2.equals(s1.substring(i, i + l2))) {
                System.out.println(s2 + " is a substring of " + s1);
                temp = 1;
                break;
            }

        }
        if (temp == 0)
            System.out.println(s2 + " is not a substring of " + s1);
        in.close();
    }
}
