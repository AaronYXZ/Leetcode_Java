package LinkedList;

import java.util.LinkedList;

public class LInkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " +linkedlist);

        // Add and Remove items
        linkedlist.add(2, "Item4");
        linkedlist.remove(3);
        System.out.println(linkedlist);
        System.out.println(linkedlist.contains("Item4"));

        // Get item by index
        System.out.println(linkedlist.get(5));

    }
}

