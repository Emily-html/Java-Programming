public class Ep3 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        }
        System.out.println(matrix[0][0]);
    }
}
