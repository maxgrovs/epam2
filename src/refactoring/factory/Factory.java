package refactoring.factory;

import refactoring.model.Figure;
import refactoring.model.Point;

public interface Factory {

    Figure createFigure(Point... points);

}
