public class FindIndexOfSubstring {
    public static void main(String[] args) {
        String s = "Welcome to Java";
        System.out.println(s.indexOf("W"));
        System.out.println(s.indexOf("o"));
        System.out.println(s.indexOf("o", 5));
        System.out.println(s.indexOf("come"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.lastIndexOf("java"));
        System.out.println(s.indexOf("W"));
        System.out.println(s.lastIndexOf("o"));
        System.out.println(s.lastIndexOf("o", 5));
        System.out.println(s.lastIndexOf("come"));
        System.out.println(s.lastIndexOf("Java"));
        System.out.println(s.lastIndexOf("java"));
    }
}
