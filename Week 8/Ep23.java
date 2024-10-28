import java.util.Scanner;

public class Ep23 {
    public static int[] reverse(int[] a) {
        int i, j;
        int[] result = new int[a.length];
        for (i = 0, j = a.length - 1; i < a.length; i++, j--) {
            result[j] = a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = new int[10];
        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            list[i] = in.nextInt();
        }
        int[] list2 = reverse(list);
        for (int value : list2)
            System.out.print(value + " ");
        in.close();
    }
}
