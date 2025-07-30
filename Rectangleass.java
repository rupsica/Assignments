class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        // Employee Example
        Employee emp = new Employee("Alice", 36, 4500, "EMP101");
        emp.displayDetails();

        // Circle Example
        Circle c = new Circle(5);
        System.out.printf("\nCircle Area     : %.2f\n", c.area());
        System.out.printf("Circle Perimeter: %.2f\n", c.perimeter());

        // Rectangle Example
        Rectangle r = new Rectangle(10, 4);
        System.out.println("\nRectangle Area     : " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());
    }
}
