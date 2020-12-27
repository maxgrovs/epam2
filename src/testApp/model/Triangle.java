package testApp.model;

import java.util.Arrays;

public class Triangle extends Figure {

   public Triangle(Point point, Point point1, Point point2) {
        this.points = Arrays.asList(point, point1, point2);

        recalculateProperties();
    }

    @Override
    protected void recalculateProperties() {

        double a = calcDistBetweenPoints(this.getPoints().get(0), this.getPoints().get(1));
        double b = calcDistBetweenPoints(this.getPoints().get(1), this.getPoints().get(2));
        double c = calcDistBetweenPoints(this.getPoints().get(2), this.getPoints().get(0));

        perimeter = a + b + c;

        final double p = perimeter / 2.0;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "points=" + points +
                '}';
    }
}
