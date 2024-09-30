import java.util.Scanner;

public class DeterminingLepYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0)
            System.out.println("true");
        else
            System.out.println("false");
        in.close();
    }
}
