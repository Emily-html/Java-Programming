public class Ep14 {
    public static void main(String[] args) {
        int[][] m = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 },
                { 7, 8 },
                { 9, 10 }
        };
        int[][] mnew = Shuffle(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(mnew[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] Shuffle(int[][] m) {

        int t1;
        int t2;
        int temp;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                t1 = (int) (Math.random() * m.length);
                t2 = (int) (Math.random() * m[0].length);
                temp = m[i][j];
                m[i][j] = m[t1][t2];
                m[t1][t2] = temp;

            }
        }
        return m;
    }
}
