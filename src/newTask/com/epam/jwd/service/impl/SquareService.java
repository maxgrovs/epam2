package newTask.com.epam.jwd.service.impl;

import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.factory.FigureType;
import newTask.com.epam.jwd.model.Figure;
import newTask.com.epam.jwd.model.Point;
import newTask.com.epam.jwd.service.FigureCrud;

import java.util.List;

public class SquareService<Square> implements FigureCrud {

    @Override
    public Figure create(FigureType type, Point... figureConstituents) throws FigureException {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void save(Figure figure) {

    }

    @Override
    public void delete(Figure figure) {
    }
}
