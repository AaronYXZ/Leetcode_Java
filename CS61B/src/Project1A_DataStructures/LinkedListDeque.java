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


public class LinkedListDeque {

//    public

    public LinkedListDeque() {

    }

    //Adds an item of type T to the front of the deque.
    public void addFirst(int item) {

    }

    // Adds an item of type T to the back of the deque.
    public void addLast(int item) {

    }

    // Returns true if deque is empty, false otherwise.
    public boolean isEmpyt() {
        return false;
    }


    // Returns the number of items in the deque.
    public int size() {
        return 1;
    }

    // Prints the items in the deque from first to last, separated by a space
    public void printDeque() {

    }

    // Removes and returns the item at the front of the deque. If no such item exists, returns null
    public int removeFirst() {
        return 1;
    }

    // Removes and returns the item at the back of the deque. If no such item exists, returns null
    public int removeLast() {
        return 1;
    }

    // Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth. If no such item exists, returns null. Must not alter the deque!
    public int get(int index) {
        return 1;
    }

}

