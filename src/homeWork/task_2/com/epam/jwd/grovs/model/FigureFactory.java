package homeWork.task_2.com.epam.jwd.grovs.model;

import homeWork.task_0.model.Point;

public class FigureFactory {

    private FigureFactory() {
    }

    private static final FigureFactory INSTANCE = new FigureFactory();

    public static FigureFactory getInstance() {
        return INSTANCE;
    }

    private static Line[] allCreatedLines = new Line[4];
    private static Triangle[] allCreatedTriangles = new Triangle[4];
    private static Square[] allCreatedSquares = new Square[4];
    private static MultiAngleFigure[] allCreatedMultiAngleFigure = new MultiAngleFigure[4];

    private static int amountOfLines = 0;
    private static int amountOfTriangles = 0;
    private static int amountOfMultiAngleFigure = 0;

    public Figure createFigure(Point... points) {

        Figure figure = null;

        switch (points.length) {

            case 2:
                figure = fetchLineFromCashOrCreate(points);
                break;
            case 3:
                figure = fetchTriangleFromCashOrCreate(points);
                break;
            case 4:
                figure = fetchSquareFromCashOrCreate(points);
                break;
            case 4 | 5 | 6:
                figure = fetchMultiAngleFigureFromCashOrCreate(points);
                break;
            default:
                System.out.println("Фигуру создать не получится!");
                break;
        }

        final Figure result = figure;

        return result;
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

    private Figure fetchMultiAngleFigureFromCashOrCreate(Point... points) {
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
