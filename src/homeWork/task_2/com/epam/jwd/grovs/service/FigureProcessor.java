package homeWork.task_2.com.epam.jwd.grovs.service;

import homeWork.task_2.com.epam.jwd.grovs.exception.FigureException;
import homeWork.task_2.com.epam.jwd.grovs.model.Figure;

public interface FigureProcessor {

    Figure process(Figure figure) throws FigureException;

}
