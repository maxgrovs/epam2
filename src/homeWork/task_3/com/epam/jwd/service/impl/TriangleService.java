package homeWork.task_3.com.epam.jwd.service.impl;

import homeWork.task_3.com.epam.jwd.exception.FigureException;
import homeWork.task_3.com.epam.jwd.factory.FigureType;
import homeWork.task_3.com.epam.jwd.model.Figure;
import homeWork.task_3.com.epam.jwd.model.Point;
import homeWork.task_3.com.epam.jwd.model.Triangle;
import homeWork.task_3.com.epam.jwd.service.FigureCrud;
import homeWork.task_3.com.epam.jwd.service.decorator.FigureApplicationContext;
import homeWork.task_3.com.epam.jwd.service.decorator.FigureFactoryDecorator;
import homeWork.task_3.com.epam.jwd.service.impl.specification.Specification;
import homeWork.task_3.com.epam.jwd.service.storage.TriangleStorage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TriangleService<T extends Figure> implements FigureCrud {

    private TriangleService() {
    }

    private static final TriangleService INSTANCE = new TriangleService();

    public static TriangleService getINSTANCE() {
        return INSTANCE;
    }

    private static TriangleStorage triangleStorage;

    private final FigureFactoryDecorator factory = new FigureApplicationContext().createFactory();

    @Override
    public Figure create(FigureType type, Point... figureConstituents) {

        Figure figure = null;

        try {
            figure = factory.createFigure(type, figureConstituents);
        } catch (FigureException e) {
            e.printStackTrace();
        }

        return figure;
    }


    @Override
    public List<Triangle> findAll() {

        return triangleStorage.getTriangles();
    }

    @Override
    public List<Triangle> findBySpecification(Specification specification) {

        List<Triangle> result = triangleStorage.getTriangles().stream()
                .filter(triangle -> calcArea(triangle) > specification.getGreaterThenArea())
                .collect(Collectors.toList());

        return result;
    }


    public void printAll() {

        triangleStorage.getTriangles().forEach(System.out::println);
    }

    @Override
    public void save(Figure figure) {

        if (triangleStorage == null) {
            triangleStorage = new TriangleStorage(new ArrayList<>());
        }

        triangleStorage.getTriangles().add((Triangle) figure);
    }

    @Override
    public void delete(Figure figure) {

        List<Triangle> result = triangleStorage.getTriangles().stream()
                .filter(triangle -> !triangle.equals(figure))
                .collect(Collectors.toList());

        triangleStorage.setTriangles(result);

    }


    public TriangleStorage getTriangleStorage() {
        return triangleStorage;
    }

    @Override
    public String toString() {
        return "TriangleService{" +
                "triangleStorage=" + triangleStorage +
                '}';
    }

    public double calcArea(Triangle figure) {

        double sideA = calculateDistanceBetweenPoints(figure.getPoints().get(0), figure.getPoints().get(1));
        double sideB = calculateDistanceBetweenPoints(figure.getPoints().get(1), figure.getPoints().get(2));
        double sideC = calculateDistanceBetweenPoints(figure.getPoints().get(2), figure.getPoints().get(0));

        double semiPerimeter = (sideA + sideB + sideC) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) *
                (semiPerimeter - sideC));

    }

    private double calculateDistanceBetweenPoints(Point a, Point b) {

        double ac = Math.abs(b.getY() - a.getY());
        double cb = Math.abs(b.getX() - a.getX());

        return Math.hypot(ac, cb);
    }
}