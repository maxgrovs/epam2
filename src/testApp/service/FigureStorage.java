package testApp.service;


import testApp.model.Figure;

import java.util.ArrayList;
import java.util.List;

public class FigureStorage<T extends Figure> {

    private List<T> figures = new ArrayList<>();

    private List<List<T>> storage = new ArrayList<>();

    public boolean addFigure(T figure) {
        return figures.add(figure);
    }

    public boolean addStorage(List<T> figures) {
        return storage.add(figures);
    }

    public List<List<T>> getStorage() {
        return storage;
    }


    public List<T> getFigures() {
        return figures;
    }


}
