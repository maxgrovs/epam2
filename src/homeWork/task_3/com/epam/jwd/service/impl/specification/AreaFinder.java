package homeWork.task_3.com.epam.jwd.service.impl.specification;

import java.util.Objects;

public class AreaFinder {

    private double minArea;
    private double maxArea;

    public AreaFinder() {
    }

    public AreaFinder(double minArea, double maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }

    public double getMinArea() {
        return minArea;
    }

    public void setMinArea(double minArea) {
        this.minArea = minArea;
    }

    public double getMaxArea() {
        return maxArea;
    }

    public void setMaxArea(double maxArea) {
        this.maxArea = maxArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AreaFinder that = (AreaFinder) o;
        return Double.compare(that.minArea, minArea) == 0 &&
                Double.compare(that.maxArea, maxArea) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minArea, maxArea);
    }

    @Override
    public String toString() {
        return "AreaFinder{" +
                "minArea=" + minArea +
                ", maxArea=" + maxArea +
                '}';
    }
}
