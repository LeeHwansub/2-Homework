package chap11;

public class Container<T> {

    private T data;

    public Container() {
    }

    public Container(T data) {
        this.data = data;
    }

    public T get() {
        return data;
    }

    public void add(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Container{" +
                "data=" + data +
                '}';
    }
}


