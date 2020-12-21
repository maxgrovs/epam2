package homeWork.task_3.com.epam.jwd.service.impl.specification;

import homeWork.task_3.com.epam.jwd.factory.FigureType;

import java.util.Objects;

public class Specification {

    private FigureType findFigure;
    private String name;
    private double area;
    private double withAreaGreaterThan;


    public Specification(FigureType findFigure, String name,  double withAreaGreaterThan) {
        this.findFigure = findFigure;
        this.name = name;
        this.withAreaGreaterThan = withAreaGreaterThan;
    }

    public FigureType getFindFigure() {
        return findFigure;
    }

    public void setFindFigure(FigureType findFigure) {
        this.findFigure = findFigure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWithAreaGreaterThan() {
        return withAreaGreaterThan;
    }

    public void setWithAreaGreaterThan(double withAreaGreaterThan) {
        this.withAreaGreaterThan = withAreaGreaterThan;
    }



    public static Builder builder() {
        return new Builder();
    }



    public static class Builder {

        private FigureType figure;
        private String name;
        private double greaterThenArea;


        public Builder figure(FigureType figure) {
            this.figure = figure;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public Builder greaterThenArea(double greaterThenArea) {
            this.greaterThenArea = greaterThenArea;
            return this;
        }

        public Specification build() {

            return new Specification(this.figure, this.name,  this.greaterThenArea);
        }

    }
}
