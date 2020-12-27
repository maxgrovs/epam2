package testApp.model;


import testApp.exception.FigureException;
import testApp.service.decorator.FigureFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleFigureFactory implements FigureFactory {

    private static final List<Triangle> trianglesBuffer = new ArrayList<>();

    private static final List<Square> squaresBuffer = new ArrayList<>();


    public Figure createFigure(Point... figureConstituents) throws FigureException {

        // System.out.println("Creating Figure!");

        Figure figure;

        switch (figureConstituents.length) {

            case 3:
                figure = fetchTriangleFromCashOrCreate(figureConstituents);
                break;

            case 4:
                figure = fetchSquareFromCashOrCreate(figureConstituents);
                break;

            default:
                throw new FigureException("Please enter correct features!");

        }

        return figure;
    }


    private Figure fetchTriangleFromCashOrCreate(Point... points) {

        List<Point> pointList = Arrays.asList(points);

        for (Triangle triangle : trianglesBuffer) {
            if (triangle != null && triangle.getPoints().equals(pointList)) {
                return triangle;
            }
        }
        final Triangle triangle = new Triangle(points[0], points[1], points[2]);

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

        final Square square = new Square(points[0], points[1], points[2], points[3]);

        squaresBuffer.add(square);

        return square;
    }

}
