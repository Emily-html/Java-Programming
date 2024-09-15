import java.util.Scanner;

public class ScienceCalculatingEnergy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms:");
        double amount = in.nextDouble();
        System.out.println("Enter the initial temperature:");
        double temperature1 = in.nextDouble();
        System.out.println("Enter the final temperature:");
        double temperature2 = in.nextDouble();
        System.out.println("The energy needed is " + amount * (temperature2 - temperature1) * 4184);
        in.close();
    }
}
