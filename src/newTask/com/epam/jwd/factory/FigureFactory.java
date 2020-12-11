package newTask.com.epam.jwd.factory;

import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.model.Figure;
import newTask.com.epam.jwd.model.Point;

public interface FigureFactory {

    Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException;

}
