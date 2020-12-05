package homeWork.task_2.com.epam.jwd.grovs.model;

import homeWork.task_0.model.Point;

import java.util.Arrays;

public class Square implements Figure {

    private Point[] points;

    Square(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Arrays.equals(points, square.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    @Override
    public String toString() {
        return "Square{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}