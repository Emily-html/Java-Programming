public class Ep21 {
    public static int binarysearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < a[mid])
                high = mid - 1;
            else if (key == a[mid])
                return mid;
            else
                low = mid + 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 4, 6, 21, 51, 65, 76, 90, 100 };
        int j = binarysearch(list, 2);
        int k = binarysearch(list, 51);
        System.out.println("2 is located at " + j);
        System.out.println("51 is located at " + k);
    }
}
