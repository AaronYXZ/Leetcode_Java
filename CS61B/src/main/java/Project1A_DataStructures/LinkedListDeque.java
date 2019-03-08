package Project1A_DataStructures;

//https://sp18.datastructur.es/materials/proj/proj1a/proj1a

/*
Specifically, any deque implementation must have exactly the following operations:

public void addFirst(T item): Adds an item of type T to the front of the deque.
public void addLast(T item): Adds an item of type T to the back of the deque.
public boolean isEmpty(): Returns true if deque is empty, false otherwise.
public int size(): Returns the number of items in the deque.
public void printDeque(): Prints the items in the deque from first to last, separated by a space.
public T removeFirst(): Removes and returns the item at the front of the deque. If no such item exists, returns null.
public T removeLast(): Removes and returns the item at the back of the deque. If no such item exists, returns null.
public T get(int index): Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth. If no such item exists, returns null. Must not alter the deque!


Your operations are subject to the following rules:

add and remove operations must not involve any looping or recursion. A single such operation must take “constant time”, i.e. execution time should not depend on the size of the deque.
get must use iteration, not recursion.
size must take constant time.
The amount of memory that your program uses at any given time must be proportional to the number of items. For example, if you add 10,000 items to the deque, and then remove 9,999 items, the resulting size should be more like a deque with 1 item than 10,000. Do not maintain references to items that are no longer in the deque.
Implement all the methods listed above in “The Deque API” section.

In addition, you also need to implement:

public LinkedListDeque(): Creates an empty linked list deque.
public T getRecursive(int index): Same as get, but uses recursion.
You may add any private helper classes or methods in LinkedListDeque.java if you deem it necessary.
 */

import java.util.Deque;

// https://github.com/ladrift/ucb-cs61b-sp17/blob/master/proj1a/LinkedListDeque.java

public class LinkedListDeque<Item> {
    private class Node {
        Item item;
        Node prev;
        Node next;

        public Node() {
            this.item = null;
            this.prev = null;
            this.next = null;
        }

        public Node(Item item) {
            this.item = item;
            this.prev = null;
            this.next = null;
        }
    }

    private Node sentinel;
    private int size;

    public LinkedListDeque() {
        sentinel = new Node();
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public void addFirst(Item item) {
        Node node = new Node(item);
        node.prev = sentinel;
        node.next = sentinel.next;
        sentinel.next = node;
        size++;
    }

    public void addLast(Item item) {
        Node node = new Node(item);
        node.prev = sentinel.prev;
        node.next = sentinel;
        sentinel.prev = node;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        Node curr = sentinel.next;
        while (curr != sentinel) {
            System.out.print(curr.item + " ");
            curr = curr.next;
        }
    }

    public Item removeFirst() {
        Item toRemove = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        size--;
        return toRemove;
    }

    public Item removeLast() {
        Item toRemove = sentinel.prev.item;
        sentinel.next = sentinel.next.next;
        size--;
        return toRemove;
    }

    public Item get(int index) {
        Node curr = sentinel.next;
        while (index-- > 0) {
            curr = curr.next;
        }
        return curr.item;
    }

    public Item getRecursive(int i) {
        return getRecursive(i, sentinel.next);
    }

    public Item getRecursive(int i, Node curr) {
        if (i == 0) {
            return curr.item;
        }
        return getRecursive(i - 1, curr.next);
    }
}

