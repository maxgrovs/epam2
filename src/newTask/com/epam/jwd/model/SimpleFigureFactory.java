package newTask.com.epam.jwd.model;


import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.factory.FigureFactory;
import newTask.com.epam.jwd.factory.FigureType;

import java.util.ArrayList;
import java.util.List;

public class SimpleFigureFactory implements FigureFactory {

    /*private SimpleFigureFactory() {
    }

    private static final SimpleFigureFactory INSTANCE = new SimpleFigureFactory();

    public static SimpleFigureFactory getInstance() {
        return INSTANCE;
    }*/


    private static List<Line> lineStorage = new ArrayList<>();

    private static List<Triangle> triangleStorage = new ArrayList<>();

    private static List<Square> squareStorage = new ArrayList<>();

    @Override
    public Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException {

        System.out.println("Creating Figure!");

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
        for (Line line : lineStorage) {
            if (line != null && line.getPoints() == points) {
                return line;
            }
        }
        final Line line = new Line(points);

        lineStorage.add(line);

        return line;
    }

    private Figure fetchTriangleFromCashOrCreate(Point... points) {
        for (Triangle triangle : triangleStorage) {
            if (triangle != null && triangle.getPoints() == points) {
                return triangle;
            }
        }
        final Triangle triangle = new Triangle(points);

        triangleStorage.add(triangle);

        return triangle;
    }

    private Figure fetchSquareFromCashOrCreate(Point... points) {

        for (Square square : squareStorage) {
            if (square != null && square.getPoints() == points) {
                return square;
            }
        }

        final Square square = new Square(points);

        squareStorage.add(square);

        return square;
    }

}
