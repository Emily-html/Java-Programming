public class RandomMethods {
    public static void main(String[] args) {
        System.out.println("The value of max(2,3) is:" + Math.max(2, 3));
        System.out.println("The value of min(2.5,4.6) is:" + Math.min(2.5, 4.6));
        System.out.println(
                "The value of max(max(2.4,4.6),min(3,5.6)) is:" + Math.max(Math.max(2.4, 4.6), Math.min(3, 5.6)));
        System.out.println("The value of abs(-2) is:" + Math.abs(-2));
        System.out.println("The value of abs(-2.1) is:" + Math.abs(-2.1));
        System.out.println("The value of random()*10 is:" + (int) (Math.random() * 10));
        System.out.println("The value of random()*50+50 is:" + (int) (50 + Math.random() * 50));
        int a = 50;
        System.out.println("The value of random()*50+a is:" + (int) (a + Math.random() * 50));
    }
}
