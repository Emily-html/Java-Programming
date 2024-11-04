public class Rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        System.out.println("The width, height, area and perimeter of R1 are " + r1.width + " " + r1.height + " "
                + r1.getArea() + " " +
                r1.getPerimeter());

        Rectangle r2 = new Rectangle(3.5,
                35.9);
        System.out.println("The width, height, area and perimeter of R1 are " + r2.width + " "
                + r2.height + " " + r2.getArea() + " " + r2.getPerimeter());
    }

    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;

    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);

    }
}
