package refactoring.factory;

import refactoring.model.Figure;
import refactoring.model.Point;
import refactoring.model.Square;

public class SquareFactory implements Factory {

    @Override
    public Figure createFigure(Point... points) {
        return new Square(points[0], points[1], points[2], points[3]);
    }
}
