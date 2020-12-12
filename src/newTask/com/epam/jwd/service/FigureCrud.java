package newTask.com.epam.jwd.service;

import newTask.com.epam.jwd.model.Figure;

import java.util.List;

public interface FigureCrud<T extends Figure> {

    List<T> findAll();

    void save(T figure);

}
