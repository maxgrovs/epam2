package homeWork.task_1.model;

import homeWork.task_0.model.Point;
import homeWork.task_1.logic.validate.ShapeValidator;

public class ShapeFactory {

    private ShapeFactory() {
    }

    private static final ShapeFactory INSTANCE = new ShapeFactory();

    public static ShapeFactory getInstance() {
        return INSTANCE;
    }

    private static Line[] allCreatedLines = new Line[4];
    private static Triangle[] allCreatedTriangles = new Triangle[4];
    private static Square[] allCreatedSquares = new Square[4];
    private static MultiAngleFigure[] allCreatedMultiAngleFigure = new MultiAngleFigure[4];

    private static int amountOfLines = 0;
    private static int amountOfTriangles = 0;
    private static int amountOfMultiAngleFigure = 0;


    public Shape createShape(Point... points) {


        Shape shape = null;

        switch (points.length) {

            case 2:
                shape = fetchLineFromCashOrCreate(points);
                break;
            case 3:
                shape = fetchTriangleFromCashOrCreate(points);
                break;
            case 4:
                shape = fetchSquareFromCashOrCreate(points);
                break;
            case 4 | 5 | 6:
                shape = fetchMultiAngleFigureFromCashOrCreate(points);
                break;
        }

        final Shape result = shape;

        return result;
    }

    private Shape fetchLineFromCashOrCreate(Point... points) {
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

    private Shape fetchTriangleFromCashOrCreate(Point... points) {
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

    private Shape fetchSquareFromCashOrCreate(Point... points) {

        for (Square square : allCreatedSquares) {
            if (square != null && square.getPoints() == points) {
                return square;
            }
        }

        final Square square = new Square(points);
        allCreatedSquares[0] = square;

        return square;
    }

    private Shape fetchMultiAngleFigureFromCashOrCreate(Point... points) {
        for (MultiAngleFigure multiAngleFigure : allCreatedMultiAngleFigure) {
            if (multiAngleFigure != null && multiAngleFigure.getPoints() == points) {
                return multiAngleFigure;
            }
        }
        final MultiAngleFigure multiAngleFigure = new MultiAngleFigure(points);
        allCreatedMultiAngleFigure[amountOfMultiAngleFigure] = multiAngleFigure;
        amountOfMultiAngleFigure++;
        return multiAngleFigure;
    }

}
