package refactoring.model;

import java.util.Arrays;

public class Square extends Figure {

   public Square(Point point, Point point1, Point point2, Point point3) {
        this.points = Arrays.asList(point, point1, point2, point3);
        recalculateProperties();
    }

    @Override
    protected void recalculateProperties() {

        double a = calcDistBetweenPoints(this.getPoints().get(0), this.getPoints().get(1));

        perimeter = a * 4;
        area = a * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "points=" + points +
                '}';
    }
}
