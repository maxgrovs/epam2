package testApp.app;

import testApp.model.Point;
import testApp.model.Square;
import testApp.model.Triangle;
import testApp.service.FigureStorage;


public class Main {

    public static void main(String[] args) {
        FigureStorage<Triangle> triangles = new FigureStorage();
        FigureStorage<Square> squares = new FigureStorage();

        triangles.addFigure(new Triangle(new Point(1, 2), new Point(2, 3), new Point(8, 3)));
        triangles.addFigure(new Triangle(new Point(2, 2), new Point(2, 3), new Point(8, 3)));
        triangles.addFigure(new Triangle(new Point(5, 2), new Point(2, 3), new Point(8, 3)));
        triangles.addFigure(new Triangle(new Point(7, 2), new Point(2, 3), new Point(8, 3)));

        squares.addFigure(new Square(new Point(7, 2), new Point(2, 3), new Point(8, 3), new Point(2,7)));
        squares.addFigure(new Square(new Point(72, 2), new Point(2, 3), new Point(8, 3), new Point(2,7)));
        squares.addFigure(new Square(new Point(74, 2), new Point(2, 3), new Point(8, 3), new Point(2,7)));
        squares.addFigure(new Square(new Point(722, 2), new Point(2, 3), new Point(8, 3), new Point(2,7)));

        


    }

}
