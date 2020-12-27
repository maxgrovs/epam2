package testApp.service.decorator.impl;


import testApp.exception.FigureException;
import testApp.model.Figure;
import testApp.model.Point;
import testApp.service.decorator.FigureFactory;

public class FigureFactoryDecorator implements FigureFactory{

    private final FigureFactory factory;

    public FigureFactoryDecorator(FigureFactory factory) {
        this.factory = factory;
    }

    @Override
    public <T extends Figure> T createFigure(Point... figureConstituents) throws FigureException {

        return factory.createFigure(figureConstituents);
    }
}
