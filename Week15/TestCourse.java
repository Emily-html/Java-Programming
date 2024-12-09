public class TestCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Database Systems");
        c1.addStudent("Peter Jones");
        c1.addStudent("Brian Smith");
        c1.addStudent("Anne Kennedy");

        c2.addStudent("Peter Jones");
        c2.addStudent("Steve Smith");
        System.out.println("Number of students in c1: " + c1.getnumberOfStudnets());
        String[] s1 = c1.getStudent();
        for (int i = 0; i < c1.getnumberOfStudnets(); i++)
            System.out.print(s1[i] + ", ");
        System.out.println(" ");
        System.out.println("Number of students in c2: " + c2.getnumberOfStudnets());
        String[] s2 = c2.getStudent();
        for (int i = 0; i < c2.getnumberOfStudnets(); i++)
            System.out.print(s2[i] + ", ");

    }
}
