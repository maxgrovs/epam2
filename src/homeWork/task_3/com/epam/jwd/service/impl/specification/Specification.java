package homeWork.task_3.com.epam.jwd.service.impl.specification;

import homeWork.task_3.com.epam.jwd.factory.FigureType;

import java.util.Objects;

public class Specification {

    private FigureType figure;
    private String name;
    private double area;
    private double greaterThenArea;


    public Specification() {
    }

    public Specification(FigureType figure, String name, double area, double greaterThenArea) {
        this.figure = figure;
        this.name = name;
        this.area = area;
        this.greaterThenArea = greaterThenArea;
    }

    public FigureType getFigure() {
        return figure;
    }

    public void setFigure(FigureType figure) {
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGreaterThenArea() {
        return greaterThenArea;
    }

    public void setGreaterThenArea(double greaterThenArea) {
        this.greaterThenArea = greaterThenArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specification that = (Specification) o;
        return Double.compare(that.area, area) == 0 &&
                Double.compare(that.greaterThenArea, greaterThenArea) == 0 &&
                figure == that.figure &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(figure, name, area, greaterThenArea);
    }

    @Override
    public String toString() {
        return "Specification{" +
                "figure=" + figure +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", greaterThenArea=" + greaterThenArea +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private FigureType figure;
        private String name;
        private double area;
        private double greaterThenArea;


        public Builder figure(FigureType figure) {
            this.figure = figure;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder areaFinder(double area) {
            this.area = area;
            return this;
        }

        public Builder greaterThenArea(double greaterThenArea) {
            this.greaterThenArea = greaterThenArea;
            return this;
        }

        public Specification build() {

            return new Specification(this.figure, this.name, this.area, this.greaterThenArea);
        }

    }
}
