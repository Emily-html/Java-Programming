public class Ep4Display {
    public static void main(String[] args) {
        double[] list = new double[5];
        for (int i = 0; i < 5; i++) {
            list[i] = Math.random() * 10;
            System.out.print(list[i] + " ");
        }
    }
}
