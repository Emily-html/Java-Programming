public class NestedLoops {
    public static void main(String[] args) {
        int i = 1, j = 1;
        for (i = 1; i <= 4; i++) {
            System.out.printf("%2d", i);
        }
        System.out.println("");
        for (i = 1; i <= 4; i++) {
            System.out.print(i);
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
