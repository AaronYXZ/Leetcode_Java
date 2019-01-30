package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInLinkedListDemo {

    public static void main(String[] args) {
        // offer adds item to the end of the queue
        // peek returns but doesn't remove the first item of the queue
        // poll returns and removes the first item of the queue

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(2);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
