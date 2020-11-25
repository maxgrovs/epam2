package homeWork.task_1.app;

import homeWork.task_0.model.Point;
import homeWork.task_1.logic.ShapeMaker;
import homeWork.task_1.model.Line;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;
import homeWork.task_1.model.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeRunner {
    private static Logger logger = LogManager.getLogger(ShapeRunner.class);

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        Point[] points = {new Point(3, 4), new Point(5, 6), new Point(6, 7), new Point(8, 9)};

        Shape line1 = shapeMaker.fetchShape(new Point(1, 2), new Point(3, 4));
        Shape line2 = shapeMaker.fetchShape(new Point(2, 2), new Point(3, 4));

        Shape triangle1 = shapeMaker.fetchShape(new Point(1, 2), new Point(3, 4), new Point(4, 2));
        Shape triangle2 = shapeMaker.fetchShape(new Point(6, 2), new Point(3, 4), new Point(4, 2));

        Shape square = shapeMaker.fetchShape(new Point(6, 2), new Point(3, 4),
                new Point(4, 2), new Point(1, 3));

        Line[] lines = (Line[]) shapeMaker.createArrayOfShape(line1, line2);

        Triangle[] triangles = (Triangle[]) shapeMaker.createArrayOfShape(triangle1, triangle2);

        Square[] squares = (Square[]) shapeMaker.createArrayOfShape(square);

        writeLogOfPoints(points);


    }

    private static void writeLogOfPoints(Point[] points) {
        int i = 0;

        do {
            logger.info(points[i++].toString());
        } while (i < points.length);
    }

    public static void writeLogOfShapes(Point[] points) {

        for (Point point :
                points) {
            logger.info(point.toString());
        }


    }
}

