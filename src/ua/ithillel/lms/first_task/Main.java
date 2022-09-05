package ua.ithillel.lms.first_task;

import ua.ithillel.lms.first_task.figures.Circle;
import ua.ithillel.lms.first_task.figures.Squareable;
import ua.ithillel.lms.first_task.figures.Square;
import ua.ithillel.lms.first_task.figures.Triangle;

public class Main {
    static Squareable[] figures;

    public static void main(String[] args) {
        figures = new Squareable[]{new Circle(2.2), new Square(4.5), new Triangle(2.1, 3)};
        System.out.printf("Суммарная площадь фигур = %.2f\n", countAreas());
    }

    static double countAreas() {
        double sum = 0;
        for (Squareable f : figures) {
            sum += f.countSquare();
        }
        return sum;
    }
}