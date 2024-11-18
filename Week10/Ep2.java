import java.util.Scanner;

public class Ep2 {
    public static void main(String[] args) {

        System.out.println("Enter the row number and column number:");

        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        in.close();
    }
}
