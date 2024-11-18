import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
        Scanner in = new Scanner(System.in);
        for (int k = 0; k < NUMBER_OF_DAYS; k++) {
            int day = in.nextInt();
            int hour = in.nextInt();
            double t = in.nextDouble();
            double h = in.nextDouble();
            data[day - 1][hour - 1][0] = t;
            data[day - 1][hour - 1][1] = h;

        }
        in.close();
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailyt = 0, dailyh = 0;
            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyt += data[i][j][0];
                dailyh += data[i][j][1];
            }
            System.out.println("Day " + (i + 1) + " 's average temperature is " + dailyt / NUMBER_OF_DAYS);
            System.out.println("Day " + (i + 1) + " 's average humidity is " + dailyh / NUMBER_OF_HOURS);

        }

    }
}
