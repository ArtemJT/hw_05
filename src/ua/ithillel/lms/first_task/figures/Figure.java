package ua.ithillel.lms.first_task.figures;

abstract class Figure implements Areable {

    protected final double segment;

    public Figure(double segment) {
        this.segment = segment;
    }
}
