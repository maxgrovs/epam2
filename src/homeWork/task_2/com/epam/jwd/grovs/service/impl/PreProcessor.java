package homeWork.task_2.com.epam.jwd.grovs.service.impl;

import homeWork.task_0.model.Point;
import homeWork.task_2.com.epam.jwd.grovs.exception.FigureException;
import homeWork.task_2.com.epam.jwd.grovs.exception.FigurePointException;
import homeWork.task_2.com.epam.jwd.grovs.model.Figure;
import homeWork.task_2.com.epam.jwd.grovs.model.Line;
import homeWork.task_2.com.epam.jwd.grovs.model.Square;
import homeWork.task_2.com.epam.jwd.grovs.model.Triangle;
import homeWork.task_2.com.epam.jwd.grovs.service.FigurePostProcessor;

public class PreProcessor implements FigurePostProcessor {


    @Override
    public Figure process(Figure figure) throws FigurePointException {

        boolean result = true;

        Line line = null;
        Triangle triangle = null;
        Square square = null;

        Point[] points = new Point[0];

        if (figure instanceof Line) {
            line = (Line) figure;

            points = line.getPoints();

        }
        if (figure instanceof Triangle) {
            triangle = (Triangle) figure;

            points = triangle.getPoints();

        }
        if (figure instanceof Square) {
            square = (Square) figure;

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
