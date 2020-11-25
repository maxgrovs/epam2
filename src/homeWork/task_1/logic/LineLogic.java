package homeWork.task_1.logic;

import homeWork.task_1.model.Line;
import homeWork.task_1.model.Shape;


public class LineLogic implements ShapeLogic {

    @Override
    public Shape[] createArrayOfShape(Shape... inputShape) {

        Line[] lines = new Line[inputShape.length];

        for (int i = 0; i < inputShape.length; i++) {
            if (inputShape [i] instanceof Line) {
                lines [i] = (Line) inputShape [i];
            }
        }

        return lines;
    }

}
