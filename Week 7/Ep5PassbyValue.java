public class Ep5PassbyValue {
    public static void main(String[] args) {
        int num1 = (int) (System.currentTimeMillis() % 99);
        int num2 = (int) (System.currentTimeMillis() % 100);
        System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
        swap(num1, num2);
        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }

    public static void swap(int num1, int num2) {
        System.out.println("\tBefore swapping, num1 is " + num1 + " and num2 is " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\tAfterswapping, num1 is " + num1 + " and num2 is " + num2);
    }
}