public class SimpleLinkedListQueue2<T> implements NotImplementedQueue<T> {

    private class SimpleLinkedListNode {
        public T value;
        public SimpleLinkedListNode next;

        public SimpleLinkedListNode(T value, SimpleLinkedListNode next) {
            this.value = value;
            this.next = next;
        }

        public SimpleLinkedListNode(T value) {
            this(value, null);
        }
    }

    private SimpleLinkedListNode head = null;  // first, top
    private SimpleLinkedListNode tail = null;  // last
    private int count = 0;

    @Override
    public boolean add(T value) {
        if (count == 0) {
            head = tail = new SimpleLinkedListNode(value);
        } else {
            tail.next = new SimpleLinkedListNode(value);
            tail = tail.next;
        }
        count++;
        return false;
    }

    @Override
    public T remove() {
        T result = element();
        head = head.next;
        count--;
        if (count == 0) {
            tail = null;
        }
        return result;
    }

    @Override
    public T element() {
        if (count() == 0) {
            throw new RuntimeException("Queue is empty");
        }
        return head.value;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public T peek() {
        try {
            return element();
        } catch (RuntimeException ignored) {
            return null;
        }
    }
}
