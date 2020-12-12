package newTask.com.epam.jwd.service.decorator;

import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.exception.FigureNotExistException;
import newTask.com.epam.jwd.factory.FigureFactory;
import newTask.com.epam.jwd.factory.FigureType;
import newTask.com.epam.jwd.model.*;

import java.util.Arrays;
import java.util.List;

public class PostProcessing extends FigureFactoryDecorator {

    public PostProcessing(FigureFactory factory) {
        super(factory);
    }

    @Override
    public Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException {

        System.out.println("Running postProcessing!");

        if (isFigureExists(type, figureConstituents)){

            return super.createFigure(type, figureConstituents);

        } else

            throw new FigureNotExistException("The figure is not exist!");
    }

    private boolean isFigureExists(FigureType type, Point... figureConstituents) throws FigureException {

        boolean result;

        switch (type) {
            case LINE:
                result = true;
                break;
            case TRIANGLE:
                result = isTriangleExist(figureConstituents);
                break;
            case SQUARE:
                result = isSquareExist(figureConstituents);
                break;
            default:
                throw new FigureException("Please enter right features!");
        }

        return result;
    }

    private boolean isTriangleExist(Point... figureConstituents) {

        List<Point> points = Arrays.asList(figureConstituents);

        double sideA;
        double sideB;
        double sideC;

        sideA = calculateDistanceBetweenPoints(points.get(0), points.get(1));
        sideB = calculateDistanceBetweenPoints(points.get(1), points.get(2));
        sideC = calculateDistanceBetweenPoints(points.get(2), points.get(0));

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
