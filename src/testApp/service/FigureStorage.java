package testApp.service;


import testApp.model.Figure;

import java.util.ArrayList;
import java.util.List;

public class FigureStorage<T extends Figure> {

private List<T> figures = new ArrayList<>();

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
