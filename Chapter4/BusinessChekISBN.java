import java.util.Scanner;

public class BusinessChekISBN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char c;
        int[] n = new int[9];
        for (int i = 0; i < 9; i++) {
            c = s.charAt(i);
            n[i] = (int) c - 48;
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += n[i] * (i + 1);
        }
        int p = sum % 11;
        if (p == 10) {
            char ph = 'X';
            System.out.println(s + ph);
        } else
            System.out.println(s + p);
        in.close();
    }
}
