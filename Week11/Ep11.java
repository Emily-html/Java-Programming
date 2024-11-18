import java.util.Scanner;

public class Ep11 {
    public static void main(String[] args) {
        int[][] matrix = new int[8][7];
        int[] sum = new int[8];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = in.nextInt();
                sum[i] += matrix[i][j];
            }
        }
        in.close();
        int t;
        for (int i = 0; i < sum.length; i++) {
            for (int j = i + 1; j < sum.length; j++) {
                if (sum[i] < sum[j]) {
                    t = sum[i];
                    sum[i] = sum[j];
                    sum[j] = t;
                }
            }
        }
        for (int i = 0; i < sum.length; i++)
            System.out.println(sum[i]);
    }
}
