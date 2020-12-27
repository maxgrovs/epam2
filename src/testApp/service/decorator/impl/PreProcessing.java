package testApp.service.decorator.impl;


import testApp.exception.FigureException;
import testApp.exception.FigurePointException;
import testApp.model.Figure;
import testApp.model.Point;
import testApp.service.decorator.FigureFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PreProcessing extends FigureFactoryDecorator {

    public PreProcessing(FigureFactory factory) {
        super(factory);
    }

    @Override
    public Figure createFigure(Point... figureConstituents) throws FigureException {

       // System.out.println("Running preProcessing!");

        if (checkByDuplicate(figureConstituents)) {
            return super.createFigure(figureConstituents);
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
