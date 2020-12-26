package homeWork.task_3.com.epam.jwd.service.testGeneric;

import homeWork.task_3.com.epam.jwd.model.Figure;

import java.util.List;

public class FigureStorage<T extends Figure> {


private List<T> figures;

    public boolean addFigure(T figure){
        return figures.add(figure);
    }

    public List<T> getFigures() {
        return figures;
    }

    public void setFigures(List<T> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "FigureStorage{" +
                "figures=" + figures +
                '}';
    }
}
