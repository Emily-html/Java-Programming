public class Testcircle2 {
    public static void main(String[] args) {
        Testcircle2 circle1 = new Testcircle2();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getarea());
        Testcircle2 circle2 = new Testcircle2(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getarea());
        Testcircle2 circle3 = new Testcircle2(75);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getarea());
        circle2.setradius(100);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getarea());

    }

    double radius;

    Testcircle2() {
        radius = 1;
    }

    Testcircle2(double newradius) {
        radius = newradius;
    }

    double getarea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setradius(double newradius) {
        radius = newradius;
    }
}