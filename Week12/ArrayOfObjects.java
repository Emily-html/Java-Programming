public class ArrayOfObjects {
    public static void main(String[] args) {
        CircleWithPrivateDataFields[] circle;
        circle = createCircleArray();
        print(circle);
    }

    public static CircleWithPrivateDataFields[] createCircleArray() {
        CircleWithPrivateDataFields[] circle = new CircleWithPrivateDataFields[5];
        for (int i = 0; i < circle.length; i++) {

            circle[i] = new CircleWithPrivateDataFields(Math.random() * 10);
        }
        return circle;
    }

    public static void print(CircleWithPrivateDataFields[] circle) {
        System.out.printf("%-30f%-15s\n", "Radius", "Area");

        for (int i = 0; i < circle.length; i++) {
            System.out.printf("%-30f%-15s\n", circle[i].getRadius(), circle[i].getArea());
        }
    }
}
