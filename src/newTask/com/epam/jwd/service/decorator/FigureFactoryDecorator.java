package newTask.com.epam.jwd.service.decorator;


import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.factory.FigureFactory;
import newTask.com.epam.jwd.factory.FigureType;
import newTask.com.epam.jwd.model.Figure;
import newTask.com.epam.jwd.model.Point;

public class FigureFactoryDecorator implements FigureFactory {

    private FigureFactory factory;

    public FigureFactoryDecorator(FigureFactory factory) {
        this.factory = factory;
    }

    @Override
    public Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException {

        return factory.createFigure(type, figureConstituents);
    }
}
