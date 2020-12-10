package homeWork.task_2.com.epam.jwd.decoratorrrrrrrr;

import homeWork.task_0.model.Point;
import homeWork.task_2.com.epam.jwd.exception.FigureException;
import homeWork.task_2.com.epam.jwd.exception.FigurePointException;
import homeWork.task_2.com.epam.jwd.factoryyyyyyyy.FigureFactory;
import homeWork.task_2.com.epam.jwd.factoryyyyyyyy.FigureType;
import homeWork.task_2.com.epam.jwd.model.Figure;
import homeWork.task_2.com.epam.jwd.model.Line;
import homeWork.task_2.com.epam.jwd.model.Square;
import homeWork.task_2.com.epam.jwd.model.Triangle;

public class PreProcessing extends FigureFactoryDecorator {

    public PreProcessing(FigureFactory factory) {
        super(factory);
    }

    @Override
    public Figure createFigure(FigureType type, Point[] figureConstituents) throws FigureException {
        return super.createFigure(type, figureConstituents);
    }

    public Figure preProcess(Figure figure) throws FigurePointException {

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
                break;
            }

        }

        if (result) {

            return figure;

        } else {

            throw new FigurePointException("The figure has the same points!");

        }
    }

}
