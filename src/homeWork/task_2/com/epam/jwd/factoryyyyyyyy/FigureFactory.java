package homeWork.task_2.com.epam.jwd.factoryyyyyyyy;

import homeWork.task_0.model.Point;
import homeWork.task_2.com.epam.jwd.exception.FigureException;
import homeWork.task_2.com.epam.jwd.model.Figure;

public interface FigureFactory {

    Figure createFigure(FigureType type, Point... figureConstituents) throws FigureException;

}
