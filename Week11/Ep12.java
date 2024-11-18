import java.util.Scanner;

public class Ep12 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][4];
        System.out.println("enter a 3-by-4 matrix ro by row:");
        Scanner in = new Scanner(System.in);
        double total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = in.nextDouble();
                total += matrix[row][column];
            }

        }
        in.close();
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + total);
        }
    }
}
