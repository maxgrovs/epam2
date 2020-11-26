package homeWork.task_1.logic.validate;

import homeWork.task_1.model.Line;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;
import homeWork.task_1.model.Triangle;

public class ShapeValidator {

    public boolean isLine(Shape... inputShapes) {

        boolean b = false;

        for (Shape shape : inputShapes) {
            b = shape instanceof Line;
        }
        return b;
    }

    public boolean isTriangle(Shape... inputShapes) {

        boolean b = false;

        for (Shape shape : inputShapes) {
            b = shape instanceof Triangle;
        }
        return b;
    }

    public boolean isSquare(Shape... inputShapes) {

        boolean b = false;

        for (Shape shape : inputShapes) {
            b = shape instanceof Square;
        }
        return b;
    }

}
