import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println("                  i hexchar decimal decimalValue");
        System.out.println("--------------------------------------------------");
        System.out.println("Before the loop                      0");
        Table(s);
        in.close();
    }

    public static void Table(String s) {
        int l = s.length();
        char[] n = new char[l];
        for (int i = 0; i < l; i++) {
            n[i] = s.charAt(i);
            switch (i) {
                case 0:
                    System.out.print("After the 1st iteration  ");
                    System.out.printf("%2d%2c%3d%3d", i, n[i], hex((int) n[i]), hex((int) n[i]));

                    System.out.println("");
                    break;
                case 1:
                    System.out.print("After the 2nd iteration  ");
                    System.out.printf("%2d%2c%3d", i, n[i], hex((int) n[i]));

                    System.out.println(" " + hex((int) n[0]) + "*16+" + hex(n[i]));
                    break;
                case 2:
                    System.out.print("After the 3rd iteration  ");
                    System.out.printf("%2d%2c%3d", i, n[i], hex((int) n[i]));

                    System.out.println(" " + "(" + hex((int) n[0]) + "*16+" + hex((n[1])) + ")" + "*16+" + hex(n[2]));
                    break;
                case 3:
                    System.out.print("After the 4th iteration  ");
                    System.out.printf("%2d%2c%3d", i, n[i], hex((int) n[i]));

                    System.out.println(
                            " ((" + hex((int) n[0]) + "*16+" + hex(n[1]) + ")" + "*16+" + hex(n[2]) + ")*16+"
                                    + hex(n[3]));
                    break;

            }
        }
    }

    public static int hex(int c) {
        if (c >= 48 && c <= 57)
            return (c - 48);
        else
            return (c - 65 + 10);
    }
}
