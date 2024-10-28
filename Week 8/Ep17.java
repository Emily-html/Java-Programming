public class Ep17 {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swapFirstTwo(int[] s) {
        int temp = s[0];
        s[0] = s[1];
        s[1] = temp;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2 };
        System.out.println("Before swapping:");
        System.out.println("Array is(" + a[0] + "," + a[1] + ")");
        swap(a[0], a[1]);
        System.out.println("After swapping:");
        System.out.println("Array is(" + a[0] + "," + a[1] + ")");
        System.out.println("Before swapping of the fiset two elements:");
        System.out.println("Array is(" + a[0] + "," + a[1] + ")");
        swapFirstTwo(a);
        System.out.println("After swapping of the fiset two elements:");
        System.out.println("Array is(" + a[0] + "," + a[1] + ")");
    }
}
