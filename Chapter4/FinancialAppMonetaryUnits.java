import java.util.Scanner;

public class FinancialAppMonetaryUnits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int p = s.indexOf('.');
        int l = s.length();
        int[] n = new int[p];
        int[] m = new int[l - p - 1];
        for (int i = 0; i < p; i++) {
            n[i] = (int) s.charAt(i) - 48;

        }
        for (int i = p + 1; i < l; i++) {
            m[i - p - 1] = s.charAt(i) - 48;
        }
        System.out.print("Dollar:");
        for (int i = 0; i < p; i++)
            System.out.print(n[i]);
        System.out.println("");

        System.out.print("Cents:");
        if (m[0] == 0) {
            System.out.print("0.");
            for (int i = 1; i < l - p - 1; i++)
                System.out.print(m[i]);
        } else {
            for (int i = 0; i < l - p - 1; i++)
                System.out.print(m[i]);
            in.close();
        }
    }

}
