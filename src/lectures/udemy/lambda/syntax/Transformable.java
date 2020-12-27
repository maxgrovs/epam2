package lectures.udemy.lambda.syntax;

@FunctionalInterface
public interface Transformable<T> {
    T transform(T t);
}
