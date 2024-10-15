public class GenerateVehiclePlateNumbers {
    public static void main(String[] args) {
        char ch1 = (char) (Math.random() * 26 + 65);
        char ch2 = (char) (Math.random() * 26 + 65);
        char ch3 = (char) (Math.random() * 26 + 65);
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        int n3 = (int) (Math.random() * 10);
        int n4 = (int) (Math.random() * 10);

        System.out.printf("%c%c%c", ch1, ch2, ch3);
        System.out.printf("%d%d%d", n1, n2, n3, n4);

    }
}
