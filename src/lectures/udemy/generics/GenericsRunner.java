package lectures.udemy.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

    public static void main(String[] args) {

        Container<Integer> box = new Container<>(1);
        Container<String> box1 = new Container<>("1");

        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 1.2, 3.4};

        printArray(doubles);
        printArray(integers);

        ArrayList<Number> integers1 = new ArrayList<>();

        integers1.add(1);
        integers1.add(2);
        integers1.add(3);

        printElements(integers1);
    }

    public static <T> void printArray(T[] array) {
        for (T t :
                array) {
            System.out.println(t);
        }
    }

    private static <T extends Number & Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T e :
                array) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }

    private static void printElements(List<Number> numberList) {
        for (Number number : numberList) {
            System.out.println(number);
        }
    }

}
