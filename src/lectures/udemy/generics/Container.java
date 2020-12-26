package lectures.udemy.generics;

public class Container<T> { // T - тип который должен быть определен в процессе компиляции

    private T obj;

    public Container(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
