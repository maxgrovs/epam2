package testApp.service.decorator;


import testApp.exception.FigureException;
import testApp.model.Figure;
import testApp.model.Point;

public interface FigureFactory {

    <T extends Figure> T createFigure(Point... figureConstituents) throws FigureException;

}
