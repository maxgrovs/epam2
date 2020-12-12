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

        FigureFactoryDecorator processing = new PostProcessing(new PreProcessing(new SimpleFigureFactory()));

        Figure figure = processing.createFigure(FigureType.TRIANGLE,
                new Point(1, 2), new Point(1, 2), new Point(1, 4));

        System.out.println(figure);


    }

}
