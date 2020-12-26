package homeWork.task_3.com.epam.jwd.service.testGeneric;

import homeWork.task_3.com.epam.jwd.model.Point;
import homeWork.task_3.com.epam.jwd.model.Square;
import homeWork.task_3.com.epam.jwd.model.Triangle;

import java.util.Arrays;

public class FigureServiceRunner {
    public static void main(String[] args) {
        FigureService service = new FigureService();

        FigureStorage<Triangle> triangles = new FigureStorage<>();
        FigureStorage<Square> squares = new FigureStorage<>();

        Triangle triangle = new Triangle(Arrays.asList
                (new Point(1, 2), new Point(2, 4), new Point(9, 3)));
        Square square = new Square(Arrays.asList
                (new Point(1, 2), new Point(2, 4), new Point(9, 3), new Point(4, 3)));

        triangles.addFigure(triangle);

        service.addFigureStorage(triangles);

        service.addToTriangles(triangles.getFigures());


    }

}
