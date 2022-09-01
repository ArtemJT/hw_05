package ua.ithillel.lms.first_task.figures;


public class Square implements Figure {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
