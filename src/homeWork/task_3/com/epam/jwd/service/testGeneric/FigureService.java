package homeWork.task_3.com.epam.jwd.service.testGeneric;

import homeWork.task_3.com.epam.jwd.model.Figure;
import homeWork.task_3.com.epam.jwd.model.Point;
import homeWork.task_3.com.epam.jwd.model.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class FigureService {

    private List<FigureStorage> storages = new ArrayList<>();
    private List<Figure> figures = new ArrayList<>();

    public <T extends Figure> void addFigureStorage(FigureStorage<T> storage) {
        storages.add(storage);
        List<T> figureList = storage.getFigures();
        this.figures.addAll(figureList);
    }

    public void addToTriangles(List<? super Triangle> list) {
        list.add(new Triangle(Arrays.asList(new Point(1, 2), new Point(2, 4), new Point(9, 3))));
    }

    public<T extends Triangle> double calcTrianglesArea(T figure) {

        Triangle triangle = (Triangle) figure;

        double sideA = calcDistBetweenPoints(triangle.getPoints().get(0), triangle.getPoints().get(1));
        double sideB = calcDistBetweenPoints(triangle.getPoints().get(1), triangle.getPoints().get(2));
        double sideC = calcDistBetweenPoints(triangle.getPoints().get(2), triangle.getPoints().get(0));

        double semiPerimeter = (sideA + sideB + sideC) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) *
                (semiPerimeter - sideC));
    }


    private double calcDistBetweenPoints(Point a, Point b) {

        double ac = Math.abs(b.getY() - a.getY());
        double cb = Math.abs(b.getX() - a.getX());

        return Math.hypot(ac, cb);
    }

    public List<FigureStorage> getStorages() {
        return storages;
    }

    public void setStorages(List<FigureStorage> storages) {
        this.storages = storages;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}
