public class Ep20 {
    public static int linearsearch(int[] a, int number) {
        for (int i = 0; i < a.length; i++) {
            if (number == a[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = { 1, 4, 8, 5, 9, 7 };
        int i = linearsearch(list, 8);
        System.out.println("The key is found at index: " + i);

    }
}
