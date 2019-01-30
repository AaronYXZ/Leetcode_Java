package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(3);
        deque.addLast(10);
        deque.add(9);
        deque.addFirst(12);

        deque.stream().forEach(System.out::println);
    }
}
