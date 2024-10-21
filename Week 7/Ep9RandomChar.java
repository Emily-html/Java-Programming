public class Ep9RandomChar {
    public static void main(String[] args) {
        for (int i = 0; i < 175; i++) {
            char ch = RandomLowercaseLetter();
            if ((i + 1) % 25 == 0 && i != 0)
                System.out.println(ch);
            else
                System.out.printf("%-2c", ch);

        }
    }

    public static char RandomLowercaseLetter() {
        return ((char) ((int) 'a' + Math.random() * ('z' - 'a')));
    }
}
