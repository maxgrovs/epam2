package newTask.com.epam.jwd.client;

import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.factory.FigureType;
import newTask.com.epam.jwd.model.Figure;
import newTask.com.epam.jwd.model.Point;
import newTask.com.epam.jwd.model.SimpleFigureFactory;
import newTask.com.epam.jwd.service.FigureFactoryDecorator;
import newTask.com.epam.jwd.service.PostProcessing;
import newTask.com.epam.jwd.service.PreProcessing;

public class FigureRunner {

    public static void main(String[] args) throws FigureException {

        FigureFactoryDecorator processing = new PreProcessing(new PostProcessing(new SimpleFigureFactory()));

        Figure figure = processing.createFigure(FigureType.TRIANGLE,
                new Point(1, 1), new Point(2, 2), new Point(3, 4));

        System.out.println(figure);


    }

}
