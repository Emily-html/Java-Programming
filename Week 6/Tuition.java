public class Tuition {
    public static void main(Palindrome[] args) {
        double s = 1;
        int cnt = 0;
        while (s < 2) {
            s = Math.pow(1.07, cnt);
            cnt++;
        }
        System.out.println("Tuition will be doubled in " + (cnt - 1) + " years");
        System.out.println("Tuition will be $" + 2000 * Math.pow(1.07, cnt) + "in " + (cnt - 1) + " years");

    }
}
