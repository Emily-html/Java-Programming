public class AverageSpeedInKilometers {
    public static void main(String[] args) {
        double kilometers = 24 * 1.6;
        double hours = 1 + (40 + 35 / 60.0) / 60.0;
        System.out.println("The speed of the runner is " + kilometers / hours + " kilo/hour");
    }
}
