public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", 20);
        System.out.println("Name:" + s.getName());
        System.out.println("Age:" + s.getAge());
        s.setName("Bob");
        s.setAge(25);
        s.setAge(-5);
        System.out.println("Name:" + s.getName());
        System.out.println("Age:" + s.getAge());

    }
}
