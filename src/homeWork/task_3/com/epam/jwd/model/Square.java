package homeWork.task_3.com.epam.jwd.model;

import java.util.List;
import java.util.Objects;

public class Square implements Figure {

    private List<Point> points;

    public Square(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(points, square.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public String toString() {
        return "Square{" +
                "points=" + points +
                '}';
    }

}
