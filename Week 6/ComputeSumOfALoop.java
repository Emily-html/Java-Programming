public class ComputeSumOfALoop {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i < 10) {
            sum += i++;
        }
        System.out.println("Sum is " + sum);
    }
}
