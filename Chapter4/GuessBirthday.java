import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        String s1 = "1 3 5 7\n" +
                "9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31\n";
        String s2 = "2 3 6 7\n" +
                "10 11 14 15\n" +
                "18 19 28 23\n" +
                "28 29 30 31\n";
        String s3 = "4 5 6 7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 28 30 31\n";
        String s4 = "8 9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31\n";
        String s5 = "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31\n";
        System.out.println("If your birthday is in s1,enter Y");
        System.out.println(s1);
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        char ch = a.charAt(0);
        int day = 0;
        if (ch == 'Y')
            day += 1;
        System.out.println("If your birthday is in s2,enter Y");
        System.out.println(s2);
        a = in.nextLine();
        ch = a.charAt(0);
        if (ch == 'Y')
            day += 2;
        System.out.println("If your birthday is in s3,enter Y");
        System.out.println(s3);
        a = in.nextLine();
        ch = a.charAt(0);
        if (ch == 'Y')
            day += 4;
        System.out.println("If your birthday is in s4,enter Y");
        System.out.println(s4);
        a = in.nextLine();
        ch = a.charAt(0);
        if (ch == 'Y')
            day += 8;
        System.out.println("If your birthday is in s5,enter Y");
        System.out.println(s5);
        a = in.nextLine();
        ch = a.charAt(0);
        if (ch == 'Y')
            day += 16;
        System.out.println("Your birthday is " + day);
        in.close();

    }
}
