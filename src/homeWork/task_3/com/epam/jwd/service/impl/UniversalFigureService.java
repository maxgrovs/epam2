package homeWork.task_3.com.epam.jwd.service.impl;

import homeWork.task_3.com.epam.jwd.exception.FigureException;
import homeWork.task_3.com.epam.jwd.factory.FigureType;
import homeWork.task_3.com.epam.jwd.model.Figure;
import homeWork.task_3.com.epam.jwd.model.Point;
import homeWork.task_3.com.epam.jwd.model.Triangle;
import homeWork.task_3.com.epam.jwd.service.FigureService;
import homeWork.task_3.com.epam.jwd.service.decorator.FigureApplicationContext;
import homeWork.task_3.com.epam.jwd.service.decorator.FigureFactoryDecorator;
import homeWork.task_3.com.epam.jwd.service.impl.specification.Specification;
import homeWork.task_3.com.epam.jwd.service.storage.FigureStorage;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniversalFigureService<T extends Figure> implements FigureService<T> {

    private static FigureStorage storage;

    private final FigureFactoryDecorator factory = new FigureApplicationContext().createFactory();


    private UniversalFigureService() {
    }

    private static final UniversalFigureService INSTANCE = new UniversalFigureService();

    public static UniversalFigureService getINSTANCE() {
        return INSTANCE;
    }


    @Override
    public Figure create(FigureType type, Point... figureConstituents) throws FigureException {

        Figure figure = null;

        try {
            figure = factory.createFigure(type, figureConstituents);
        } catch (FigureException e) {
            e.printStackTrace();
        }

        return figure;
    }

    @Override
    public void save(Figure figure) {

        if (storage == null) {
            storage = new FigureStorage(new ArrayList<>());
        }

        storage.getFigures().add(figure);

    }


    @Override
    public List<T> findAll() {

        return null;
    }

    @Override
    public List<T> findBySpecification(Specification specification) {
        return null;
    }

    /*@Override
    public List<Figure> findBySpecification(Specification specification) {

        return   storage.getFigures().stream()
                .filter(figure -> figure.getClass().equals(specification.getClass()))
                .filter(figure -> calcArea(figure) > specification.getWithAreaGreaterThan())
                .collect(Collectors.toList());


    }*/



    @Override
    public void delete(T figure) {

        List<Figure> result = storage.getFigures().stream()
                .filter(figure1 -> !figure1.equals(figure))
                .collect(Collectors.toList());

       storage.setFigures(result);

    }

    public double calcArea(Figure figure) {



        /*double sideA = calculateDistanceBetweenPoints(figure.getPoints().get(0), figure.getPoints().get(1));
        double sideB = calculateDistanceBetweenPoints(figure.getPoints().get(1), figure.getPoints().get(2));
        double sideC = calculateDistanceBetweenPoints(figure.getPoints().get(2), figure.getPoints().get(0));

        double semiPerimeter = (sideA + sideB + sideC) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) *
                (semiPerimeter - sideC));*/

        return 0;
    }

    private double calculateDistanceBetweenPoints(Point a, Point b) {

        double ac = Math.abs(b.getY() - a.getY());
        double cb = Math.abs(b.getX() - a.getX());

        return Math.hypot(ac, cb);
    }
}
