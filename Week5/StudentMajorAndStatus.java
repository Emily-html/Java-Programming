import java.util.Scanner;

public class StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char ch = s.charAt(0);
        char n = s.charAt(1);

        if (ch == 'M') {
            System.out.println("Mathmatics");
            if (n == '1')
                System.out.print("Freshman");
            if (n == '2')
                System.out.print("Sophomore");
            if (n == '3')
                System.out.print("Junior");
            if (n == '4')
                System.out.print("Senior");

        } else if (ch == 'C') {
            System.out.println("Computer Science");
            {
                if (n == '1')
                    System.out.print("Freshman");
                if (n == '2')
                    System.out.print("Sophomore");
                if (n == '3')
                    System.out.print("Junior");
                if (n == '4')
                    System.out.print("Senior");
            }
        }

        else if (ch == 'I') {
            System.out.println("Information technology");
            if (n == '1')
                System.out.print("Freshman");
            if (n == '2')
                System.out.print("Sophomore");
            if (n == '3')
                System.out.print("Junior");
            if (n == '4')
                System.out.print("Senior");
        }

        else
            System.out.println("Invalid input");

        in.close();

    }
}
