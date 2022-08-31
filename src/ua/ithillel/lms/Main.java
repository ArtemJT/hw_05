package ua.ithillel.lms;

import ua.ithillel.lms.figures.Circle;
import ua.ithillel.lms.figures.Figure;
import ua.ithillel.lms.figures.Square;
import ua.ithillel.lms.figures.Triangle;

public class Main {
    static Figure[] figures;

    public static void main (String[] args) {
        figures = new Figure[]{new Circle(2.2), new Square(4.5), new Triangle(2.1, 3)};
        System.out.println("Суммарная площадь фигур = " + countAreas());
    }

    static double countAreas () {
        double sum = 0;
        for (Figure f : figures) {
            sum += f.area();
        }
        return sum;
    }
}