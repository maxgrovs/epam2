package newTask.com.epam.jwd.service.impl;


import newTask.com.epam.jwd.exception.FigurePointException;
import newTask.com.epam.jwd.model.*;
import newTask.com.epam.jwd.service.FigurePostProcessor;

public class PreProcessor implements FigurePostProcessor {


    @Override
    public Figure process(Figure figure) throws FigurePointException {

        boolean result = true;

        Point[] points = new Point[0];

        if (figure instanceof Line) {
            Line line = (Line) figure;

            points = line.getPoints();

        }
        if (figure instanceof Triangle) {
            Triangle triangle = (Triangle) figure;

            points = triangle.getPoints();

        }
        if (figure instanceof Square) {
            Square square = (Square) figure;

            points = square.getPoints();

        }


        for (int i = 1; i < points.length; i++) {

            if (points[0].equals(points[i])) {
                result = false;
            }

        }

        if (result) {

            return figure;

        } else {

            throw new FigurePointException("The figure has the same points!");

        }
    }
}
