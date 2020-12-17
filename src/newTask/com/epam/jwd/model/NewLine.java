package newTask.com.epam.jwd.model;

import java.util.List;
import java.util.Objects;

public class NewLine {

    private Point a;
    private Point b;

    public NewLine(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewLine newLine = (NewLine) o;
        return Objects.equals(a, newLine.a) &&
                Objects.equals(b, newLine.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "NewLine{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
