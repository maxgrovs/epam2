package testApp.model.shape.impl;

import homeWork.task_0.model.Point;
import testApp.model.shape.Shape;

public class ShapeFactory {

    private static Line[] allCreatedLines = new Line[2];
    private static Triangle[] allCreatedTriangles = new Triangle[2];
    private static Square[] allCreatedSquares= new Square[1];

    private static int amountOfLines = 0;
    private static int amountOfTriangles = 0;


    public Shape createShape(Point... points) {

        final Shape shape = fetchFromCashOrCreate(points);

        return shape;
    }

    private Shape fetchFromCashOrCreate(Point... points) {

        Shape shape = null;

        switch (points.length) {
            case 2:
                for (Line line : allCreatedLines) {
                    if (line != null && line.getPoints() == points) {
                        shape = line;
                    }
                }
                final Line line = new Line(points);
                allCreatedLines[amountOfLines] = line;
                amountOfLines++;
                shape = line;

            case 3:
                for (Triangle triangle : allCreatedTriangles) {
                    if (triangle != null && triangle.getPoints() == points) {
                        shape = triangle;
                    }
                }
                final Triangle triangle = new Triangle(points);
                allCreatedTriangles[amountOfTriangles] = triangle;
                amountOfTriangles++;
                shape = triangle;

            case 4:
                for (Square square : allCreatedSquares) {
                    if (square != null && square.getPoints() == points) {
                        shape = square;
                    }
                }
                final Square square = new Square(points);
                allCreatedSquares[0] = square;

                shape = square;
        }


        return shape;
    }
}
