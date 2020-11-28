package homeWork.task_1.logic.view.concreteView;

import homeWork.task_1.logic.validate.ShapeValidator;
import homeWork.task_1.logic.view.ShapeView;
import homeWork.task_1.model.Shape;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleView implements ShapeView {

    private static Logger logger = LogManager.getLogger(TriangleView.class);


    @Override
    public void print(Shape[] shapes) {

        ShapeValidator validator = new ShapeValidator();

        for (Shape shape :
                shapes) {

            if (validator.isUniquePoints(shape)){

                if (validator.isTriangleExist(shape)){
                    logger.info(shape.toString());
                }else
                    logger.error("Треугольник " + shape + " не может существовать!");

            }else logger.error("Объект " + shape.toString() + " не является фигурой Triangle");



        }


    }

}
