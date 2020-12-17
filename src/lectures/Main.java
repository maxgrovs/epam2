package lectures;



import homeWork.task_2.com.epam.jwd.service.impl.PostProcessor;
import newTask.com.epam.jwd.model.Figure;


import java.util.*;

public class Main {

    private static final PostProcessor POST_PROCESSOR = new PostProcessor() {

        public Figure process(Figure figure) {
            System.out.println("Post processing");
            return null;
        }
    };

    public static final Comparator<Square> SQUARE_NAME_COMPARATOR = (square1, square2) ->
            String.CASE_INSENSITIVE_ORDER.compare(square1.getName(), square2.getName());

    public static void main(String[] args) {
        List<Square> squares = new ArrayList<>();
        squares.add(new Square("Aa"));
        squares.add(new Square("aA"));
        squares.add(new Square("aa"));
        squares.add(new Square("AA"));
        squares.add(null);
        squares.add(new Square("B"));
        squares.add(new Square("b"));
        squares.add(new Square("C"));
//        squares.sort(Square::comparingByNames);
//        squares.forEach(System.out::println);
//        System.out.println(usageOfNoParamsInterfaceExample(() -> "Wow this is"));
        Optional<Square> bSquare = findSquareWithName(squares, "B");
        Optional<Square> fSquare = findSquareWithName(squares, "F");
        if (bSquare.isPresent()) {
            System.out.println(bSquare.get());
        } else {
            System.out.println("B square not found");
        }

        if (fSquare.isPresent()) {
            System.out.println(fSquare.get());
        } else {
            System.out.println("F square not found");
        }
        System.out.println(String.join(", ", "Hello world How are you".split(" ")));
    }

    private static Optional<Square> findSquareWithName(List<Square> squares, String squareName) {
        if (squareName == null || squares == null || squares.isEmpty()) {
            return Optional.empty();
        }
        return squares.stream()
                .filter(Objects::nonNull)
                .filter(square -> squareName.equals(square.getName()))
                .findFirst();
    }

   /* private static String usageOfNoParamsInterfaceExample(InterfaceWithNoParams noParams) {
        return noParams.awesomeMethodWithoutParams() + " awesome";
    }*/

    private static PostProcessor anyMethod() {
        return POST_PROCESSOR;
    }

}
