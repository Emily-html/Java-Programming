public class Ep18 {
    public static int[] reverse(int[] a) {
        int[] result = new int[a.length];
        int i, j;
        for (i = 0, j = a.length - 1; i < a.length; i++, j--)
            result[j] = a[i];
        return result;
    }

    public static void main(String[] args) {
        int[] list1 = { 1, 2, 3, 4, 5 };
        int[] list2 = reverse(list1);
        System.out.print("List1:");
        for (int value1 : list1) {
            System.out.print(value1 + " ");
        }
        System.out.print("\nList2:");
        for (int value2 : list2) {
            System.out.print(value2 + " ");
        }
    }
}
