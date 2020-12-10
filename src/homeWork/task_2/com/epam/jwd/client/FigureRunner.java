package homeWork.task_2.com.epam.jwd.client;

import homeWork.task_0.model.Point;
import homeWork.task_2.com.epam.jwd.decoratorrrrrrrr.PostProcessing;
import homeWork.task_2.com.epam.jwd.decoratorrrrrrrr.PreProcessing;
import homeWork.task_2.com.epam.jwd.exception.FigureException;
import homeWork.task_2.com.epam.jwd.factoryyyyyyyy.FigureType;
import homeWork.task_2.com.epam.jwd.model.Figure;
import homeWork.task_2.com.epam.jwd.model.SimpleFigureFactory;

public class FigureRunner {

    public static void main(String[] args) {

        // FigureFactory factory = FigureFactory.getInstance();

        // Figure figure = factory.createFigure(new Point(1, 0), new Point(0, 1), new Point(1, 0));

        PostProcessing postProcessing = new PostProcessing(new PreProcessing(new SimpleFigureFactory()));

        Figure figure = null;

        try {
            figure = postProcessing.process(postProcessing.createFigure(FigureType.LINE,
                    new Point(1, 2), new Point(1, 2)));



        } catch (FigureException e) {

            e.printStackTrace();
        }

        System.out.println(figure);

    }

}
