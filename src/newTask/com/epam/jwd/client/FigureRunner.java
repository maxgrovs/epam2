package newTask.com.epam.jwd.client;

import newTask.com.epam.jwd.exception.FigureException;
import newTask.com.epam.jwd.model.Figure;
import newTask.com.epam.jwd.model.Point;
import newTask.com.epam.jwd.model.Triangle;
import newTask.com.epam.jwd.service.impl.TriangleService;

import java.util.Optional;

import static newTask.com.epam.jwd.factory.FigureType.TRIANGLE;

public class FigureRunner {

    public static void main(String[] args) throws FigureException {

        TriangleService triangleService = TriangleService.getINSTANCE();

        Figure figure = triangleService.create(TRIANGLE,
                new Point(1, 1), new Point(1, 2), new Point(3, 3));
        Figure figure1 = triangleService.create(TRIANGLE,
                new Point(1, 3), new Point(1, 2), new Point(3, 3));

       // System.out.println(figure);


        triangleService.save(figure);
        triangleService.save(figure1);
        triangleService.save(figure1);


       // System.out.println(triangleService.findAll());

        triangleService.printAll();


    }

}
