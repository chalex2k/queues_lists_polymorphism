public class SimpleLinkedListStack<T> extends SimpleLinkedList<T> implements SimpleStack<T> {
    @Override
    public T push(T value) {
        this.addFirst(value);
        return value;
    }

    @Override
    public T pop() throws Exception {
        T result = this.peek();
        this.removeFirst();
        return result;
    }

    @Override
    public T peek() throws Exception {
        if (this.empty()) {
            throw new Exception("Stack is empty");
        }
        return this.getFirst();
    }

    @Override
    public int count() {
        return super.size();
    }
}
