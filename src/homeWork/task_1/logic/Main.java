package homeWork.task_1.logic;

import homeWork.task_0.model.Point;
import homeWork.task_1.model.Line;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;
import homeWork.task_1.model.Triangle;

public class Main {

    public static void main(String[] args) {

        Point[] points = {new Point(3, 4), new Point(5, 6), new Point(6, 7), new Point(8, 9)};

        Shape line1 = fetchShape(new Point(1, 2), new Point(3, 4));
        Shape line2 = fetchShape(new Point(2, 2), new Point(3, 4));

        Shape triangle1 = fetchShape(new Point(1, 2), new Point(3, 4), new Point(4,2));
        Shape triangle2 = fetchShape(new Point(6, 2), new Point(3, 4), new Point(4,2));

        Line [] lines = createArrayOfLines(line1, line2);

        Triangle[] triangles = createArrayOfTriangles(triangle1, triangle2);

        Square square = (Square) fetchShape(new Point(6, 2), new Point(3, 4),
                new Point(4,2), new Point(1,3));

        Shape [] shapes = new Line[4];

    }


    private static Line [] createArrayOfLines(Shape... inputShape) {

        Line [] lines = new Line[inputShape.length];

        for (int i = 0; i < inputShape.length; i++) {
            if (inputShape [i] instanceof Line) {
                lines [i] = (Line) inputShape [i];
            }
        }

        return lines;
    }

    private static Triangle [] createArrayOfTriangles(Shape... inputShape) {

        Triangle [] triangles = new Triangle[inputShape.length];

        for (int i = 0; i < inputShape.length; i++) {
            if (inputShape [i] instanceof Triangle) {
                triangles [i] = (Triangle) inputShape [i];
            }
        }

       return triangles;
    }




    public static Shape fetchShape(Point... input) {
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


    public static boolean isTriangle(Shape... inputShapes) {

        boolean b = false;

        for (Shape shape : inputShapes) {
            b = shape instanceof Line;
        }
        return b;
    }

}
