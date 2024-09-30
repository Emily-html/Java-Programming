import java.util.Scanner;

public class ScienceWindcjillTemperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperaturn in farenheit between -58 amd 41:");
        double temperature = in.nextDouble();
        System.out.println("Enter the wind speed(>=2) in miles per hour:");
        double speed = in.nextDouble();
        System.out.println("The wind chill index is " + (35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
                + 0.4275 * temperature * Math.pow(speed, 0.16)));
        in.close();
    }
}
