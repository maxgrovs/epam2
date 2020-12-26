package lectures.generics;

import homeWork.task_3.com.epam.jwd.model.Figure;
import homeWork.task_3.com.epam.jwd.model.Point;
import homeWork.task_3.com.epam.jwd.model.Triangle;

import java.util.Arrays;

public class ArraysRunner {

    public static void main(String[] args) throws StackExeption {

        ArrayStack<Integer> ints = new ArrayStack<>(20);

        ints.push(10);
        ints.push(29);

        Figure figure;
        Triangle triangle = new Triangle(Arrays.asList(new Point(1,2), new Point(2,3), new Point(6,3)));
        Triangle triangle1 = new Triangle(Arrays.asList(new Point(1,2), new Point(2,3), new Point(6,3)));


        System.out.println(triangle.getClass().equals(triangle1.getClass()));

    }

}
