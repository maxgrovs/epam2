package homeWork.task_1.logic.view.concreteView;

import homeWork.task_1.logic.validate.ShapeValidator;
import homeWork.task_1.logic.view.ShapeView;
import homeWork.task_1.model.Shape;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LineView implements ShapeView {

    private static Logger logger = LogManager.getLogger(LineView.class);


    @Override
    public void print(Shape[] shapes) {

        ShapeValidator validator = new ShapeValidator();


        for (Shape shape :
                shapes) {

            if (validator.isUniquePoints(shape)){

                logger.info(shape.toString());

            }else {

             logger.error("Объект " + shape.toString() + " не является фигурой Line");

            }


        }


    }

}
