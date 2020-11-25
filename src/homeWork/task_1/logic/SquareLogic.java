package homeWork.task_1.logic;


import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;


public class SquareLogic implements ShapeLogic {

    @Override
    public Shape[] createArrayOfShape(Shape... inputShape) {

        Square[] squares = new Square[inputShape.length];

        for (int i = 0; i < inputShape.length; i++) {
            if (inputShape [i] instanceof Square) {
                squares [i] = (Square) inputShape [i];
            }
        }

        return squares;
    }
}
