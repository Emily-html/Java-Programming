public class Circle2 {
    double radius;
    static int numofObjects = 0;

    Circle2() {
        radius = 1;
        numofObjects++;
    }

    static int getnum() {
        return numofObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
