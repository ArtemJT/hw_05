package ua.ithillel.lms.first_task.figures;

public class Circle extends Figure {

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double countSquare() {
        return Math.PI * Math.pow(segment, 2);
    }
}
