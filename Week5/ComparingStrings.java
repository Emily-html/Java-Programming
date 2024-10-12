import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        System.out.println("Enter two cities' name:");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if (s1.compareTo(s2) < 0)
            System.out.println(s1 + " " + s2);
        else
            System.out.println(s2 + " " + s1);
        in.close();
    }
}
