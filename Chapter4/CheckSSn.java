import java.util.Scanner;

public class CheckSSn {
    public static void main(String[] args) {
        System.out.println("Enter a SSN：");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int temp = 1;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) > 57 || s.charAt(i) < 48) {
                temp = 0;
                break;
            }

        }
        if (s.charAt(3) != '-')
            temp = 0;
        for (int i = 4; i < 6; i++) {
            if (s.charAt(i) > 57 || s.charAt(i) < 48) {
                temp = 0;
                break;
            }

        }
        if (s.charAt(3) != '-')
            temp = 0;

        for (int i = 4; i < 6; i++) {
            if (s.charAt(i) > 57 || s.charAt(i) < 48) {
                temp = 0;
                break;
            }

        }
        if (temp == 0)
            System.out.println(s + " is an anvalid social security number");
        else
            System.out.println(s + " is a valid social security number");
        in.close();

    }
}
