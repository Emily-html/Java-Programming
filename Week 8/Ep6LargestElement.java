public class Ep6LargestElement {
    public static void main(String[] args) {
        float[] list = new float[5];
        for (int i = 0; i < 5; i++) {
            list[i] = (float) Math.random() * 10;
            System.out.println(list[i]);
        }
        float max = list[0];
        for (int i = 1; i < 5; i++) {
            if (max < list[i])
                max = list[i];
        }
        System.out.println("The largest element is " + max);
    }
}
