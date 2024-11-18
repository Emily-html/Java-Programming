public class Ep6 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int[] sum = new int[4];
        for (int row = 0; row < 4; row++) {

            for (int column = 0; column < 4; column++) {
                matrix[row][column] = (int) (Math.random() * 20);
                System.out.print(matrix[row][column] + " ");

                sum[row] += matrix[row][column];

            }
            System.out.println(" ");
        }
        int t = 0;
        int r = 0;
        for (int row = 0; row < 4; row++) {

            if (sum[row] > t) {
                t = sum[row];
                r = row;
            }
        }
        System.out.println("Row " + r + " has the largest sum of the matrix is " + t);
    }
}
