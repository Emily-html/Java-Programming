public class Ep15 {
    public static void printArray(int[] array) {
        for (int value : array)
            System.out.print(value + " ");

    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5 };
        printArray(array);
        System.out.println();
        printArray(new int[] { 3, 1, 2, 5, 3, 6 });

    }
}
