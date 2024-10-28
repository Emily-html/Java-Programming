public class Ep8Shuffing {
    public static void main(String[] args) {

        int[] values = new int[10];
        System.out.println("Array before shuffling:");
        for (int i = 0; i < 10; i++) {
            values[i] = (int) (Math.random() * 10);
            System.out.print(values[i] + " ");
        }
        for (int i = 0; i < 10; i++) {

            int j = (int) Math.random() * 10;
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;

        }
        System.out.printf("\n");
        System.out.println("Array after shuffling:");
        for (int i = 0; i < 10; i++) {
            System.out.print(values[i] + " ");
        }
    }
}