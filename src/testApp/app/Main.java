package testApp.app;


import testApp.model.Figure;
import testApp.model.Point;
import testApp.model.Square;
import testApp.model.Triangle;
import testApp.service.FigureService;
import testApp.service.FigureStorage;
import testApp.service.Specification;


public class Main {

    public static void main(String[] args) {
        FigureStorage<Triangle> triangles = new FigureStorage<>();
        FigureStorage<Square> squares = new FigureStorage<>();

        FigureService service = new FigureService();

        triangles.addFigure(new Triangle(new Point(1, 2), new Point(2, 3), new Point(8, 3)));
        triangles.addFigure(new Triangle(new Point(2, 2), new Point(2, 3), new Point(8, 3)));
        triangles.addFigure(new Triangle(new Point(5, 2), new Point(2, 3), new Point(8, 3)));
        triangles.addFigure(new Triangle(new Point(7, 2), new Point(2, 3), new Point(8, 3)));

        squares.addFigure(new Square(new Point(7, 2), new Point(2, 3), new Point(8, 3), new Point(2, 7)));
        squares.addFigure(new Square(new Point(72, 2), new Point(2, 3), new Point(8, 3), new Point(2, 7)));
        squares.addFigure(new Square(new Point(74, 2), new Point(2, 3), new Point(8, 3), new Point(2, 7)));
        squares.addFigure(new Square(new Point(0, 2), new Point(2, 3), new Point(8, 3), new Point(2, 7)));

        Figure figure = service.create(new Point(1, 2), new Point(3, 4), new Point(5, 3));

        triangles.addFigure(figure);

        service.addFigureStorage(squares);
        service.addFigureStorage(triangles);

      //  service.getFigures().stream().forEach(System.out::println);

      /*  squares.getFigures().stream()
                .filter(square -> square.getClass().getSimpleName().equals("Square"))
                .map(square -> square.getClass().getSimpleName())
                .forEach(System.out::println);*/

        Specification specification = Specification.builder().findFigure("Triangle").greaterThenArea(1).build();


    }

}
