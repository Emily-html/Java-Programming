public class Ep13UsingLoop {
    public static void main(String[] args) {
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];

        }
        System.out.println("Target array is : ");
        for (int value : targetArray) {
            System.out.print(value + " ");
        }
    }
}
