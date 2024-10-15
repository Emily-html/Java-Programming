import java.util.Scanner;

public class PhoneKeyPads {
    public static void main(String[] args) {
        System.out.println("Enter a letter:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char ch = s.charAt(0);
        char Ch = Character.toUpperCase(ch);
        if (Ch >= 'A' && Ch <= 'C')
            System.out.println("The corresponding number is 2");
        else if (Ch >= 'D' && Ch <= 'F')
            System.out.println("The corresponding number is 3");
        else if (Ch == 'G' && Ch == 'I')
            System.out.println("The corresponding number is 4");
        else if (Ch >= 'J' && Ch <= 'L')
            System.out.println("The corresponding number is 5");
        else if (Ch >= 'M' && Ch <= 'O')
            System.out.println("The corresponding number is 6");
        else if (Ch >= 'P' && Ch <= 'S')
            System.out.println("The corresponding number is 7");
        else if (Ch >= 'T' && Ch <= 'V')
            System.out.println("The corresponding number is 8");
        else if (Ch >= 'W' && Ch <= 'Z')
            System.out.println("The corresponding number is 9");
        else
            System.out.println(ch + " is an invalid grade");
        in.close();

    }
}
