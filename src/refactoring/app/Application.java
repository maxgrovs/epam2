package refactoring.app;

import refactoring.factory.Factory;
import refactoring.model.Figure;

public class Application {

    private Figure figure;

    public Application(Factory factory){
        figure = factory.createFigure();
    }

    public void getPoints(){

        figure.getPoints();
    }

}
