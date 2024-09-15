import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        long totalmilliseconds = System.currentTimeMillis();
        long totalseconds = totalmilliseconds / 1000;
        long currentseconds = totalseconds % 60;
        long totalminutes = totalseconds / 60;
        long currentminutes = totalminutes % 60;
        long totalhours = totalminutes / 60;
        long currenthours = totalhours % 24;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the time zone offsets to GMT:");
        int zone = in.nextInt();
        System.out.println(currenthours + zone + ":" + currentminutes + ":" + currentseconds);
        in.close();
    }
}
