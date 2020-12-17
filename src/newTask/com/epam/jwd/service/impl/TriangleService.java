package newTask.com.epam.jwd.service.impl;

import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.factory.FigureType;
import newTask.com.epam.jwd.model.Figure;
import newTask.com.epam.jwd.model.Point;
import newTask.com.epam.jwd.model.SimpleFigureFactory;
import newTask.com.epam.jwd.model.Triangle;
import newTask.com.epam.jwd.service.FigureCrud;
import newTask.com.epam.jwd.service.decorator.FigureFactoryDecorator;
import newTask.com.epam.jwd.service.decorator.PostProcessing;
import newTask.com.epam.jwd.service.decorator.PreProcessing;


import java.util.ArrayList;
import java.util.List;

public class TriangleService<T extends Figure> implements FigureCrud {

    private TriangleService() {
    }

    private static final TriangleService INSTANCE = new TriangleService();

    public static TriangleService getINSTANCE() {
        return INSTANCE;
    }

    private static TriangleStorage triangleStorage;


    @Override
    public Figure create(FigureType type, Point... figureConstituents) {

        FigureFactoryDecorator processing = new PreProcessing(new PostProcessing(new SimpleFigureFactory()));

        Figure figure = null;

        try {
            figure = processing.createFigure(type, figureConstituents);
        } catch (FigureException e) {
            e.printStackTrace();
        }

        return figure;
    }

    @Override
    public List findAll() {

        return triangleStorage.getTriangles();
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

    public TriangleStorage getTriangleStorage() {
        return triangleStorage;
    }

    @Override
    public String toString() {
        return "TriangleService{" +
                "triangleStorage=" + triangleStorage +
                '}';
    }
}
