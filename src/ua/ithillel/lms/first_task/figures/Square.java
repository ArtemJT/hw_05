package ua.ithillel.lms.first_task.figures;


public class Square extends Figure {

    public Square(double side) {
        super(side);
    }

    @Override
    public double countSquare() {
        return segment * segment;
    }
}
