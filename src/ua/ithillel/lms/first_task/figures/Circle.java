package ua.ithillel.lms.first_task.figures;

public class Circle implements Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
