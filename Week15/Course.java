public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.numberOfStudents = 0;
    }

    public void addStudent(String s) {
        this.students[numberOfStudents] = s;
        this.numberOfStudents++;
    }

    public String[] getStudent() {
        return this.students;
    }

    public int getnumberOfStudnets() {
        return this.numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudents(String s) {
        for (int i = 0; i < this.numberOfStudents; i++) {
            if (this.students[i].equals(s)) {
                for (; i < this.numberOfStudents; i++) {
                    this.students[i - 1] = this.students[i];
                }
                break;
            }
        }
        this.numberOfStudents--;
    }
}
