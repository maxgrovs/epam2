package refactoring.factory;

import refactoring.model.Figure;
import refactoring.model.Point;
import refactoring.model.Triangle;

public class TriangleFactory implements Factory {

    @Override
    public Figure createFigure(Point... points) {
        return new Triangle(points[0], points[1], points[2]);
    }
}
