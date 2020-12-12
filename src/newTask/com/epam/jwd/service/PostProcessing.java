package newTask.com.epam.jwd.service;

import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.exception.FigureNotExistException;
import newTask.com.epam.jwd.factory.FigureFactory;
import newTask.com.epam.jwd.factory.FigureType;
import newTask.com.epam.jwd.model.*;

public class PostProcessing extends FigureFactoryDecorator {

    public PostProcessing(FigureFactory factory) {
        super(factory);
    }

    @Override
    public Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException {

        System.out.println("Running postProcessing!");
        return process(super.createFigure(type, figureConstituents)) ;

    }

    public Figure process(Figure figure) throws FigureNotExistException {

        boolean result = true;

        if (figure instanceof Line) {
            Line line = (Line) figure;

            Point[] points = line.getPoints();

            for (int i = 1; i < points.length; i++) {

                if (points[0].equals(points[i])) {
                    result = false;
                    break;
                }
            }

        }
        if (figure instanceof Triangle) {
            Triangle triangle = (Triangle) figure;

            result = isTriangleExist(triangle);

        }
        if (figure instanceof Square) {
            Square square = (Square) figure;

            result = isSquareExist(square);

        }

        if (result) {

            return figure;

        } else {

            throw new FigureNotExistException("The figure is not exist!");

        }
    }

    private boolean isTriangleExist(Figure figure) {

        Triangle triangle = null;

        double sideA = 0;
        double sideB = 0;
        double sideC = 0;

        if (figure instanceof Triangle) {
            triangle = (Triangle) figure;
        }

        if (triangle != null) {
            sideA = calculateDistanceBetweenPoints(triangle.getPoints()[0], triangle.getPoints()[1]);
            sideB = calculateDistanceBetweenPoints(triangle.getPoints()[1], triangle.getPoints()[2]);
            sideC = calculateDistanceBetweenPoints(triangle.getPoints()[2], triangle.getPoints()[0]);
        }

        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    private boolean isSquareExist(Figure figure) {

        Square square = null;

        double sideA = 0;
        double diagonal = 0;

        if (figure instanceof Square) {
            square = (Square) figure;
        }

        if (square != null) {
            sideA = calculateDistanceBetweenPoints(square.getPoints()[0], square.getPoints()[1]) * 1000;
            diagonal = calculateDistanceBetweenPoints(square.getPoints()[1], square.getPoints()[3]) * 1000;

        }

        return (int) diagonal == (int) (Math.sqrt(2) * sideA);
    }

    private double calculateDistanceBetweenPoints(Point a, Point b) {

        double ac = Math.abs(b.getY() - a.getY());
        double cb = Math.abs(b.getX() - a.getX());

        return Math.hypot(ac, cb);
    }

}