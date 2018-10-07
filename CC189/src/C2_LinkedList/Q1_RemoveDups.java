package C2_LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Q1_RemoveDups {
    public class LinkedListNode{
        LinkedListNode next = null;
        int data;
        LinkedListNode(int data){
            this.data = data;
        }
    }
    public void removeDups(LinkedListNode node){
        Set<Integer> set = new HashSet<>();
        LinkedListNode previous = null;
        while (node != null){
            if (set.contains(node.data)){
                previous.next = node.next;
            }
            else{
                set.add(node.data);
                previous = node;
            }
            node = node.next;
        }
    }



}
