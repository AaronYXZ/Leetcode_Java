package LinkedList;

import java.util.LinkedList;

public class LInkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");

        linkedlist.addLast("Last Item");

        linkedlist.add("Item6");
        linkedlist.add("Item2");

        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");

        System.out.println("LinkedList Content after addition: " +linkedlist);

        // Add and Remove items
        linkedlist.add(2, "Item4");
        linkedlist.remove(3);
        System.out.println(linkedlist);
        System.out.println(linkedlist.contains("Item4"));

        // Get item by index
        System.out.println(linkedlist.get(5));

        // offer / poll / peek
        System.out.println("Test offer, poll, peek method");
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.offerFirst(5);
        linkedList2.offerFirst(10);
        linkedList2.offerLast(3);
        linkedList2.offerFirst(2);
        System.out.println(linkedList2.peekFirst());
        System.out.println(linkedList2.pollFirst());
        System.out.println(linkedList2.peekFirst());
        System.out.println(linkedList2.peekLast());
        System.out.println(linkedList2.pollLast());
        System.out.println(linkedList2.peekLast());

    }
}

