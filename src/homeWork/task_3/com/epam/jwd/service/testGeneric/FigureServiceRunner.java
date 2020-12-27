package homeWork.task_3.com.epam.jwd.service.testGeneric;

import homeWork.task_3.com.epam.jwd.model.Figure;
import homeWork.task_3.com.epam.jwd.model.Point;
import homeWork.task_3.com.epam.jwd.model.Square;
import homeWork.task_3.com.epam.jwd.model.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface ElementProcessor<T extends Triangle> {
    double process(T element);
}

public class FigureServiceRunner {
    public static void main(String[] args) {
        FigureService service = new FigureService();

        FigureStorage<Triangle> triangles = new FigureStorage<>();
        FigureStorage<Square> squares = new FigureStorage<>();

        FigureStorage<Figure> figures = new FigureStorage<>();

        Triangle triangle =
                new Triangle(Arrays.asList(new Point(1, 2), new Point(2, 4), new Point(9, 3)));
        Triangle triangle1 =
                new Triangle(Arrays.asList(new Point(20, 2), new Point(2, 4), new Point(9, 3)));
        Triangle triangle2 =
                new Triangle(Arrays.asList(new Point(30, 2), new Point(2, 4), new Point(9, 3)));
        Triangle triangle3 =
                new Triangle(Arrays.asList(new Point(40, 2), new Point(2, 4), new Point(9, 3)));
        Triangle triangle4 =
                new Triangle(Arrays.asList(new Point(50, 2), new Point(2, 4), new Point(9, 3)));

        Square square =
                new Square(Arrays.asList(new Point(1, 2), new Point(2, 4), new Point(9, 3), new Point(4, 3)));
        Square square1 =
                new Square(Arrays.asList(new Point(13, 2), new Point(2, 4), new Point(9, 3), new Point(4, 3)));
        Square square2 =
                new Square(Arrays.asList(new Point(120, 2), new Point(2, 4), new Point(9, 3), new Point(4, 3)));

        triangles.addFigure(triangle);
        triangles.addFigure(triangle1);
        triangles.addFigure(triangle2);
        triangles.addFigure(triangle3);
        triangles.addFigure(triangle4);

        squares.addFigure(square);
        squares.addFigure(square1);
        squares.addFigure(square2);
        squares.addFigure(square2);




        //System.out.println(service.calcTrianglesArea(triangle4));

        // processElement(triangles.getFigures(), element -> service.calcTrianglesArea(element));

        service.addFigureStorage(triangles);
        service.addFigureStorage(squares);

         /*service.getStorages().stream()
                 .filter(figureStorage -> figureStorage.getFigures().getClass().equals(List<>))*/

        System.out.println(service.getStorages().get(0).getFigures().getClass());

    }


    private static <T> T findMatch(List<T> list, Predicate<T> function) {
        for (T t : list) {
            if (function.test(t)) {
                return t;
            }
        }
        return null;
    }

    private static <T extends Triangle> void processElement(List<T> tList, ElementProcessor function) {
        List<Double> doubleList = new ArrayList<>();
        for (T figure : tList) {
            doubleList.add(function.process(figure));
        }
        System.out.println(doubleList);
    }
}
