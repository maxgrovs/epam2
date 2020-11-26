package homeWork.task_1.logic;

import homeWork.task_0.model.Point;
import homeWork.task_1.logic.factory.concretFactory.LineFactory;
import homeWork.task_1.logic.factory.ShapeFactory;
import homeWork.task_1.logic.factory.concretFactory.SquareFactory;
import homeWork.task_1.logic.factory.concretFactory.TriangleFactory;
import homeWork.task_1.model.Line;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;
import homeWork.task_1.model.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ShapeLogic {

    private static Logger logger = LogManager.getLogger(ShapeLogic.class);


    public ShapeFactory logic;

    public Shape fetchShape(Point... input) {
        Shape shape = null;

        switch (input.length) {
            case 2:
                shape = new Line(input);
                break;
            case 3:
                shape = new Triangle(input);
                break;
            case 4:
                shape = new Square(input);
                break;
        }

        return shape;
    }

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

    public Shape[] createArrayOfShape(Shape... inputShapes) {

        Shape [] shapes = null;

        if (isLine(inputShapes)) {
            logic = new LineFactory();

           shapes = logic.createArrayOfShape(inputShapes);

        } else if (isTriangle(inputShapes)){
            logic = new TriangleFactory();

            shapes = logic.createArrayOfShape(inputShapes);

        }else if (isSquare(inputShapes)){
            logic = new SquareFactory();

            shapes = logic.createArrayOfShape(inputShapes);
        }


        return shapes;
    }

    public void writeLogOfPoints(Point[] points) {
        int i = 0;

        do {
            logger.info(points[i++].toString());
        } while (i < points.length);
    }



}
