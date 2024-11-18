import java.util.Scanner;

public class Ep8 {
    public static void main(String[] args) {
        int[][] array = getArray();
        System.out.println("The sum of matrix is " + sum(array));
    }

    public static int[][] getArray() {
        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows " + " and " + m[0].length + " columns:");
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = in.nextInt();
            }

        }
        in.close();
        return m;
    }

    public static int sum(int[][] m) {
        int total = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                total += m[row][column];
            }
        }

        return total;

    }
}
