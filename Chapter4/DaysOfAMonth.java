import java.util.Scanner;

public class DaysOfAMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year:");
        String r = in.nextLine();
        System.out.println("Enter a month:");
        String t = in.nextLine();
        int l = r.length();
        System.out.println(l);
        char ch;
        int[] num = new int[l];
        for (int i = 0; i < l; i++) {
            ch = r.charAt(i);
            num[i] = (int) ch - 48;

        }
        int s = 0;
        for (int i = 0; i < l; i++) {
            s += num[i] * Math.pow(10, l - 1 - i);
        }
        if (t.equals("Jan"))
            System.out.println(t + " " + s + " has 31 days");
        else if (t.equals("Feb")) {
            if (s % 4 == 0 && s % 100 != 0)
                System.out.println(t + " " + s + " has 29 days");
            else {
                System.out.println(t + " " + s + " has 28 days");
            }
        } else if (t.equals("Mar"))
            System.out.println(t + " " + s + " has 31 days");
        else if (t.equals("Apr"))
            System.out.println(t + " " + s + " has 30 days");
        else if (t.equals("May"))
            System.out.println(t + " " + s + " has 31 days");
        else if (t.equals("Jun"))
            System.out.println(t + " " + s + " has 30 days");
        else if (t.equals("Jul"))
            System.out.println(t + " " + s + " has 31 days");
        else if (t.equals("Aug"))
            System.out.println(t + " " + s + " has 31 days");
        else if (t.equals("Sep"))
            System.out.println(t + " " + s + " has 30 days");
        else if (t.equals("Oct"))
            System.out.println(t + " " + s + " has 31 days");
        else if (t.equals("Nov"))
            System.out.println(t + " " + s + " has 30 days");
        else if (t.equals("Dec"))
            System.out.println(t + " " + s + " has 31 days");
        else {
            System.out.println(t + " is not a correct month name");
        }
        in.close();
    }
}
