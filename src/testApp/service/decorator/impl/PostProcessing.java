package testApp.service.decorator.impl;


import testApp.exception.FigureException;
import testApp.exception.FigureNotExistException;
import testApp.model.Figure;
import testApp.model.Point;
import testApp.service.decorator.FigureFactory;

import java.util.Arrays;
import java.util.List;

public class PostProcessing extends FigureFactoryDecorator {

    public PostProcessing(FigureFactory factory) {
        super(factory);
    }

    @Override
    public Figure createFigure(Point... figureConstituents) throws FigureException {

        // System.out.println("Running postProcessing!");

        if (isFigureExists(figureConstituents)) {

            return super.createFigure(figureConstituents);

        } else

            throw new FigureNotExistException("The figure is not exist!");
    }

    private boolean isFigureExists(Point... figureConstituents) throws FigureException {

        boolean result;

        switch (figureConstituents.length) {

            case 3:
                result = isTriangleExist(figureConstituents);
                break;
            case 4:
                result = isSquareExist(figureConstituents);
                break;
            default:
                throw new FigureException("Please enter right features!");
        }

        return result;
    }

    private boolean isTriangleExist(Point... figureConstituents) {

        List<Point> points = Arrays.asList(figureConstituents);

        double sideA = calculateDistanceBetweenPoints(points.get(0), points.get(1));
        double sideB = calculateDistanceBetweenPoints(points.get(1), points.get(2));
        double sideC = calculateDistanceBetweenPoints(points.get(2), points.get(0));

        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    private boolean isSquareExist(Point... figureConstituents) {

        List<Point> points = Arrays.asList(figureConstituents);

        double sideA;
        double diagonal;

        sideA = calculateDistanceBetweenPoints(points.get(0), points.get(1)) * 1000;
        diagonal = calculateDistanceBetweenPoints(points.get(1), points.get(3)) * 1000;

        return (int) diagonal == (int) (Math.sqrt(2) * sideA);
    }

    private double calculateDistanceBetweenPoints(Point a, Point b) {

        double ac = Math.abs(b.getY() - a.getY());
        double cb = Math.abs(b.getX() - a.getX());

        return Math.hypot(ac, cb);
    }

}
