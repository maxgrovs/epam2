package lectures.udemy.lambda.syntax;

public class TransformUtils<T> {
    T transform(T t, Transformable<T> function){
        return function.transform(t);
    }
}
