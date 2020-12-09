package homeWork.task_2.com.epam.jwd.service;

import homeWork.task_2.com.epam.jwd.exception.FigureException;
import homeWork.task_2.com.epam.jwd.model.Figure;

public interface FigurePostProcessor {

    Figure process(Figure figure) throws FigureException;

}
