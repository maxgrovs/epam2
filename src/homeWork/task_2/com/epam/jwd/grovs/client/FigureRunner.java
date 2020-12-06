package homeWork.task_2.com.epam.jwd.grovs.client;

import homeWork.task_0.model.Point;
import homeWork.task_2.com.epam.jwd.grovs.model.Figure;
import homeWork.task_2.com.epam.jwd.grovs.model.FigureFactory;

public class FigureRunner {

    public static void main(String[] args) {

        FigureFactory factory = FigureFactory.getInstance();

        Figure figure = factory.createFigure(new Point(1, 2), new Point(1, 2));

        System.out.println(figure);
    }

}
