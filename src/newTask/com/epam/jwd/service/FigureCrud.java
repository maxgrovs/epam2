package newTask.com.epam.jwd.service;

import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.factory.FigureType;
import newTask.com.epam.jwd.model.Figure;
import newTask.com.epam.jwd.model.Point;

import java.util.List;

public interface FigureCrud<T extends Figure> {

    Figure create(FigureType type, Point... figureConstituents) throws FigureException;

    List<T> findAll();

    void save(T figure);

    void delete(T figure);
}
