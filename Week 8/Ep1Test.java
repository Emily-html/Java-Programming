public class Ep1Test {
    public static void main(String[] args) throws Exception {
        int[] values = new int[5];
        for (int i = 1; i < 5; i++) {
            values[i] = i + values[i - 1];

        }
        values[0] = values[1] + values[4];
        for (int i = 0; i < 5; i++) {
            System.out.println(values[i]);
        }
    }
}
