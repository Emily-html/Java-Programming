import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double birth = 1.0 / 7;
        double death = 1.0 / 13;
        double immigrants = 1.0 / 45;
        System.out.println("Enter the number of years:");
        int population = 312032486;
        int year = in.nextInt();
        System.out.println("The population in " + year + " is "
                + (int) (population + year * 365 * 24 * 3600 * (birth - death + immigrants)));
        in.close();
    }
}
