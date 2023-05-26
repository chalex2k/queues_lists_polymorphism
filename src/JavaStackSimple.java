import java.util.EmptyStackException;
import java.util.Stack;

public class JavaStackSimple<T> extends Stack<T> implements SimpleStack<T> {
//    @Override
//    public T push(T value) {
//        return super.push(value);
//    }

    @Override
    public int count() {
        return super.size();
    }

//    public T pop() throws EmptyStackException {
//        return super.pop();
//    }
//
//    public T peek() throws EmptyStackException {
//        return super.peek();
//    }

}
