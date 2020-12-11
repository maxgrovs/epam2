package newTask.com.epam.jwd.service;


import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.model.Figure;

public interface FigurePostProcessor {

    Figure process(Figure figure) throws FigureException;

}
