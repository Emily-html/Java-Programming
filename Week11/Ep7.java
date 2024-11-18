public class Ep7 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int i;
        int j;
        int temp;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                i = (int) (Math.random() * matrix.length);
                j = (int) (Math.random() * matrix[0].length);
                temp = matrix[row][column];
                matrix[row][column] = matrix[i][j];
                matrix[i][j] = temp;

            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println(" ");
        }
    }
}
