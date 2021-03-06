package homeWork.task_3.com.epam.jwd.client;

import homeWork.task_3.com.epam.jwd.exception.FigureException;
import homeWork.task_3.com.epam.jwd.model.Figure;
import homeWork.task_3.com.epam.jwd.model.Point;
import homeWork.task_3.com.epam.jwd.service.impl.UniversalFigureService;
import homeWork.task_3.com.epam.jwd.service.impl.specification.Specification;

import java.util.List;

import static homeWork.task_3.com.epam.jwd.factory.FigureType.TRIANGLE;

public class FigureRunner {

    public FigureRunner(double calcArea) {

    }

    public static void main(String[] args) throws FigureException {

        UniversalFigureService service = UniversalFigureService.getINSTANCE();


        Figure figure = service.create(TRIANGLE,
                new Point(10, 10), new Point(10, 20), new Point(30, 30));
        Figure figure1 = service.create(TRIANGLE,
                new Point(40, 30), new Point(10, 20), new Point(30, 30));

        service.save(figure);
        service.save(figure1);
        service.save(figure1);

        // triangleService.delete(figure1);


        Specification specification = Specification.builder().figure("Triangle").greaterThenArea(1).build();

        List bySpecification = service.findBySpecification(specification);

         System.out.println(bySpecification);

        //System.out.println(service.calcArea(figure));

    }


}
