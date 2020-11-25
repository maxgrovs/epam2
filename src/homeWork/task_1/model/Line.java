package homeWork.task_1.model;

import homeWork.task_0.model.Point;

import java.util.Arrays;

public class Line implements Shape {

    private Point [] points;

    public Line(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Line{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
