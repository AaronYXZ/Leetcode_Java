package Queue_Stack_Deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueArrayDequeDemo {

    public static void main(String[] args) {
        Queue<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
//        deque.addFirst(0);
//        deque.stream().forEach(System.out::println);
        while (!deque.isEmpty()){
            System.out.println(deque.poll());
        }
    }
}
