public class Primenumbers {
    public static void main(String[] args) {
        int cnt = 0;
        int[] p = new int[50];
        int i = 0, j = 0;
        for (i = 2; i < 300; i++) {

            for (j = 1; j < i; j++) {
                if (i % j == 0 && j != 1) {
                    break;
                }
            }
            if (j == i)
                p[cnt++] = i;
            if (cnt == 50)
                break;

        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(p[10 * i + j] + " ");
            }
            System.out.println("");
        }

    }
}
