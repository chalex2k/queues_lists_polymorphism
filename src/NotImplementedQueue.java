import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/*
Интерфейс с пустой реализацией всех требуемых методов Queue.
Чтобы можно было не реализовывать методы в классе, которые мы не будем использовать.
 */
public interface NotImplementedQueue<T> extends Queue<T> {
    @Override
    public default int size() {
        return 0;
    }

    @Override
    public default boolean isEmpty() {
        return false;
    }

    @Override
    public default boolean contains(Object o) {
        return false;
    }

    @Override
    public default Iterator iterator() {
        return null;
    }

    @Override
    public default Object[] toArray() {
        return new Object[0];
    }

    @Override
    public default Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public default boolean add(T o) {
        return false;
    }

    @Override
    public default boolean remove(Object o) {
        return false;
    }

    @Override
    public default boolean addAll(Collection c) {
        return false;
    }

    @Override
    public default void clear() {

    }

    @Override
    public default boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public default boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public default boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public default boolean offer(Object o) {
        return false;
    }

    @Override
    public default T remove() {
        return null;
    }

    @Override
    public default T poll() {
        return null;
    }

    @Override
    public default T element() {
        return null;
    }

    @Override
    public default T peek() {
        return null;
    }

    int count();
}
