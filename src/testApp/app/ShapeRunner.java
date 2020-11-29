package testApp.app;

import homeWork.task_0.model.Point;
import testApp.model.shape.Shape;
import testApp.model.shape.impl.ShapeFactory;

public class ShapeRunner {

    public static void main(String[] args) {

        ShapeFactory factory = ShapeFactory.getInstance();

        Shape line1 = factory.createShape(new Point(1, 2), new Point(1, 2));
        Shape line2 = factory.createShape(new Point(1, 2), new Point(1, 7));

        Shape triangle1 = factory.createShape(new Point(1, 2), new Point(1, 2), new Point(4, 2));
        Shape triangle2 = factory.createShape(new Point(6, 2), new Point(3, 4), new Point(4, 2));

        Shape square = factory.createShape(new Point(1, 1), new Point(1, 4),
                new Point(4, 4), new Point(5, 1));

        System.out.println(square);

    }

}
