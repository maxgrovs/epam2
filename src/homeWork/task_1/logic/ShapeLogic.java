package homeWork.task_1.logic;

import homeWork.task_0.model.Point;
import homeWork.task_1.logic.factory.concretFactory.LineFactory;
import homeWork.task_1.logic.factory.ShapesArrayFactory;
import homeWork.task_1.logic.factory.concretFactory.SquareFactory;
import homeWork.task_1.logic.factory.concretFactory.TriangleFactory;
import homeWork.task_1.logic.validate.ShapeValidator;
import homeWork.task_1.logic.view.ShapeView;
import homeWork.task_1.logic.view.concreteView.LineView;
import homeWork.task_1.logic.view.concreteView.SquareView;
import homeWork.task_1.logic.view.concreteView.TriangleView;
import homeWork.task_1.model.Shape;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ShapeLogic {

    private static Logger logger = LogManager.getLogger(ShapeLogic.class);

    private ShapeValidator validator = new ShapeValidator();

    private PointLogic pointLogic = new PointLogic();

    public Shape[] createArrayOfShape(Shape... inputShapes) {

        Shape[] shapes = null;

        ShapesArrayFactory factory;

        if (validator.isLines(inputShapes)) {
            factory = new LineFactory();

            shapes = factory.createArrayOfShape(inputShapes);

        } else if (validator.isTriangles(inputShapes)) {
            factory = new TriangleFactory();

            shapes = factory.createArrayOfShape(inputShapes);

        } else if (validator.isQuadrangles(inputShapes)) {
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

        if (validator.isLines(shapes)) {
            view = new LineView();
            view.print(shapes);
        }
        if (validator.isTriangles(shapes)) {
            view = new TriangleView();
            view.print(shapes);
        }
        if (validator.isQuadrangles(shapes)) {
            view = new SquareView();
            view.print(shapes);
        }


    }

}
