package homeWork.task_2.com.epam.jwd.model;

import homeWork.task_0.model.Point;

import java.util.Arrays;

public class Line implements Figure {

    private Point[] points;

    Line(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Arrays.equals(points, line.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    @Override
    public String toString() {
        return "Line{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
