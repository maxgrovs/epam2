package newTask.com.epam.jwd.service;


import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.exception.FigurePointException;
import newTask.com.epam.jwd.factory.FigureFactory;
import newTask.com.epam.jwd.factory.FigureType;
import newTask.com.epam.jwd.model.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PreProcessing extends FigureFactoryDecorator {

    public PreProcessing(FigureFactory factory) {
        super(factory);
    }

    @Override
    public Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException {

        if (checkByDuplicate(figureConstituents)) {
            return super.createFigure(type, figureConstituents);
        } else
            throw new FigurePointException("The figure has the same points!");

    }

    private boolean checkByDuplicate(Point... figureConstituents) {
        boolean result = true;

        Set<Point> points = new HashSet<>(Arrays.asList(figureConstituents));

        if (points.size() < figureConstituents.length) {
            result = false;
        }

        return result;
    }

}
