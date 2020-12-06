package homeWork.task_2.com.epam.jwd.grovs.service;

import homeWork.task_2.com.epam.jwd.grovs.exception.FigureException;
import homeWork.task_2.com.epam.jwd.grovs.model.Figure;

public interface FigurePostProcessor {

    Figure process(Figure figure) throws FigureException;

}
