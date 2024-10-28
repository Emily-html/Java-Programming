public class Ep19 {
    public static void printmax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument is passed");
            return;
        }
        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }
        System.out.println("The max value is " + max);
    }

    public static void main(String[] args) {
        printmax(1, 2, 5, 7);
        printmax(new double[] { 1, 2, 5, 7 });
    }
}
