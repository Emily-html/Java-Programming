
import java.util.Scanner;

public class ConvertLetterGradeToNumber {
    public static void main(String[] args) {
        System.out.println("Enter a letter grade:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char ch = s.charAt(0);
        if (ch == 'A')
            System.out.println("The numeric value for grade " + ch + " is 4");
        else if (ch == 'B')
            System.out.println("The numeric value for grade " + ch + " is 3");
        else if (ch == 'C')
            System.out.println("The numeric value for grade " + ch + " is 2");
        else if (ch == 'D')
            System.out.println("The numeric value for grade " + ch + " is 1");
        else if (ch == 'F')
            System.out.println("The numeric value for grade " + ch + " is 0");
        else
            System.out.println(ch + " is an invalid grade");
        in.close();
    }
}
