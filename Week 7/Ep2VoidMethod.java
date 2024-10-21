public class Ep2VoidMethod {
    public static void main(String[] args) {
        System.out.println("The grade is ");
        printGrade(78.5);
        System.out.println("The grade is ");
        printGrade(59.5);
    }

    public static void printGrade(double grade) {
        if (grade >= 90)
            System.out.println("A");
        else if (grade >= 80)
            System.out.println("B");
        else if (grade >= 70)
            System.out.println("C");
        else if (grade >= 60)
            System.out.println("D");
        else
            System.out.println("F");

    }
}
