package circleapp;

public class CircleMain {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);

        defaultCircle.displayDetails();
        customCircle.displayDetails();
    }
}
