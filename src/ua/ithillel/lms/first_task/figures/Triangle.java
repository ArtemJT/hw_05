package ua.ithillel.lms.first_task.figures;

public class Triangle extends Figure {

    private final double height;

    public Triangle(double side, double height) {
        super(side);
        this.height = height;
    }

    @Override
    public double countSquare() {
        return (segment * height) / 2;
    }
}
