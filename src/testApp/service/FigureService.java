package testApp.service;


import testApp.exception.FigureException;
import testApp.model.Figure;
import testApp.model.Point;
import testApp.service.decorator.impl.FigureApplicationContext;
import testApp.service.decorator.impl.FigureFactoryDecorator;

import java.util.ArrayList;
import java.util.List;


public class FigureService {

    private final FigureFactoryDecorator factory = new FigureApplicationContext().createFactory();

    //----------------------
    private final List<FigureStorage> storage = new ArrayList<>();
    private final List<Figure> figures = new ArrayList<>();

    public <T extends Figure> void addFigureStorage(FigureStorage<T> storage) {
        this.storage.add(storage);
        List<T> figureList = storage.getFigures();
        this.figures.addAll(figureList);
    }

    public List<Figure> getFigures() {
        return figures;
    }

    //--------------------------
    public<T extends Figure> T create(Point... figureConstituents) {

        T figure = null;

        try {
            figure = factory.createFigure(figureConstituents);
        } catch (FigureException e) {
            e.printStackTrace();
        }

        return figure;
    }
}
