import java.util.Scanner;

public class ProcessAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("The length of string is " + s.length() + " , and its first character is " + s.charAt(0));
        in.close();
    }
}
