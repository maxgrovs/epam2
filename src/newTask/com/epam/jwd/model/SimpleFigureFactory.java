package newTask.com.epam.jwd.model;


import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.factory.FigureFactory;
import newTask.com.epam.jwd.factory.FigureType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleFigureFactory implements FigureFactory {

    private static List<Line> linesBuffer = new ArrayList<>();

    private static List<Triangle> trianglesBuffer = new ArrayList<>();

    private static List<Square> squaresBuffer = new ArrayList<>();

    @Override
    public Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException {

       // System.out.println("Creating Figure!");

        Figure figure;

        switch (type) {

            case LINE:

                figure = fetchLineFromCashOrCreate(figureConstituents);
                break;

            case TRIANGLE:
                figure = fetchTriangleFromCashOrCreate(figureConstituents);
                break;

            case SQUARE:
                figure = fetchSquareFromCashOrCreate(figureConstituents);
                break;

            default:
                throw new FigureException("Please enter correct features!");

        }

        return figure;
    }


    private Figure fetchLineFromCashOrCreate(Point... points) {

        List<Point> pointList = Arrays.asList(points);

        for (Line line : linesBuffer) {
            if (line != null && line.getPoints().equals(pointList)) {
                return line;
            }
        }
        final Line line = new Line(pointList);

        linesBuffer.add(line);

        return line;
    }

    private Figure fetchTriangleFromCashOrCreate(Point... points) {

        List<Point> pointList = Arrays.asList(points);

        for (Triangle triangle : trianglesBuffer) {
            if (triangle != null && triangle.getPoints().equals(pointList)) {
                return triangle;
            }
        }
        final Triangle triangle = new Triangle(pointList);

        trianglesBuffer.add(triangle);

        return triangle;
    }

    private Figure fetchSquareFromCashOrCreate(Point... points) {

        List<Point> pointList = Arrays.asList(points);

        for (Square square : squaresBuffer) {
            if (square != null && square.getPoints().equals(pointList)) {
                return square;
            }
        }

        final Square square = new Square(pointList);

        squaresBuffer.add(square);

        return square;
    }

}
