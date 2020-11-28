package homeWork.task_1.logic.validate;

import homeWork.task_0.model.Point;
import homeWork.task_1.logic.PointLogic;
import homeWork.task_1.model.Line;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;
import homeWork.task_1.model.Triangle;

public class ShapeValidator {

    public boolean isLines(Shape... inputShapes) {

        boolean b = false;

        for (Shape shape : inputShapes) {
            b = shape instanceof Line;
        }
        return b;
    }

    public boolean isTriangles(Shape... inputShapes) {

        boolean b = false;

        for (Shape shape : inputShapes) {
            b = shape instanceof Triangle;
        }
        return b;
    }

    public boolean isQuadrangles(Shape... inputShapes) {

        boolean b = false;

        for (Shape shape : inputShapes) {
            b = shape instanceof Square;
        }
        return b;
    }

    public boolean isTriangleExist(Shape shape) {

        PointLogic logic = new PointLogic();

        Triangle triangle = null;

        double sideA = 0;
        double sideB = 0;
        double sideC = 0;

        if (shape instanceof Triangle) {
            triangle = (Triangle) shape;
        }

        if (triangle != null) {
            sideA = logic.calculateDistanceBetweenPoints(triangle.getPoints()[0], triangle.getPoints()[1]);
            sideB = logic.calculateDistanceBetweenPoints(triangle.getPoints()[1], triangle.getPoints()[2]);
            sideC = logic.calculateDistanceBetweenPoints(triangle.getPoints()[2], triangle.getPoints()[0]);
        }

        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    public boolean isSquare(Shape shape) {

        PointLogic logic = new PointLogic();

        Square square = null;

        double sideA = 0;
        double diagonal = 0;

        if (shape instanceof Square) {
            square = (Square) shape;
        }

        if (square != null) {
            sideA = logic.calculateDistanceBetweenPoints(square.getPoints()[0], square.getPoints()[1]) * 1000;
            diagonal = logic.calculateDistanceBetweenPoints(square.getPoints()[1], square.getPoints()[3]) * 1000;

        }

        return (int) diagonal == (int) (Math.sqrt(2) * sideA);
    }


    public boolean isUniquePoints(Shape inputShape) {

        boolean result = true;

        Line line = null;
        Triangle triangle = null;
        Square square = null;

        Point[] points = new Point[0];

        if (inputShape instanceof Line) {
            line = (Line) inputShape;

            points = line.getPoints();

        }
        if (inputShape instanceof Triangle) {
            triangle = (Triangle) inputShape;

            points = triangle.getPoints();

        }
        if (inputShape instanceof Square) {
            square = (Square) inputShape;

            points = square.getPoints();

        }


        for (int i = 1; i < points.length; i++) {

            if (points[0].equals(points[i])) {
                result = false;
            }


        }

        return result;
    }
}



