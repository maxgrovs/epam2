package homeWork.task_1.logic.strategy.concreteStrategy;

import homeWork.task_0.model.Point;
import homeWork.task_1.logic.PointLogic;
import homeWork.task_1.logic.strategy.Strategy;
import homeWork.task_1.logic.validate.ShapeValidator;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;
import homeWork.task_1.model.Triangle;

public enum  FindSquareStrategy implements Strategy {

    INSTANCE;

    @Override
    public double calc(Shape inputShape) {

        ShapeValidator validator = new ShapeValidator();
        PointLogic logic = new PointLogic();

        double result = 0;

        if (inputShape instanceof Triangle && validator.isTriangleExist(inputShape)) {

            Triangle triangle = (Triangle) inputShape;

            Point[] points = triangle.getPoints();

            double[] sides = {
                    logic.calculateDistanceBetweenPoints(points[0], points[1]),
                    logic.calculateDistanceBetweenPoints(points[1], points[2]),
                    logic.calculateDistanceBetweenPoints(points[2], points[0])
            };

            double perimeter = 0;

            for (double side : sides) {
                perimeter += side;
            }

            double semiPerimeter = perimeter / 2.0;

            result = Math.sqrt(semiPerimeter * (semiPerimeter - sides[0]) * (semiPerimeter - sides[1]) *
                    (semiPerimeter - sides[2]));

        }

        if (inputShape instanceof Square && validator.isSquare(inputShape)) {

            Square square = (Square) inputShape;


        }




            return result;
    }
}
