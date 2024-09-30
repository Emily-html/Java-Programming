import java.util.Scanner;

public class FindTheNumberOfYears {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = in.nextInt();
        double year = minutes / (60.0 * 24 * 365);
        int years = (int) year;
        double day = year - years;
        day *= 365;
        System.out.println(minutes + " minutes is approximately " + years + " and " + (int) day + " days");
        in.close();
    }
}
