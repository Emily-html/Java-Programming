import java.util.Scanner;

public class OrderThreeCities {
    public static void main(String[] args) {
        System.out.println("Enter the first city:");
        System.out.println("Enter the second city:");
        System.out.println("Enter the third city:");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String s3 = in.nextLine();
        if (s1.compareTo(s2) < 0) {
            if (s1.compareTo(s3) < 0) {
                if (s3.compareTo(s2) > 0)
                    System.out.println(s1 + " " + s2 + " " + s3);
                else
                    System.out.println(s1 + " " + s3 + " " + s2);

            } else {
                System.out.println(s3 + " " + s1 + " " + s2);
            }

        } else

        {
            if (s2.compareTo(s3) < 0) {
                if (s1.compareTo(s3) < 0) {
                    System.out.println(s2 + " " + s1 + " " + s3);
                } else {
                    System.out.println(s2 + " " + s3 + " " + s1);
                }

            } else {
                System.out.println(s3 + " " + s2 + " " + s1);
            }
        }
        in.close();
    }
}