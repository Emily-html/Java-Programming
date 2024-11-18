import java.util.Scanner;

public class Ep13 {
    public static void main(String[] args) {
        int[][] num = new int[4][4];
        Scanner in = new Scanner(System.in);
        int[] rows = new int[4];
        int[] columns = new int[4];
        for (int row = 0; row < num.length; row++) {
            for (int column = 0; column < num[0].length; column++) {
                num[row][column] = in.nextInt();
                rows[row] += num[row][column];
                columns[column] += num[row][column];
            }
        }
        int t = 0;
        int ti = 0;
        int k = 0;
        int ki = 0;
        for (int i = 0; i < num.length; i++) {
            if (t < rows[i]) {
                t = rows[i];
                ti = i;
            }
            if (k < columns[i]) {
                k = columns[i];
                ki = i;
            }
        }
        System.out.println("The largest row index: " + ti);
        System.out.println("The largest column index: " + ki);
        in.close();
    }
}
