package ua.ithillel.lms.first_task;

import ua.ithillel.lms.first_task.figures.Circle;
import ua.ithillel.lms.first_task.figures.Areable;
import ua.ithillel.lms.first_task.figures.Square;
import ua.ithillel.lms.first_task.figures.Triangle;

public class Main {
    static Areable[] figures;

    public static void main(String[] args) {
        figures = new Areable[]{new Circle(2.2), new Square(4.5), new Triangle(2.1, 3)};
        System.out.printf("Суммарная площадь фигур = %.2f\n", countAreas());
    }

    static double countAreas() {
        double sum = 0;
        for (Areable f : figures) {
            sum += f.area();
        }
        return sum;
    }
}