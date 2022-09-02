package ua.ithillel.lms.first_task.figures;

public class Triangle implements Figure {

    private final double side;
    private final double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double area() {
        return (side * height) / 2;
    }
}
