package homeWork.task_2.com.epam.jwd.decoratorrrrrrrr;

import homeWork.task_0.model.Point;
import homeWork.task_2.com.epam.jwd.exception.FigureException;
import homeWork.task_2.com.epam.jwd.factoryyyyyyyy.FigureFactory;
import homeWork.task_2.com.epam.jwd.factoryyyyyyyy.FigureType;
import homeWork.task_2.com.epam.jwd.model.Figure;

public class FigureFactoryDecorator implements FigureFactory {

    private FigureFactory factory;

    public FigureFactoryDecorator(FigureFactory factory) {
        this.factory = factory;
    }

    @Override
    public Figure createFigure(FigureType type, Point[] figureConstituents) throws FigureException {

        return factory.createFigure(type, figureConstituents);
    }
}
