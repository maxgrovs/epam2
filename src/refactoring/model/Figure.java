package refactoring.model;

import java.util.List;

public abstract class Figure {

    protected double area;
    protected double perimeter;

    protected List<Point> points;

    public Figure() {
    }

    public List<Point> getPoints() {
        return points;
    }

    protected abstract void recalculateProperties();

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    protected double calcDistBetweenPoints(Point a, Point b) {

        double ac = Math.abs(b.getY() - a.getY());
        double cb = Math.abs(b.getX() - a.getX());

        return Math.hypot(ac, cb);
    }

}
