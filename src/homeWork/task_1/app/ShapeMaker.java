package homeWork.task_1.app;

import homeWork.task_0.model.Point;
import homeWork.task_1.logic.LineLogic;
import homeWork.task_1.logic.ShapeLogic;
import homeWork.task_1.logic.SquareLogic;
import homeWork.task_1.logic.TriangleLogic;
import homeWork.task_1.model.Line;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;
import homeWork.task_1.model.Triangle;

public class ShapeMaker {

    public ShapeLogic logic;

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
            logic = new LineLogic();

           shapes = (Line[]) logic.createArrayOfShape(inputShapes);

        } else if (isTriangle(inputShapes)){
            logic = new TriangleLogic();

            shapes = (Triangle[]) logic.createArrayOfShape(inputShapes);

        }else if (isSquare(inputShapes)){
            logic = new SquareLogic();

            shapes = (Square[]) logic.createArrayOfShape(inputShapes);
        }


        return shapes;
    }

}
