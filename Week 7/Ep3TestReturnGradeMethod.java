public class Ep3TestReturnGradeMethod {
    public static void main(String[] args) {
        System.out.println("The grade is " + getGrade(78.5));
        System.out.println("The grade is " + getGrade(59.5));

    }

    public static char getGrade(double grade) {
        if (grade >= 90)
            return 'A';
        else if (grade >= 80)
            return 'B';
        else if (grade >= 70)
            return 'C';
        else if (grade >= 60)
            return 'D';
        else
            return 'E';

    }
}