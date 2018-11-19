package SlidingWindow;

import java.util.HashMap;
import java.util.Map;
/*
Q:
https://leetcode.com/problems/fruit-into-baskets/description/

Find the longest subArray with 2 kind of numbers at most

S:
https://leetcode.com/problems/fruit-into-baskets/discuss/170740/Sliding-Window
*/


public class L904_FruitIntoBasketAkALongestArrayWith2Number {
    public int totalFruit_SlidingWindow(int[] tree){
        Map<Integer, Integer> count = new HashMap<>();
        int res = 0, i = 0;
        // use i to record the index of the tree whose fruit is for basket 1,
        // use j to record the current index of the tree
        for (int j = 0; j<tree.length; j++){
            count.put(tree[j], count.getOrDefault(tree[j], 0)+1); // keep track of tree index and number of fruits
            while(count.size()>2){ // when there are more than 2 kinds of fruit, need to remove one kind of fruit, the former first fruit
                count.put(tree[i], count.get(tree[i]) - 1); //
                if (count.get(tree[i]) == 0) count.remove(tree[i]);
                i++; // move the index forward to the former second tree, also the new first tree
            }
            res = Math.max(res, j-i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] tree1 = {1,2,3,2,2};
        int[] tree2 = {3,3,3,1,2,1,1,2,3,3,4};
        int res = new L904_FruitIntoBasketAkALongestArrayWith2Number().totalFruit_SlidingWindow(tree2);
    }
}
