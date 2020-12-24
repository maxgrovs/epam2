package lectures.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayStack<E> implements Stack<E> {

    private Object[] objects;
    private int capacity;
    private int size;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        size = 0;
        objects = new Object[capacity];
    }

    //---------------------
    public static void main(String[] args) throws StackExeption {

        ArrayStack<Integer> ints = new ArrayStack<>(20);
        ArrayStack<Number> nums1 = new ArrayStack<>(20);

        ints.push(10);
        ints.push(29);

        List<Number> nums = new ArrayList<>();
        List<Integer> ints1 = Arrays.asList(1, 2);

        // stack -> collection
        ints.popAll(nums);

        // collection -> stack
        nums1.pushAll(ints1);

    }

    //---------------------
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
        return size == capacity;
    }

    @Override
    public void pushAll(Collection<? extends E> src) throws StackExeption {

    }

    @Override
    public void popAll(Collection<? super E> dst) throws StackExeption {

    }
}
