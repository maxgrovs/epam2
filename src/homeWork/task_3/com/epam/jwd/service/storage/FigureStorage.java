package homeWork.task_3.com.epam.jwd.service.storage;

import homeWork.task_3.com.epam.jwd.model.Figure;

import java.util.List;
import java.util.Objects;

public class FigureStorage {

    private List<Figure> figures;

    public FigureStorage(List<Figure> figures) {
        this.figures = figures;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FigureStorage that = (FigureStorage) o;
        return Objects.equals(figures, that.figures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(figures);
    }

    @Override
    public String toString() {
        return "FigureStorage{" +
                "figures=" + figures +
                '}';
    }
}
