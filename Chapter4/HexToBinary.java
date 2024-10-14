import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char ch = s.charAt(0);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++)
            a[i] = -1;
        int cn;
        int i = 4;
        if (ch >= '0' && ch <= '9') {
            cn = (int) (ch - '0');
            while (cn != 0) {
                a[--i] = cn % 2;
                cn /= 2;
            }
            for (int k = i; k < 4; k++)
                System.out.print(a[k]);
        } else if (ch >= 'A' && ch <= 'F') {
            cn = ch - 'A' + 10;
            while (cn != 0) {
                a[--i] = cn % 2;
                cn /= 2;
            }

            for (int k = i; k < 4; k++)
                System.out.print(a[k]);

        } else
            System.out.println("Invalid Input");

        in.close();

    }
}
