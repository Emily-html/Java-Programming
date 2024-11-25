public class TestCircle {
    public static void main(String[] args) {
        CircleWithPrivateDataFields c = new CircleWithPrivateDataFields(5.0);
        System.out.println("The radius and area are " + c.getRadius() + " " + c.getArea());
        c.setRadius(c.getRadius() * 1.1);
        System.out.println("The radius and area are " + c.getRadius() + " " + c.getArea());
        System.out.println("The number of objects created is " + c.getNumberOfObjects());
    }
}
