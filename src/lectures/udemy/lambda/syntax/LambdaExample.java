package lectures.udemy.lambda.syntax;


import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface ElementProcessor<T extends Number> {
    double process(T element);
}

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(12);
        integers.add(2);
        integers.add(4);
        integers.add(5);
        List<Double> doubles = new ArrayList<>();
        doubles.add(2.4);
        doubles.add(23.4);
        doubles.add(7.4);
        doubles.add(3.4);
        doubles.add(8.4);

        processElement(integers, x -> Math.sin(x.doubleValue()));
    }


    private static <T extends Number> void processElement(List<T> tList, ElementProcessor function) {
        List<Double> doubleList = new ArrayList<>();
        for (Number number : tList) {
            doubleList.add(function.process(number));
        }
        System.out.println(doubleList);
    }

    private static double multiply(int x, int y) {
        return x * y / 10.0;
    }
}
