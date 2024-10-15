public class Randomcharacter {
    public static void main(String[] args) {
        int c = (int) (Math.random() * 26 + 65);
        char ch = (char) c;
        System.out.println(ch);
    }
}
