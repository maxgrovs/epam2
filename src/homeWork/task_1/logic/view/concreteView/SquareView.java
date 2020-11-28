package homeWork.task_1.logic.view.concreteView;

import homeWork.task_1.logic.validate.ShapeValidator;
import homeWork.task_1.logic.view.ShapeView;
import homeWork.task_1.model.Shape;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SquareView implements ShapeView {

    private static Logger logger = LogManager.getLogger(SquareView.class);


    @Override
    public void print(Shape[] shapes) {

        ShapeValidator validator = new ShapeValidator();

        for (Shape shape :
                shapes) {

            if (validator.isUniquePoints(shape)){
                if (validator.isSquare(shape)){
                    logger.info(shape.toString());
                }else
                    logger.error("Объект " + shape + " не является квадратом!");
            }else {

                logger.error("Объект " + shape.toString() + " не является фигурой Square");
            }



        }

    }

}
