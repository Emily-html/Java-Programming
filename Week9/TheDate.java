import java.util.Date;

public class TheDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Time:" + date.toString());
        System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");

    }
}
