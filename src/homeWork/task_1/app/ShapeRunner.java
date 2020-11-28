package homeWork.task_1.app;

import homeWork.task_0.model.Point;
import homeWork.task_1.logic.ShapeLogic;
import homeWork.task_1.logic.strategy.concreteStrategy.FindPerimeterStrategy;
import homeWork.task_1.logic.validate.ShapeValidator;
import homeWork.task_1.model.Shape;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeRunner {
   private static Logger logger = LogManager.getLogger(ShapeRunner.class);

    public static void main(String[] args) {

        ShapeValidator validator = new ShapeValidator();



        ShapeLogic shapeLogic = new ShapeLogic();

        Point[] points = {new Point(3, 4), new Point(5, 6), new Point(6, 7), new Point(8, 9)};

        Shape line1 = shapeLogic.fetchShape(new Point(1, 2), new Point(1, 3));
        Shape line2 = shapeLogic.fetchShape(new Point(1, 2), new Point(3, 4));

        Shape triangle1 = shapeLogic.fetchShape(new Point(1, 2), new Point(1, 2), new Point(4, 2));
        Shape triangle2 = shapeLogic.fetchShape(new Point(6, 2), new Point(3, 4), new Point(4, 2));

        Shape square = shapeLogic.fetchShape(new Point(1, 1), new Point(1, 4),
                new Point(4, 4), new Point(5, 1));

        Shape[] lines = shapeLogic.createArrayOfShape(line1, line2);

        Shape[] triangles = shapeLogic.createArrayOfShape(triangle1, triangle2);

        Shape[] squares = shapeLogic.createArrayOfShape(square);

       // shapeLogic.writeLogOfPoints(points);

       // shapeLogic.writeLogOfShape(triangles);

       // shapeLogic.writeLogOfShape(squares);

        //System.out.println(validator.isTriangleExist(triangle1));

        //System.out.println(validator.isSquare(square));


    }

}

