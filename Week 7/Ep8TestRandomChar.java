public class Ep8TestRandomChar {
    public static void main(String[] args) {
        System.out.println("Randomly generate two characters:");
        getRandomLowercaseLetter();
        getRandomUppercaseLetter();
    }

    public static void getRandomLowercaseLetter() {
        System.out.println((char) ((int) 'a' + (int) (Math.random() * ('z' - 'a'))));
    }

    public static void getRandomUppercaseLetter() {
        System.out.println((char) ((int) 'A' + (int) (Math.random() * ('Z' - 'A'))));
    }
}
