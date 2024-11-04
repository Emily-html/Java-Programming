public class TestCircle2withStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects,the number of Circle2 objects is " + Circle2.getnum());
        Circle2 c1 = new Circle2();
        System.out.println("After creating 1 objects,the number of Circle2 objects is " + c1.numofObjects);
        Circle2 c2 = new Circle2();
        System.out.println("After creating 2 objects,the number of Circle2 objects is " + c2.numofObjects);

    }
}
