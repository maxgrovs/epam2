package homeWork.task_3.com.epam.jwd.service.decorator;


import homeWork.task_3.com.epam.jwd.exception.FigureException;
import homeWork.task_3.com.epam.jwd.exception.FigurePointException;
import homeWork.task_3.com.epam.jwd.factory.FigureFactory;
import homeWork.task_3.com.epam.jwd.factory.FigureType;
import homeWork.task_3.com.epam.jwd.model.Figure;
import homeWork.task_3.com.epam.jwd.model.Point;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PreProcessing extends FigureFactoryDecorator {

    public PreProcessing(FigureFactory factory) {
        super(factory);
    }

    @Override
    public Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException {

       // System.out.println("Running preProcessing!");

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
