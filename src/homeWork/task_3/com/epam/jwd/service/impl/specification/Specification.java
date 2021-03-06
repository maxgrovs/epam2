package homeWork.task_3.com.epam.jwd.service.impl.specification;


public class Specification {

    private String findFigure;
    private String name;
    private double area;
    private double withAreaGreaterThan;


    public Specification(String findFigure, String name,  double withAreaGreaterThan) {
        this.findFigure = findFigure;
        this.name = name;
        this.withAreaGreaterThan = withAreaGreaterThan;
    }

    public String getFindFigure() {
        return findFigure;
    }

    public void setFindFigure(String findFigure) {
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

        private String figure;
        private String name;
        private double greaterThenArea;


        public Builder figure(String figure) {
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
