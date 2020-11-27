package homeWork.task_1.logic.validate;

import homeWork.task_1.logic.PointLogic;
import homeWork.task_1.model.Line;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;
import homeWork.task_1.model.Triangle;
import org.apache.logging.log4j.core.util.ArrayUtils;

import java.util.Arrays;

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


    public void isUnique(Shape [] shapes){



                    System.out.println(shapes[0].equals(shapes[1]));



            }




       //return result;
    }



