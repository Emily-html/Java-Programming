public class Ep5ArrayElementsSum {
    public static void main(String[] args) {
        double[] list = new double[5];
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            list[i] = Math.random() * 10;
            sum += list[i];
            System.out.print(list[i] + " ");
        }
        System.out.println("Sum of all elements is " + sum);
    }
}