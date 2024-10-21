public class Ep4PassbyValue {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        Increment(x);
        System.out.println("After the call, x is " + x);

    }

    public static void Increment(int n) {
        n++;
        System.out.println("n isnside the method is " + n);
    }
}
