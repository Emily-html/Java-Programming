public class Ep7TestMrthodOverloadding {
    public static void main(String[] args) {
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));
        System.out.println("The maximum of 3 and 4.0 is " + max(3, 4.0));
        System.out.println("The maximum of 3 ,4 and 5 is " + max(3, 4, 5));

    }

    public static int max(int num1, int num2) {
        if (num1 < num2)
            return num2;
        else
            return num1;
    }

    public static double max(double num1, double num2) {
        if (num1 < num2)
            return num2;
        else
            return num1;
    }

    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
