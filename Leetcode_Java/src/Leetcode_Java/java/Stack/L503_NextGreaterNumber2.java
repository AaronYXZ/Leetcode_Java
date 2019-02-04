package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

// ToDo

public class L503_NextGreaterNumber2 {
    public int[] nextGreaterElements(int[] nums){
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num:nums){
            while(!deque.isEmpty() && deque.peekFirst() < num){
                map.put(num, deque.peekFirst());
            }
            deque.offerFirst(num);

        }
        return new int[]{1,2};
    }
}
