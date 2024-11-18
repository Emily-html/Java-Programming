public class Ep5 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                matrix[row][column] = (int) (Math.random() * 20);
            }
        }
        int total = 0;
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                System.out.print(matrix[row][column] + " ");
                total += matrix[row][column];
            }
            System.out.println(" ");
        }
        System.out.println("The total of the matrix values is " + total);
    }
}
