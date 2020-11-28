package homeWork.task_1.model.factory;

import homeWork.task_0.model.Point;
import homeWork.task_1.model.Shape;

public interface ShapeFactory {

    Shape createShape(Point... points);

}
