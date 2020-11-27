package homeWork.task_1.logic;

import homeWork.task_0.model.Point;
import homeWork.task_1.logic.factory.concretFactory.LineFactory;
import homeWork.task_1.logic.factory.ShapeFactory;
import homeWork.task_1.logic.factory.concretFactory.SquareFactory;
import homeWork.task_1.logic.factory.concretFactory.TriangleFactory;
import homeWork.task_1.logic.validate.ShapeValidator;
import homeWork.task_1.logic.view.ShapeView;
import homeWork.task_1.logic.view.concreteView.LineView;
import homeWork.task_1.model.Line;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;
import homeWork.task_1.model.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ShapeLogic {

    private static Logger logger = LogManager.getLogger(ShapeLogic.class);

    private ShapeValidator validator = new ShapeValidator();

    private PointLogic pointLogic = new PointLogic();

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


    public Shape[] createArrayOfShape(Shape... inputShapes) {

        Shape[] shapes = null;

        ShapeFactory factory;

        if (validator.isLine(inputShapes)) {
            factory = new LineFactory();

            shapes = factory.createArrayOfShape(inputShapes);

        } else if (validator.isTriangle(inputShapes)) {
            factory = new TriangleFactory();

            shapes = factory.createArrayOfShape(inputShapes);

        } else if (validator.isSquare(inputShapes)) {
            factory = new SquareFactory();

            shapes = factory.createArrayOfShape(inputShapes);
        }


        return shapes;
    }

    public void writeLogOfPoints(Point[] points) {
        int i = 0;

        do {
            logger.info(points[i++].toString());
        } while (i < points.length);
    }





    public void writeLogOfShape(Shape[] shapes) {

        ShapeView view;

        if (validator.isLine(shapes)) {
            view = new LineView();
            view.print(shapes);
        }

    }

}
