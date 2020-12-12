package newTask.com.epam.jwd.client;

import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.model.Point;
import newTask.com.epam.jwd.model.SimpleFigureFactory;
import newTask.com.epam.jwd.service.decorator.FigureFactoryDecorator;
import newTask.com.epam.jwd.service.decorator.PostProcessing;
import newTask.com.epam.jwd.service.decorator.PreProcessing;

import static newTask.com.epam.jwd.factory.FigureType.TRIANGLE;

public class FigureRunner {

    public static void main(String[] args) throws FigureException {

        FigureFactoryDecorator processing = new PreProcessing(new PostProcessing(new SimpleFigureFactory()));

        processing.createFigure(TRIANGLE, new Point(1, 1), new Point(2, 2), new Point(3, 4));


    }

}
