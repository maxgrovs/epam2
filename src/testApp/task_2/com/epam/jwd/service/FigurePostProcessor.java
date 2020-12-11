package testApp.task_2.com.epam.jwd.service;

import testApp.task_2.com.epam.jwd.exception.FigureException;
import testApp.task_2.com.epam.jwd.model.Figure;

public interface FigurePostProcessor {

    Figure process(Figure figure) throws FigureException;

}
