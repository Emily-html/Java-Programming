import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();
        int minutes = seconds / 60;
        int remainingseconds = seconds % 60;
        System.out.println(minutes + " minutes " + remainingseconds + " seconds ");
        in.close();
    }
}
