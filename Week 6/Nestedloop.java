public class Nestedloop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 1)
                System.out.printf("%6d", i);
            else
                System.out.printf("%4d", i);
        }
        System.out.println("");
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println("");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + "|");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%4d", j * i);
            }
            System.out.println("");
        }
    }
}
