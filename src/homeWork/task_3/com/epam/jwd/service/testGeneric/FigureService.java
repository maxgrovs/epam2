package homeWork.task_3.com.epam.jwd.service.testGeneric;

import homeWork.task_3.com.epam.jwd.model.Figure;
import homeWork.task_3.com.epam.jwd.model.Point;
import homeWork.task_3.com.epam.jwd.model.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FigureService {

    private List<FigureStorage> storages = new ArrayList<>();
    private List<Figure> figures = new ArrayList<>();

    public <T extends Figure> void addFigureStorage(FigureStorage<T> storage) {
        storages.add(storage);
        List<T> figureList = storage.getFigures();
        this.figures.addAll(figureList);
    }

    public void addToTriangles(List<? super Triangle> list){
        list.add(new Triangle(Arrays.asList(new Point(1,2), new Point(2,4), new Point(9,3))));
    }

}
