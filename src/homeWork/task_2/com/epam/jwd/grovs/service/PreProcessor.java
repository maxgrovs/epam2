package homeWork.task_2.com.epam.jwd.grovs.service;

import homeWork.task_0.model.Point;
import homeWork.task_2.com.epam.jwd.grovs.exception.FigureException;
import homeWork.task_2.com.epam.jwd.grovs.model.Figure;
import homeWork.task_2.com.epam.jwd.grovs.model.Line;
import homeWork.task_2.com.epam.jwd.grovs.model.Square;
import homeWork.task_2.com.epam.jwd.grovs.model.Triangle;

public class PreProcessor implements FigureProcessor {


    @Override
    public Figure process(Figure figure) throws FigureException {

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

        if (result){

            return figure;

        }else {

            throw new  FigureException("The figure has the same points!");

        }
    }
}
