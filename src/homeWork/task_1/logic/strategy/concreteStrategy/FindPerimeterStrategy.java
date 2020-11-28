package homeWork.task_1.logic.strategy.concreteStrategy;

import homeWork.task_0.model.Point;
import homeWork.task_1.logic.PointLogic;
import homeWork.task_1.logic.strategy.Strategy;
import homeWork.task_1.model.Line;
import homeWork.task_1.model.Shape;
import homeWork.task_1.model.Square;
import homeWork.task_1.model.Triangle;


public class FindPerimeterStrategy implements Strategy {

    private static FindPerimeterStrategy instance;

    public static synchronized FindPerimeterStrategy getInstanceLazy() {
        if (instance == null) {
            instance = new FindPerimeterStrategy();
        }
        return instance;
    }



    private static final FindPerimeterStrategy INSTANCE = new FindPerimeterStrategy();

    public static FindPerimeterStrategy getInstanceSimple() {
        return INSTANCE;
    }

    @Override
    public double calc(Shape inputShape) {
        PointLogic logic = new PointLogic();

        double result = 0;

        if (inputShape instanceof Line){
            System.out.println("Линия не имеет периметра!");
        }

        if (inputShape instanceof Triangle) {

            Triangle triangle = (Triangle) inputShape;

            Point[] points = triangle.getPoints();

            double[] sides = {
                    logic.calculateDistanceBetweenPoints(points[0], points[1]),
                    logic.calculateDistanceBetweenPoints(points[1], points[2]),
                    logic.calculateDistanceBetweenPoints(points[2], points[0])
            };

            for (double side : sides) {
                result += side;
            }
        }

        if (inputShape instanceof Square) {

            Square square = (Square) inputShape;

            Point[] points = square.getPoints();

            double[] sides = {
                    logic.calculateDistanceBetweenPoints(points[0], points[1]),
                    logic.calculateDistanceBetweenPoints(points[1], points[2]),
                    logic.calculateDistanceBetweenPoints(points[2], points[3]),
                    logic.calculateDistanceBetweenPoints(points[3], points[0])
            };

            for (double side : sides) {
                result += side;
            }

        }

        return result;
    }
}
