package testApp.task_2.com.epam.jwd.model;

import homeWork.task_0.model.Point;
import testApp.task_2.com.epam.jwd.exception.FigureException;
import testApp.task_2.com.epam.jwd.factory.FigureFactory;
import testApp.task_2.com.epam.jwd.factory.FigureType;

public class SimpleFigureFactory implements FigureFactory {


    private static Line[] allCreatedLines = new Line[4];
    private static Triangle[] allCreatedTriangles = new Triangle[4];
    private static Square[] allCreatedSquares = new Square[4];

    private static int amountOfLines = 0;
    private static int amountOfTriangles = 0;

    @Override
    public Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException {

        Figure figure = null;

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
        for (Line line : allCreatedLines) {
            if (line != null && line.getPoints() == points) {
                return line;
            }
        }
        final Line line = new Line(points);
        allCreatedLines[amountOfLines] = line;
        amountOfLines++;
        return line;
    }

    private Figure fetchTriangleFromCashOrCreate(Point... points) {
        for (Triangle triangle : allCreatedTriangles) {
            if (triangle != null && triangle.getPoints() == points) {
                return triangle;
            }
        }
        final Triangle triangle = new Triangle(points);
        allCreatedTriangles[amountOfTriangles] = triangle;
        amountOfTriangles++;
        return triangle;
    }

    private Figure fetchSquareFromCashOrCreate(Point... points) {

        for (Square square : allCreatedSquares) {
            if (square != null && square.getPoints() == points) {
                return square;
            }
        }

        final Square square = new Square(points);
        allCreatedSquares[0] = square;

        return square;
    }

}