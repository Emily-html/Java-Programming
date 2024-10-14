import java.util.Scanner;

public class FindCharacterOfAnASCIICode {
    public static void main(String[] args) {
        System.out.println("Enter an ASCII code:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("The character for ASCII code is " + (char) n);
        in.close();
    }
}
