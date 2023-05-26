public class SimpleLinkedListQueue<T> extends SimpleLinkedList<T> implements NotImplementedQueue<T> {
    @Override
    public boolean add(T value) {
        this.addLast(value);
        return false;
    }

    @Override
    public T remove() {
        T result = null;
        try {
            result = this.getFirst();
        } catch (SimpleLinkedListException e) {
            throw new RuntimeException(e);
        }
        try {
            this.removeFirst();
        } catch (SimpleLinkedListException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


    @Override
    public T peek() {
        if (this.size() == 0) {
            throw new RuntimeException();
        }
        try {
            return this.getFirst();
        } catch (SimpleLinkedListException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int count() {
        return super.size();
    }

}