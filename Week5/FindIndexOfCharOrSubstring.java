import java.util.Scanner;

public class FindIndexOfCharOrSubstring {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String FirstName = s.substring(0, s.indexOf(" ") - 1);
        String LastName = s.substring(s.indexOf(" ") + 1, s.length());
        System.out.println("Firstname is: " + FirstName);
        System.out.println("Lastname is: " + LastName);
        in.close();

    }

}