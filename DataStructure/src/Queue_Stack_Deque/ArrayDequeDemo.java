package Queue_Stack_Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(5);
        deque.offerLast(3);
        deque.offerLast(10);
        deque.offerFirst(12);

        deque.stream().forEach(System.out::println);



    }
}
