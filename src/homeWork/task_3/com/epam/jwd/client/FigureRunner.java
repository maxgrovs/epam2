package homeWork.task_3.com.epam.jwd.client;

import homeWork.task_3.com.epam.jwd.exception.FigureException;
import homeWork.task_3.com.epam.jwd.factory.FigureType;
import homeWork.task_3.com.epam.jwd.model.Figure;
import homeWork.task_3.com.epam.jwd.model.Point;
import homeWork.task_3.com.epam.jwd.model.Triangle;
import homeWork.task_3.com.epam.jwd.service.impl.TriangleService;
import homeWork.task_3.com.epam.jwd.service.impl.specification.Specification;

import java.util.List;

import static homeWork.task_3.com.epam.jwd.factory.FigureType.TRIANGLE;

public class FigureRunner {

    public static void main(String[] args) throws FigureException {

        TriangleService triangleService = TriangleService.getINSTANCE();

        Figure figure = triangleService.create(TRIANGLE,
                new Point(10, 10), new Point(10, 20), new Point(30, 30));
        Figure figure1 = triangleService.create(TRIANGLE,
                new Point(40, 30), new Point(10, 20), new Point(30, 30));

        // triangleService.save(figure);
        // triangleService.save(figure1);
        // triangleService.save(figure1);

        // triangleService.delete(figure1);

        //  triangleService.printAll();

        //  System.out.println(triangleService.calcArea((Triangle) figure1));

        Specification specification = Specification.builder().greaterThenArea(50).build();

        List<Triangle> list = triangleService.findBySpecification(specification);

        System.out.println(list);

        Class<Triangle> triangleClass = Triangle.class;
    }

}
