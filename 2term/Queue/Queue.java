package queue;

import java.util.function.Function;
import java.util.function.Predicate;

public interface Queue{
    void enqueue(Object element);
    Object dequeue();
    Object element();
    int size();
    boolean isEmpty();
    void clear();
    Queue filter(Predicate<Object> pred) throws IllegalAccessException, InstantiationException;
    Queue map(Function<Object, Object> func) throws IllegalAccessException, InstantiationException;
}

