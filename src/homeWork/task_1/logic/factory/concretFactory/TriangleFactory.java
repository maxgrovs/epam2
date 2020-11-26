package homeWork.task_1.logic.factory.concretFactory;

import homeWork.task_1.logic.factory.ShapeFactory;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Triangle;

public class TriangleFactory implements ShapeFactory {

    @Override
    public Shape[] createArrayOfShape(Shape... inputShape) {

        Triangle[] triangles = new Triangle[inputShape.length];

        for (int i = 0; i < inputShape.length; i++) {
            if (inputShape [i] instanceof Triangle) {
                triangles [i] = (Triangle) inputShape [i];
            }
        }

        return triangles;
    }
}
