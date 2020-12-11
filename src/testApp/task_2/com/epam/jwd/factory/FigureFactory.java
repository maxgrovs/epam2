package testApp.task_2.com.epam.jwd.factory;

import homeWork.task_0.model.Point;
import testApp.task_2.com.epam.jwd.exception.FigureException;
import testApp.task_2.com.epam.jwd.model.Figure;

public interface FigureFactory {

    Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException;

}
