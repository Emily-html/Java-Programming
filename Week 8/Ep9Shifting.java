public class Ep9Shifting {
    public static void main(String[] args) {
        int[] values = new int[5];
        System.out.println("Array before shifting:");
        for (int i = 0; i < 5; i++) {
            values[i] = (int) (Math.random() * 10);
            System.out.print(values[i] + " ");
        }
        int temp = values[0];
        for (int i = 1; i < 5; i++) {

            values[i - 1] = values[i];

        }
        System.out.println("");
        values[4] = temp;
        for (int i = 0; i < 5; i++) {
            System.out.print(values[i] + " ");
        }
    }
}
