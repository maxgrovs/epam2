package homeWork.task_3.com.epam.jwd.service;

import homeWork.task_3.com.epam.jwd.exception.FigureException;
import homeWork.task_3.com.epam.jwd.factory.FigureType;
import homeWork.task_3.com.epam.jwd.model.Figure;
import homeWork.task_3.com.epam.jwd.model.Point;
import homeWork.task_3.com.epam.jwd.service.impl.specification.Specification;

import java.util.List;

public interface FigureService<T extends Figure> {

    Figure create(FigureType type, Point... figureConstituents) throws FigureException;

    List<T> findAll();

    List<Figure> findBySpecification(Specification specification);

    void save(T figure);

    void delete(T figure);



}
