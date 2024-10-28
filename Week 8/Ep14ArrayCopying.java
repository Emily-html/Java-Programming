public class Ep14ArrayCopying {
    public static void main(String[] args) {
        int[] source = { 1, 2, 3, 4, 5 };
        int[] target = new int[source.length];
        System.arraycopy(source, 0, target, 0, source.length);
        System.out.println("After arraycopy is :");
        for (int value : target) {
            System.out.print(value + " ");
        }
    }
}
