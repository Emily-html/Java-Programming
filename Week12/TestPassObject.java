public interface TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields c = new CircleWithPrivateDataFields(1);
        int n = 5;
        printAreas(c, n);
        System.out.println("\n" + "Radius is " + c.getRadius());
        System.out.println("n is " + n);

    }

    public static void printAreas(CircleWithPrivateDataFields c, int n) {
        System.out.println("Radius \t\t Area");
        while (n > 0) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            n--;
        }
    }
}
