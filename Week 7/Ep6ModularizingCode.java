
public class Ep6ModularizingCode {
    public static void main(String[] args) {

        primeNumbers(50);

    }

    public static void primeNumbers(int n) {
        int[] prime = new int[n];
        int temp = 0;
        int cnt = 0;
        for (int i = 2; i < 300; i++) {
            for (int j = 1; j < i; j++) {

                if (i % j == 0 && j != 1) {
                    temp = 1;
                    break;
                }

            }

            if (temp == 0)
                prime[cnt++] = i;
            if (cnt == 50)
                break;

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d", prime[i * 10 + j]);
            }
            System.out.println("");
        }
    }

}
