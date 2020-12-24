package lectures.generics;

import java.util.Collection;

public interface Stack<E> {

    void push(E element) throws StackExeption;

    E pop() throws StackExeption;

    E peek(); //берет верхний элемент но не удаляет

    int getSize();

    boolean isEmpty();

    boolean isFull();

    void pushAll(Collection<? extends E> src) throws StackExeption; //сложить в стек все что у нас в коллекции src

    void popAll(Collection<? super E> dst) throws StackExeption;// все элементы коллекции стек переложить в dst

}
