package lectures.generics;

import java.util.Collection;

public class ArrayStack<E> implements Stack<E> {

    private Object[] objects;
    private int capacity;
    private int size;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        size = 0;
        objects = new Object[capacity];
    }

    @Override
    public void push(E element) throws StackExeption {
        if (isFull()) {
            throw new StackExeption("Stack overflow");
        }
        objects[size] = element;
        size++;
    }

    @Override
    public E pop() throws StackExeption {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void pushAll(Collection<E> src) throws StackExeption {

    }

    @Override
    public void popAll(Collection<E> dst) throws StackExeption {

    }
}
