package circleapp;

public class Circle {
    double radius;

    public Circle() {
        this(1.0); 
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));
        System.out.println("");
    }
}
