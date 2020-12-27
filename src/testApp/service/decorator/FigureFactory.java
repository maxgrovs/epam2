package testApp.service.decorator;


import testApp.exception.FigureException;
import testApp.model.Figure;
import testApp.model.Point;

public interface FigureFactory {

    Figure createFigure(Point... figureConstituents) throws FigureException;

}
