import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    /*
    Метод который работает с Queue. Queue - это интерфейс. Объект какого именно класса будет передан метод не знает.
    Он будет работать с любым объектом который реализует интерфейс Queue.
    */
    public static void workWithQueue(Queue<Integer> q) {
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        System.out.println(q.remove());
    }

    public static void workWithStack(SimpleStack<Integer> stack) throws Exception {
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
    public static void main(String[] args) throws Exception {

        SimpleLinkedListQueue<Integer> q = new SimpleLinkedListQueue<>();
        workWithQueue(q);

        LinkedList<Integer> llist = new LinkedList<>();
        workWithQueue(llist);

        SimpleLinkedListQueue2<Integer> llist2 = new SimpleLinkedListQueue2<>();
        workWithQueue(llist2);

        ///////////////////////////////////

        JavaStackSimple<Integer> standard_stack = new JavaStackSimple<>();
        workWithStack(standard_stack);

        SimpleLinkedListStack<Integer> stack = new SimpleLinkedListStack<>();
        workWithStack(stack);

        SimpleLinkedListStack2<Integer> stack2 = new SimpleLinkedListStack2<>();
        workWithStack(stack2);

    }
}