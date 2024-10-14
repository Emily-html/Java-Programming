
import java.util.Scanner;

public class FindTheUnicodeOfACharacter {
    public static void main(String args[]) {
        System.out.println("Enter a charater:");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch = s.charAt(0);
        int n = (int) ch;
        System.out.println("The Unicode for the charater "+  ch+"   is "+n ) ;
        in.close();
    }
}
