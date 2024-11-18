public class Ep1 {
    public static void main(String[] args) {

        double[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };
        System.out.println(matrix.length + " " + matrix[0].length);
        System.out.println("Length of the sencond row " + matrix[1].length);
        System.out.println("Length of the third row " + matrix[2].length);
        System.out.println("Length of the fourth row  " + matrix[3].length);

        double[][] matrix2 = new double[4][];
        matrix2[0] = new double[4];
        matrix2[1] = new double[3];
        matrix2[2] = new double[2];
        matrix2[3] = new double[1];

        System.out.println(matrix2[0].length);
        System.out.println(matrix2[1].length);
        System.out.println(matrix2[2].length);
        System.out.println(matrix2[3].length);

    }
}
